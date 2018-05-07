package edu.aut.islab.ghaemi.minuy.generator.model

import edu.aut.islab.ghaemi.minuy.myUiDsl.Model
import edu.aut.islab.ghaemi.minuy.myUiDsl.Node
import java.util.ArrayList
import edu.aut.islab.ghaemi.minuy.myUiDsl.Body
import java.util.List
import edu.aut.islab.ghaemi.minuy.myUiDsl.Accessory
import edu.aut.islab.ghaemi.minuy.myUiDsl.InnerTypeArray
import org.eclipse.emf.common.util.URI
import org.eclipse.xtend.lib.annotations.Accessors
import edu.aut.islab.ghaemi.minuy.myUiDsl.Head
import org.eclipse.emf.ecore.resource.Resource
import java.util.HashMap
import java.util.Map
import edu.aut.islab.ghaemi.minuy.myUiDsl.CssStyle
import edu.aut.islab.ghaemi.minuy.myUiDsl.Pos
import edu.aut.islab.ghaemi.minuy.myUiDsl.Clr
import edu.aut.islab.ghaemi.minuy.myUiDsl.Flt
import edu.aut.islab.ghaemi.minuy.myUiDsl.Disp
import edu.aut.islab.ghaemi.minuy.myUiDsl.VerAl

class OriginateTwo {
	@Accessors(PUBLIC_SETTER)
	var static URI uri = null;
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	var static Resource res;
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	val static cssz = new ArrayList<String>;
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	val static jssz = new ArrayList<String>;
	val static Map<String,Map<String,UNode>> map = new HashMap<String,Map<String,UNode>>;
 	def static CompileModel(Model m){
 		m.heads.loadImports
		m.bodis.compileBodies 
		if(m.accessories.size > 0){
			map.get(uri.toString).forEach[p1, p2|
				replaceUNodeWithFile(p1,UNode.root.silabs,p2);
			]
		}
		m.accessories.compileAccessory 
		
	} 
	
	def static replaceUNodeWithFile(String s,List<UNode> ls,UNode root){
		for(i: ls.size>..0){
			if(ls.get(i).value.equals(s)){
				ls.remove(ls.get(i))
				ls.add(i,root);
			}
		}
		ls.filter[!it.apart].forEach[
			replaceUNodeWithFile(s,it.silabs,root);
		]
	} 
	
	def static loadImports(List<Head> ls){
		 val m = new HashMap<String,UNode>; 
		 map.put(uri.toString,m);
		 val temp = uri; 
		 ls.forEach[
		 	if(it.headType  == '_CSS'){
		 		cssz.add(it.fileName)
		 	}else if(it.headType  == '_JS'){
		 		jssz.add(it.fileName)
		 	}else{
		 		if(uri != null){ 
		 			println(uri.toString);
		 			val u = URI.createURI( uri.toString.substring(0,uri.toString.lastIndexOf("/")) + "/" + it.fileName + ".myui");
		 			uri = u;
		 			println(u.toString);
		 			val r = res.resourceSet.getResource(u,true);
		 			r.allContents.filter(Model).forEach[OriginateTwo.CompileModel(it); ]
		 			m.put(it.headType,UNode.root); 
		 			UNode.root.apart = true;
		 			UNode.clearUnode
		 		}
		 	} 
		 ]
		 uri = temp;
	}
	
	
	
	
	def static fillList(String v,List<UNode> res,List<UNode> inp){
		inp.filter[!it.apart].forEach[
			if(v.equals(it.value)){ 
				res.add(it)
			} 
			fillList(v,res,it.silabs);
		]
	}
	//  ( OFlow | Marg | Padd | Border | BorderRad)
	
	
	def static compileAccessory(List<Accessory> ls){
			ls.forEach[
				val String content = try{ it?.text?.value;} catch(NullPointerException e){""}
				val String type = try{ it?.type?.value.theStr;} catch(NullPointerException e){"Div"}
				val String tid = try{ it?.clazz?.clazzes?.theId;} catch(NullPointerException e){""}
				val String clazz = try{ it?.clazz?.clazzes?.clazz.map[it?.cfClazz].join(', ');} catch(NullPointerException e){""}
				val String innerF = try{ it?.feature?.value;} catch(NullPointerException e){""}
				
				val sts = new ArrayList<String>;
				
				it?.style?.styles?.forEach[
					sts.add(CssDefinition.strSytle(it));
				]
				
				val list = new ArrayList<UNode>;
				if(UNode.root.value.equals( it.left.name.toString)){
					list.add(UNode.root)
				}
				fillList(it.left.name + "",list,UNode.root.silabs);
				for(i : 0..<list.size){
					var m = list.get(i);
					m.id = tid
					m.content = content
					m.type = type
					m.classes = clazz
					if(innerF?.length > 2)
						m.feature = innerF.substring(1,innerF.length-1);
					m.style = sts.join(' ');
					
				}
			]
	}
	
	def static String theStr(InnerTypeArray aa){
		switch(aa)
		{
			case DIV: "div"
			case PARA: "p"
			case TABLE: "table"
			case TR: "tr"
			case TD: "td"
			case INPUT: "input"
		    case IMG: "img"
			 
			default:"Div"
		}
	}
	
	def static tostring(Node n) {
		n.name.toString;
	}

	def static makeNode(Body b) {
		val arr = new ArrayList<UNode>;
		b.right.forEach [
			val n = new UNode(it.name.toString);
			arr.add(n);
		]
		UNode.addToNode(arr, b.name.tostring);
	} 
	
	def static makeNode(Body b,boolean bs) {
		val arr = new ArrayList<UNode>;
		b.right.forEach [
			val n = new UNode(it.name.toString,bs);
			arr.add(n);
		]
		UNode.addToNode(arr, b.name.tostring,bs);
	} 
	
	def static compileBodies(List<Body> ls) {
		UNode.root = new UNode(ls.get(0).name.tostring);
		
		ls.forEach [ 
			if (it.selfRepeat == null) {
				it.makeNode
			} else {
				 if (it.selfRepeat.vertical) {
				 	 for(i : 1..<it.selfRepeat.number) {
				 		it.makeNode(true)
				 	}
				 }else{
				 	val cl = new ArrayList<Node>(it.right);
				 	val str = it.right.map[it.name.toString+""].join(',');
				 	var str2 = str; 
				 	val left = it.name.tostring;
				 	for(i : 1..<it.selfRepeat.number) {
				 		str2 = str2.replaceAll(it.name.tostring,str);
				 	}
				 	
				 	val arr = new ArrayList<UNode>;
				 	str2.split(',').filter[!it.equals(left)].forEach[
				 		val n = new UNode(it);
				 		arr.add(n);
				 	]
				 	UNode.addToNode(arr, left); 
				 }
			}
		] 
	}
}