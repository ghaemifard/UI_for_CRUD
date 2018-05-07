package edu.aut.islab.ghaemi.minuy.generator.model

import edu.aut.islab.ghaemi.minuy.myUiDsl.*
import edu.aut.islab.ghaemi.minuy.services.MyUiDslGrammarAccess.LiteralColorElements

class CssDefinition {
	def static String strSytle(CssStyle c){
		switch c{
			Pos:   "position: " + c.value.toString2.toLowerCase + "; "
			Clr:   "clear: " + c.value.toString2.toLowerCase + "; "
			Flt:"float: " + c.value.toString2.toLowerCase + "; "
			Disp:"display: " + c.value.toString2.toLowerCase + "; "
			VerAl:"vertical-align: " + c.value.toString2.toLowerCase + "; "
			Wid: makeWid(c)	
			H8: makeH8(c)
			Coord: makeCoord(c)
			OFlow: "overflow: " + c.value.toString2.toLowerCase + "; "
			Marg: makeMargin(c)
			Padd:makePadding(c)
			Border: "border: 1px solid " + c.value.theColor + " ; "
			BorderRad: "border-radius: " + c.value+ (c.measureType ?: "px") + " ;" 
			BackColor: "background-color:  " + c.value.theColor + " ; "
			Color: "color:  " + c.value.theColor + " ; "
			
		}
	}
	/*
	 * try{(d.rval.value%255).toString}catch(NullPointerException e){"255"} + "," + 
								  try{(d.gval.value%255).toString}catch(NullPointerException e){"255"} + "," + 
								  try{(d.bval.value%255).toString}catch(NullPointerException eee){"255"} + "," + 
								  try{((d.aval.value%100)/100).toString}catch(NullPointerException eeee){"1"} 
	 */
	def static String colorValue(Object o){
		
		switch(o){
			Rval: (o.value % 255) 
			Gval: (o.value % 255)
			Bval: (o.value % 255)
			Aval: (o.value % 100)/100.0
			default: "255"
		} + ""
	} 
	def static String theColor(colorDef d){
		 
		switch(d){
			LiteralColor: d.value.toLowerCase
			RgbaColor: "rgba(" +    d.rval.colorValue + "," + d.gval.colorValue + "," + d.bval.colorValue + "," + d.aval.colorValue  
			  + ")"
		}
	}
	 
	def static makeWid(Wid w){
		var str = "";
		if(w.value.minVal != null){
			str += "min-width: " + w.value.minVal.value+ (w.value.minVal.measureType ?: "px") + " ; ";
		}
		if(w.value.midVal != null){
			str += "width: " + w.value.midVal.value + (w.value.midVal.measureType ?: "px")  + " ; ";
		}
		if(w.value.maxVal != null){
			str += "max-width: " + w.value.maxVal.value + (w.value.maxVal.measureType ?: "px")+ " ; ";
		}
		
		str;
	}
	def static makeCoord(Coord w){
		var str = "";
		if(w.value.up != null){
			str += "up: " + w.value.up.value+ (w.value.up.measureType ?: "px") + " ; ";
		}
		if(w.value.down != null){
			str += "down: " + w.value.down.value+ (w.value.down.measureType ?: "px") + " ; ";
		}
		if(w.value.left != null){
			str += "left: " + w.value.left.value+ (w.value.left.measureType ?: "px") + " ; ";
		}
		if(w.value.right != null){
			str += "right: " + w.value.right.value+ (w.value.right.measureType ?: "px") + " ; ";
		}
		str;
	}
	
	def static makeMargin(Marg w){
		var str = "";
		if(w.value.up != null){
			str += "margin-top: " + w.value.up.value+ (w.value.up.measureType ?: "px") + " ; ";
		}
		if(w.value.down != null){
			str += "margin-bottom: " + w.value.down.value + (w.value.down.measureType ?: "px")+ " ; ";
		}
		if(w.value.left != null){
			str += "margin-left: " + w.value.left.value+ (w.value.left.measureType ?: "px") + " ; ";
		}
		if(w.value.right != null){
			str += "margin-right: " + w.value.right.value+ (w.value.right.measureType ?: "px") + " ; ";
		}
		str;
	}
	
	def static makePadding(Padd w){
		var str = "";
		if(w.value.up != null){
			str += "padding -top: " + w.value.up.value + (w.value.up.measureType ?: "px")+ " ; ";
		}
		if(w.value.down != null){
			str += "padding -bottom: " + w.value.down.value+ (w.value.down.measureType ?: "px") + " ; ";
		}
		if(w.value.left != null){
			str += "padding -left: " + w.value.left.value + (w.value.left.measureType ?: "px")+ " ; ";
		}
		if(w.value.right != null){
			str += "padding -right: " + w.value.right.value+ (w.value.right.measureType ?: "px") + " ; ";
		}
		str;
	}
	
	def static makeH8(H8 w){
		var str = "";
		if(w.value.minVal != null){
			str += "min-height: " + w.value.minVal.value+ (w.value.minVal.measureType ?: "px") + " ; ";
		}
		if(w.value.midVal != null){
			str += "height: " + w.value.midVal.value+ (w.value.midVal.measureType ?: "px") + " ; ";
		}
		
		if(w.value.maxVal != null){
			str += "max-height: " + w.value.maxVal.value+ (w.value.maxVal.measureType ?: "px") + " ; ";
		}
		
		str;
	}
	
	def static String toString2(PosVals p){
		switch p{
			case ABSOLUTE: "absolute"
			case FIXED: "fixed"
			case RELATIVE: "relative"
			case STEAKY: "steaky"
			case STATIC: "static"
		}
	}
	def static String toString2(OFlowVals p){
		switch p{
			case AUTO: "auto"
			case HIDDEN: "hidden"
			case SCROLL: "scroll"
			case VISIBLE: "visible" 
		}
	}
	def static String toString2(FltVals p){
		switch p{
			case LEFT: "left"
			case RIGHT: "right"
			case START: "start"
			case END: "end"
			case NONE: "none"
		}
	}
	def static String toString2(ClrVals p){
		switch p{
			case LEFT: "left"
			case RIGHT: "right"
			case BOTH: "both" 
			case NONE: "none" 
		}
	}
	def static String toString2(DispVals p){
		switch p{
			case BLOCK: "block"
			case IN_BL: "inline-block"
			case INLINE: "inline"
			case TABLE: "table"
			case NONE: "none"
			
		}
	}
	def static String toString2(VeralVals p){
		switch p{
			case TOP: "top"
			case CENTER: "middle"
			case DOWN: "bottom"
		}
	}
//	def static String toString2(PosVals p){
//		switch p{
//			
//		}
//	}
	
	
	
}