package edu.aut.islab.ghaemi.minuy.generator.model

import edu.aut.islab.ghaemi.minuy.myUiDsl.Model
import edu.aut.islab.ghaemi.minuy.myUiDsl.Node
import java.util.ArrayList
import edu.aut.islab.ghaemi.minuy.myUiDsl.Body
import java.util.List

class Originate {
	def static CompileModel(Model m){
		m.bodis.compileBodies
		 
		
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