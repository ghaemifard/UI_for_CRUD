package edu.aut.islab.ghaemi.minuy.generator.model

import java.util.List
import java.util.ArrayList
import javax.xml.ws.soap.AddressingFeature.Responses
import org.eclipse.xtend.lib.annotations.Accessors
import edu.aut.islab.ghaemi.minuy.myUiDsl.Model
import edu.aut.islab.ghaemi.minuy.myUiDsl.Node
import edu.aut.islab.ghaemi.minuy.myUiDsl.Body

class UNode {
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	var static UNode root = null;
	@Accessors(PUBLIC_GETTER)
	var List<UNode> silabs = new ArrayList<UNode>;
	@Accessors(PUBLIC_GETTER)
	val static List<UNode> leafs = new ArrayList<UNode>;
	@Accessors(PUBLIC_GETTER)
	var String value = null;
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	var String id = null;
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	var String content = null;
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	var String classes = null;
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	var String type = "DIV";
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	var String feature = null;
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	var String style = null;
	@Accessors(PUBLIC_SETTER,PUBLIC_GETTER)
	var boolean apart = false;
	
	def static clearUnode(){
		root = null;
		leafs.clear
	}
	 
	def static addToNode(List<UNode> ls,String tar){
		val list = new ArrayList<UNode>;
		leafs.filter[
			it.value == tar
		].forEach[it.silabs.addAll(ls);list.add(it)]
		leafs.removeAll(list);
	}
	new(String v){
		value = v;
		leafs.add(this);
	}
	
	def static addToNode(List<UNode> ls,String tar,boolean s){
		val list = new ArrayList<UNode>;
		leafs.filter[
			it.value == tar
		].forEach[it.silabs.addAll(ls);list.add(it)]
		leafs.removeAll(list);
		leafs.addAll(ls); 
	}
	new(String v,boolean s){
		value = v; 
	}
	
	
	
	def String rehsteh(){
		value + "{
	" + silabs.map[it.rehsteh].join(',') +
	"
}" 
	}
	
	
	
}