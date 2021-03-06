/*
 * generated by Xtext
 */
package de.wbg.generator

import de.wbg.ExceptionGen
import de.wbg.ExtraMethodsGen
import de.wbg.NodeGen
import de.wbg.ScannerGen
import de.wbg.StringClasses.ChainString
import de.wbg.StringClasses.ChainStringKey
import de.wbg.StringClasses.ChainStringKeyRef
import de.wbg.StringClasses.ChainStringMany
import de.wbg.StringClasses.ChainStringMaybe
import de.wbg.StringClasses.ChainStringOr
import de.wbg.StringClasses.ChainStringReadOver
import de.wbg.StringClasses.ChainStringValue
import de.wbg.dTDSL.Abstract
import de.wbg.dTDSL.DTDSL
import de.wbg.dTDSL.ObjectAttribute
import de.wbg.dTDSL.ObjectDescription
import de.wbg.dTDSL.ObjectDescriptionInner
import de.wbg.dTDSL.ObjectMany
import de.wbg.dTDSL.ObjectMaybe
import de.wbg.dTDSL.ObjectNext
import de.wbg.dTDSL.ObjectNode
import de.wbg.dTDSL.StringComplex
import de.wbg.dTDSL.StringDescription
import de.wbg.dTDSL.StringDescriptionInVariable
import de.wbg.extra.ChainMaybe
import de.wbg.extra.ChainMethodsInner
import de.wbg.extra.ChainMethodsInnerObjectAttribute
import de.wbg.extra.ChainMethodsInnerObjectMany
import de.wbg.extra.ChainMethodsInnerObjectMaybe
import de.wbg.extra.ChainMethodsInnerObjectNext
import de.wbg.extra.ChainMethodsInnerObjectNode
import de.wbg.extra.ObjectMaybeAttribute
import de.wbg.extra.ObjectMaybeNext
import de.wbg.extra.ObjectMaybeNode
import java.util.ArrayList
import java.util.LinkedList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import de.wbg.dTDSL.StringDescriptionInner
import java.util.HashMap

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class DTDSLGenerator implements IGenerator {
	
	var needGetInstanceGenerated = false;
	var LinkedList<ChainMaybe> objectMaybeChain;
	var LinkedList<ChainMethodsInner> methodsInnerChain;
	var nextWillBeSet = false;
	var ArrayList<String> methodsNameForNextRule = new ArrayList<String>()
	var generateStringFeatures = false;
	var needStringKeyStore = false;
	var needStringValueStore = false;
	var generateObjectFeatures = false;
	var LinkedList<ChainString> chainString;
	var HashMap<String, Object> keyContainer;
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {

		needGetInstanceGenerated = false;
		var nodeGen = new NodeGen()
		var exceptionGen = new ExceptionGen()
		this.initObjectMaybeChain();
		this.initMethodsInnerChain();
		this.initChainString();
		this.keyContainer = new HashMap()

		fsa.generateFile('de/wbg/ddtdsl/Node.java', nodeGen.generateNode)
		fsa.generateFile('de/wbg/ddtdsl/Head.java', nodeGen.generateHead)
		fsa.generateFile('de/wbg/ddtdsl/Attribute.java', nodeGen.generateAttribute)
		fsa.generateFile('de/wbg/ddtdsl/Element.java', nodeGen.generateElement)

		fsa.generateFile('de/wbg/ddtdsl/ParserException.java', exceptionGen.exceptionGenerator)
		
		var sf = resource.allContents.toIterable.filter(StringDescription)
		if (sf.length > 0)
		{
			generateStringFeatures = true;
		}
		
		var of = resource.allContents.toIterable.filter(ObjectDescription)
		if (of.length > 0)
		{
			generateObjectFeatures = true;
		}

		for (model: resource.allContents.toIterable.filter(DTDSL))
		{
			//extra Durchlauf f??r needGetInstanceGenerated (damit die imports generiert werden)
			model.compile();
		}

		if (generateStringFeatures)
		{
			var scannerGeg = new ScannerGen();
			fsa.generateFile('de/wbg/ddtdsl/SimpleScanner.java', scannerGeg.generateScanner);
		}
		

		for (model: resource.allContents.toIterable.filter(DTDSL))
		{
			fsa.generateFile('de/wbg/ddtdsl/' + model.parserName + '.java', 
				model.compile	
			);	
		}
	}
	
	def CharSequence compile(DTDSL model)
	{
		var ret = ''''''
		
		ret += '''
		package de.wbg.ddtdsl;
		
		??IF generateObjectFeatures??
		import java.lang.reflect.Field;
		??ENDIF??
		import java.util.ArrayList;
		??IF (needGetInstanceGenerated)??
		import java.util.LinkedList;
		import java.lang.reflect.Array;
		??ENDIF??
??????		??IF needGetInstanceGenerated || needStringKeyStore || needStringValueStore??
		import java.util.HashMap;
??????		??ENDIF??
		
		class ??model.parserName.toFirstUpper?? {
			
			private Head headNode;
			private Element actualNode;
			??IF nextWillBeSet??
			private Element prev;
			??ENDIF??
			??IF generateStringFeatures??
			private SimpleScanner scanner;
			??IF needStringKeyStore??
			private HashMap<String, Node> stringKeyVariables;
			??ENDIF??
			??IF needStringValueStore??
			private HashMap<String, String> stringValueVariables;
			??ENDIF??
			??ENDIF??
			private ArrayList<Integer> visited;
			private HashMap<Integer, Node> allObjectNodes;
			
			public ??model.parserName.toFirstUpper??()
			{
				
			}
			
			public Head parse(Object o)
			{
				this.headNode = new Head("HEAD");
				this.actualNode = this.headNode;
				this.visited = new ArrayList<>();
				??IF generateStringFeatures??
				this.scanner = new SimpleScanner();
				??IF needStringKeyStore??
				this.stringKeyVariables = new HashMap<>();
				??ENDIF??
				??IF needStringValueStore??
				this.stringValueVariables = new HashMap<>();
				??ENDIF??
				??ENDIF??
				this.allObjectNodes = new HashMap<>();
				//model.start
				try {
					int nextVisit = System.identityHashCode(o);
					this.visited.add(nextVisit);
					parse??model.start.begin.name??(o, actualNode);
				}
				catch (Exception e)
				{
					System.err.println(e.getMessage());
					//e.printStackTrace();
				}
				
				return headNode;
			}
			
		'''
		
		//ObjectObjects
		for (d: model.objDescription)
		{
			ret += compileMethods(d)
			//alle Fields innerhalb des Objektes
			if (d instanceof ObjectDescription) {ret += d.compileMethodsInner}
		}
		
		//StringObjects
		for (v: model.eResource.allContents.toIterable.filter(StringDescription))
		{
			ret += compileStringMethods(v)
		}
		
		//String or-components
		for (v: model.eResource.allContents.toIterable.filter(StringDescriptionInVariable))
		{
//			ret += '''	//generate methode for ??(v.eContainer as StringDescription).name + "/" + v.name??
//			
//			'''
			ret += compileStringOrOption(v)
		}
		
		//String maybe-methods
		for (v: model.eResource.allContents.toIterable.filter(StringComplex))
		{
			if (v.maybe != null)
			{
				ret += compileStringManyMethode(v)
			}
		}
		
		if (needGetInstanceGenerated)
		{
			var generator = new ExtraMethodsGen
			ret += generator.generateGetInstance 
		}
		
		ret += '''
}'''
		
		ret
	}

//-----------------------------------------  String  -----------------------------------------
	def CharSequence compileStringManyMethode(StringComplex v)
	{
		var StringDescription sDescription = this.goUpToStringDescription(v)
		var ret = '''	private void parseString??sDescription.name??Maybe(Element n) throws Exception
	{
		
	}
	'''
		
		
		
		return ret
	}
	
	def CharSequence compileStringOrOption(StringDescriptionInVariable d)
	{
		var ret = '''	private void parse??(d.eContainer as StringDescription).name??Option??d.name.toFirstUpper??(Element n) throws Exception
	{
		Node nodeForValue = new Node("none");
		'''

		//parse option and store it to parsedOptions
		for (var int z = 0; z < d.description.size; z++)
		{
			var i = d.description.get(z)
			for (handler: this.chainString)
			{
				if (handler.handle(z, i))
				{
					ret += handler.returnValue
				}
			}
		}
		
		ret += '''	}
			'''
		
	}
	
	def CharSequence compileStringMethods(StringDescription d)
	{
		println("compileStringMethodsInner")
		var ret = 
			'''	private void parse??d.name??(Object o, Element n) throws Exception
	{
		String s = (String) o;
		scanner.setScanString(s);
		
		Node nodeForValue = new Node("none");
		
		'''

		for (var int z = 0; z < d.description.size; z++)
		{
			var i = d.description.get(z)
			for (handler: this.chainString)
			{
				if (handler.handle(z, i))
				{
					ret += handler.returnValue
				}
			}
		}
		
		ret += '''	}
		
		'''
		
		ret
	}
	
	
//-----------------------------------------  Object  -----------------------------------------
	def CharSequence compileMethodsInner(ObjectDescription d)
	{
		var ret = ''''''
		
		for (i: d.description)
		{
			for (entry: methodsInnerChain)
			{
				if (entry.handle(d, i))
				{
					ret += entry.returnValue
				}
			}
		}	
		
		ret
	}
	
	def CharSequence compileMethods(Abstract d)
	{
		var ret = ''''''
		
		if (d instanceof ObjectDescription) 
		{
			
			ret+=
			'''	private void parse??d.name??(Object o, Element n) throws Exception
	{
??????		int nextVisit = System.identityHashCode(o);
??????		if (this.visited.contains(nextVisit))
??????		{
??????			return;
??????		}
??????		else
??????		{
??????			this.visited.add(nextVisit);
??????		}
	
		Node newNode = new Node(n.getNameForNode());
		newNode.setName("??d.name??");
		newNode.setOriginalHashCode(this.visited.get(this.visited.size()-1));
		this.allObjectNodes.put(this.visited.get(this.visited.size()-1) ,newNode);
		newNode.setParent(n);
		n.addChild(newNode);
	'''
	for (i: d.description)
		{
			ret +=
			'''		//{Element copy = n.copy();
		try 
		{
		??if (i instanceof ObjectAttribute)
		{
			'''parse??d.name.toFirstUpper??Attribute??i.attributes.toFirstUpper ??(o, ??i.argument??);''' 
		}
		else if (i instanceof ObjectNext)
		{
			''' 	Node parent = new Node(n.getId());
	parent.setNodeNumber(n.getNodeNumber());
	parent.setAttributeNumber(n.getAttributeNumber());
	parse??d.name.toFirstUpper????i.objectDesription.name.toFirstUpper??(o, parent);
	
	for (Element ch : parent.getChildren())
	{
		ch.setParent(n);
		n.addChild(ch);
		n.increaseNodeNumber();
		newNode.setNext(ch);
	}
	
	'''
//			 parse??d.name.toFirstUpper????i.objectDesription.name.toFirstUpper??(o, ??i.argument??);
		} 
		else if (i instanceof ObjectNode)
		{
			'''parse??d.name.toFirstUpper????i.attributes.toFirstUpper??(o, ??i.argument??);'''
		}
		else if (i instanceof ObjectMaybe)
		{
			this.compileMethodMaybeCall(i, d)
		}
		else if (i instanceof ObjectMany)
		{
			this.compileMethodeManyCall(i, d)
		}??
			''' 
			
				ret+=
			'''		}
		catch (ParserException e)
		{
			System.err.println(e.getMessage());
			newNode.setParent(null);
			n.removeChild(newNode);
		}
		
		actualNode = n;
	
			'''		
			
		}
		ret+= '''
}
		
		'''	
		
		}
			
		ret
	}
	
	def compileMethodeManyCall(ObjectMany many, ObjectDescription description) 
	{
		var ret = ''''''
		
		var i = many.option
		
		if (i instanceof ObjectAttribute)
		{
			ret += 
			'''	Field f = o.getClass().getDeclaredField("??i.attributes??");
	f.setAccessible(true);
	Object next = (Object) f.get(o);
	Head manyHead = new Head("MANYHEAD");
	
	if (next.getClass().isArray())
	{
		for (int index = 0; index < Array.getLength(next); index++)
		{
			parseMany??description.name.toFirstUpper??Attribute??i.attributes.toFirstUpper??(Array.get(next ,index), manyHead);
		}
	}
	else if (next instanceof ArrayList)
	{
		ArrayList al = (ArrayList)next;
		for (int index = 0; index < al.size(); index++)
		{
			Object obj = al.get(index);
			parseMany??description.name.toFirstUpper??Attribute??i.attributes.toFirstUpper??(obj, manyHead);
		}
	}
	else if (next instanceof LinkedList)
	{
		LinkedList al = (LinkedList)next;
		for (int index = 0; index < al.size(); index++)
		{
			Object obj = al.get(index);
			parseMany??description.name.toFirstUpper??Attribute??i.attributes.toFirstUpper??(obj, manyHead);
		}
	}
	else if (next instanceof HashMap)
	{
		HashMap hashMap = (HashMap) next;
		
		for (Object entry : hashMap.keySet())
		{
			Object valueForEntry = hashMap.get(entry);
			
			//entry is primitiv
			//=> Node with key -> Attribute with value
			Node node = new Node(manyHead.getNameForNode());
			node.setOriginalHashCode(this.visited.get(this.visited.size()-1));
			this.allObjectNodes.put(this.visited.get(this.visited.size()-1) ,newNode);
			node.setKey(true);
			node.setValue(String.valueOf(entry));
			node.setName(entry.getClass().toString().replace("class ", ""));
			Attribute attrib = new Attribute(node.getNameForAttribute());
			attrib.setName("??i.attributes??");
			attrib.setValue(hashMap.get(entry));
			attrib.setType(hashMap.get(entry).getClass());
			
			node.addChild(attrib);
			attrib.setParent(node);
			
			manyHead.addChild(node);
			node.setParent(manyHead);
		}
	}

	for (Element el: manyHead.getChildren())
	{
		newNode.addChild(el);
		el.setParent(newNode);
	}
			'''
		}
		else if (i instanceof ObjectNext)
		{
			ret += '''//many Next
			'''
			if (i.objectDesription != null)
			{
				var String call;
				if (i.attribute.id != null )
				{
					call = i.attribute.id
				}
				ret += '''
				Field f = o.getClass().getDeclaredField("??call??");
				f.setAccessible(true);
				Object next = (Object) f.get(o);
				int nextVisit = System.identityHashCode(next);
				if (this.visited.contains(nextVisit))
				{
					Node actNode = this.allObjectNodes.get(this.visited.get(this.visited.size()-1));
					Node circleNode = this.allObjectNodes.get(nextVisit);
					actNode.setNext(circleNode);
					circleNode.setPrevious(actNode);
					return;
				}
				else
				{
					this.visited.add(nextVisit);
				}
				Head manyHead = new Head("MANYHEAD");
				
				//String instance = this.getInstance(next);
				if (next instanceof Object[])
				{
					for (int index = 0; index < ((Object[])next).length; index++)
					{
						parse??i.objectDesription.name.toFirstUpper??(((Object[])next)[index], manyHead);
					}
				}
				else if (next instanceof ArrayList)
				{
					ArrayList al = (ArrayList)next;
					for (Object obj: al)
					{
						parse??i.objectDesription.name.toFirstUpper??(obj, manyHead);
					}
				}
				else if (next instanceof LinkedList)
				{
					LinkedList al = (LinkedList)next;
					for (Object obj: al)
					{
						parse??i.objectDesription.name.toFirstUpper??(obj, manyHead);
					}
				}
				else if (next instanceof HashMap)
				{
					HashMap hashMap = (HashMap) next;
					
					for (Object entry : hashMap.keySet())
					{
??????						//Attribute
						Object valueForEntry = hashMap.get(entry);
						
						parse??i.objectDesription.name.toFirstUpper??(valueForEntry, manyHead);
						Node act = manyHead.getNodeByName("MANYHEAD.node"+(manyHead.size()-1));
						act.setKey(true);
						act.setValue(String.valueOf(entry));
						act.setName(entry.getClass().toString().replace("class ", ""));
					}
				}
				
				Element setNext = null;
				for (Element el : manyHead.getChildren())
				{
					n.addChild(el);
					el.setParent(n);
					if (setNext != null)
					{
						setNext.setNext(el);
					}
					setNext = el;
				}
				'''
				
			}
		}
		else if (i instanceof ObjectNode)
		{
			ret += '''
				Field f = o.getClass().getDeclaredField("??i.attributes??");
				f.setAccessible(true);
				Object next = (Object) f.get(o);
				
				int nextVisit = System.identityHashCode(next);
				if (this.visited.contains(nextVisit))
				{
					Node actNode = this.allObjectNodes.get(this.visited.get(this.visited.size()-1));
					Node circleNode = this.allObjectNodes.get(nextVisit);
					actNode.setNext(circleNode);
					circleNode.setPrevious(actNode);
					return;
				}
				else
				{
					this.visited.add(nextVisit);
				}
				
				Head manyHead = new Head("MANYHEAD");
				
				if (next instanceof Object[])
				{
					Object[] array = (Object[]) next;
					for (int index = 0; index < array.length; index++)
					{
						parse??i.inner.name.toFirstUpper??(array[index], manyHead);
					}
				}
				else if (next instanceof ArrayList)
				{
					ArrayList al = (ArrayList)next;
					for (Object obj: al)
					{
						parse??i.inner.name.toFirstUpper??(obj, manyHead);
					}
				}
				else if (next instanceof LinkedList)
				{
					LinkedList al = (LinkedList)next;
					for (Object obj: al)
					{
						parse??i.inner.name.toFirstUpper??(obj, manyHead);
					}
				}
				else if (next instanceof HashMap)
				{
					HashMap hashMap = (HashMap) next;
					
					for (Object entry : hashMap.keySet())
					{
						
??????						//Attribute
						Object valueForEntry = hashMap.get(entry);
						
						parse??i.inner.name.toFirstUpper??(valueForEntry, manyHead);
						Node act = manyHead.getNodeByName("MANYHEAD.node"+(manyHead.size()-1));
						act.setKey(true);
						act.setValue(String.valueOf(entry));
						act.setName(entry.getClass().toString().replace("class ", ""));
					}
				}
				
				for (Element el : manyHead.getChildren())
				{
					newNode.addChild(el);
					el.setParent(newNode);
				}
			'''	
		}
		
		ret += '''
		if (newNode.getTotalLength() == 1)
		{
			//remove newNode
			newNode.setParent(null);
			n.removeChild(newNode);
		}'''
		
		ret
	}


	def CharSequence compileMethodMaybeCall(ObjectMaybe i, ObjectDescription d)
	{
		if (i.description != null)
		{
			var inner = i.description;
			var CharSequence rValue;
			for (entry: this.objectMaybeChain)
			{
				if (entry.handle(inner, d, i))
				{
					rValue = entry.returnValue;
				}
			}
			
			rValue
		}
		else
		{
				//i.option ist gesetzt
				'''parse??i.option.name.toFirstUpper??();'''
				
		}
	}
	
	def CharSequence compileMany(ObjectMany m)
	{
		'''		//many
		'''
	}
	
	def CharSequence compile(ObjectNode n)
	{
		var ret = ''' //Node
		'''
		
		ret += '''
		try
		{
			Field f = o.getClass().getDeclaredField("??n.attributes??");
			f.setAccessible(true);
			Object next = (Object) f.get(o);
			
			int nextVisit = System.identityHashCode(next);
			if (this.visited.contains(nextVisit))
			{
				Node actNode = this.allObjectNodes.get(this.visited.get(this.visited.size()-1));
				Node circleNode = this.allObjectNodes.get(nextVisit);
				actNode.setNext(circleNode);
				circleNode.setPrevious(actNode);
				return;
			}
			else
			{
				this.visited.add(nextVisit);
			}
			
			parse??n.inner.name.toFirstUpper??(next, n);
		}
		catch(NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
		{
			throw new ParserException("Error while parsing ??n.attributes?? in ??n??");
		}
		catch (ParserException e)
		{
			throw e;
		}
					'''
		ret
	}
	
	def CharSequence compile(ObjectAttribute a)
	{
		var ret = '''		//Attribute
		'''
		
//		if (a.inner == null) {
			ret += '''		//inner == null
??????//??a.types?? ??a.attributes?? as ;
			'''
			
		
			ret += '''		int oldAttributeNumber = n.getAttributeNumber();
	try {

		Field f = o.getClass().getDeclaredField("??a.attributes??"); //NoSuchFieldException
		f.setAccessible(true);
??????		??a.types?? iWantThis = (??a.types??) f.get(o); //IllegalAccessException
		Object iWantThis = f.get(o); 
	
		Attribute valueNode = new Attribute("attribute" + n.increaseAttributeNumber());
		valueNode.setType(iWantThis.getClass());
	
		valueNode.setName("??a.attributes??");
		valueNode.setValue(iWantThis);
??????		valueNode.setType("value");
		
		valueNode.setParent(n);
		n.getChildren().add(valueNode);
	}
	catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
	{
		//e.printStackTrace();
		n.setAttributeNumber(oldAttributeNumber);
		throw new ParserException("Error while parsing : ??a.attributes??");
	}
'''

//		}

		ret
	}
	
	def CharSequence compile(ObjectNext n)
	{
		this.nextWillBeSet = true;
		'''		//Next: 
		??if (n.attribute.code == null)
		{
			var ret = '''//kein code: ??n.attribute.id??
			'''
			ret += '''
			try {
				Field f = o.getClass().getDeclaredField("??n.attribute.id??"); //NoSuchFieldException
				f.setAccessible(true);
				Object next = (Object) f.get(o); //IllegalAccessException
			
			int nextVisit = System.identityHashCode(next);
			if (this.visited.contains(nextVisit))
			{
				Node actNode = this.allObjectNodes.get(this.visited.get(this.visited.size()-1));
				Node circleNode = this.allObjectNodes.get(nextVisit);
				actNode.setNext(circleNode);
				circleNode.setPrevious(actNode);
				return;
			}
			else
			{
				this.visited.add(nextVisit);
			}
??????				this.prev = newNode;   
			
				parse??n.objectDesription.name??(next, n);
??????				actualNode = (Element)next;
				actualNode = n;
			}
			catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NullPointerException e)
			{
				throw new ParserException("Error while parsing ??n.attribute.id??");
			}

			'''
			ret
		}
		else
		{
			'''//code: ??n.attribute.code??'''
		}
		??
		'''	
	}
	
	def CharSequence getArgument(ObjectDescriptionInner d)
	{
		if (d instanceof ObjectNext)
		{
			'''n'''
		}
		else if (d instanceof ObjectAttribute)
		{
			'''newNode'''
		} 
		else
		{
			'''newNode'''
		}
	}
	
	//------------------------------ init MessageHandler ------------------------------
	def void initObjectMaybeChain()
	{
		this.objectMaybeChain = new LinkedList<ChainMaybe>();
		this.objectMaybeChain.add(new ObjectMaybeAttribute);
		this.objectMaybeChain.add(new ObjectMaybeNode);
		this.objectMaybeChain.add(new ObjectMaybeNext);
	}
	
	def initMethodsInnerChain() 
	{
		this.methodsInnerChain = new LinkedList<ChainMethodsInner>()
		this.methodsInnerChain.add(new ChainMethodsInnerObjectAttribute)
		this.methodsInnerChain.add(new ChainMethodsInnerObjectMany(this))
		this.methodsInnerChain.add(new ChainMethodsInnerObjectMaybe(this))
		this.methodsInnerChain.add(new ChainMethodsInnerObjectNext)
		this.methodsInnerChain.add(new ChainMethodsInnerObjectNode)
	}
	
	def initChainString()
	{
		this.chainString = new LinkedList<ChainString>()
		this.chainString.add(new ChainStringKey(this))
		this.chainString.add(new ChainStringKeyRef(this))
		this.chainString.add(new ChainStringReadOver(this))
		this.chainString.add(new ChainStringValue(this))
		this.chainString.add(new ChainStringOr(this))
		this.chainString.add(new ChainStringMaybe(this));
		this.chainString.add(new ChainStringMany(this));
	}
	
	def StringDescription goUpToStringDescription(Object o)
	{
		if (o instanceof StringDescription)
		{
			return (o as StringDescription)	
		}
		else if (o instanceof StringComplex)
		{
			return this.goUpToStringDescription((o as StringComplex).eContainer)
		}
		else if (o instanceof StringDescriptionInVariable)
		{
			return this.goUpToStringDescription((o as StringDescriptionInVariable).eContainer)
		}		
		else if (o instanceof StringDescriptionInner)
		{
			return this.goUpToStringDescription((o as StringDescriptionInner).eContainer)
		}
	}
	
	//------------------------------ Getters / Setters ------------------------------
	def void setGenerateStringFeatures(boolean value)
	{
		this.generateStringFeatures = value
	}
	
	def boolean getGenerateStringFeatures()
	{
		return this.generateStringFeatures
	}
	
	def void setNeedStringKeyStore(boolean value)
	{
		this.needStringKeyStore = value
	}
	
	def boolean getNeedStringKeyStore()
	{
		return this.needStringKeyStore
	}
	
	def void setNeedStringValueStore(boolean value)
	{
		this.needStringValueStore = value;
	}
	
	def boolean getNeedStringValueStore(boolean value)
	{
		return this.needStringValueStore;
	}
	
	def boolean getNeedGetInstanceGenerated()
	{
		this.needGetInstanceGenerated
	}
	
	def void setNeedGetInstanceGenerated(boolean value)
	{
		this.needGetInstanceGenerated = value
	}
	
	def HashMap<String, Object> getKeyContainer()
	{
		return this.keyContainer;
	}
}
