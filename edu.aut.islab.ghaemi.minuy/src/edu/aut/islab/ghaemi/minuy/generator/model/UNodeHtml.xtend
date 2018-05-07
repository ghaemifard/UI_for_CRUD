package edu.aut.islab.ghaemi.minuy.generator.model

import java.util.List

class UNodeHtml {
	def static String compile(UNode n)'''
<«n.type» «IF n.id != null»	id="«n.id»" «ENDIF»«IF n.classes != null» class="«n.classes»"«ENDIF»«IF n.feature != null» «n.feature» «ENDIF»«IF n.style != null» style="«n.style»"«ENDIF»>
	«n.content»
	«n.silabs.map[it.compile].join('')»
</«n.type»>
	'''
	def static String produceFinalHtml(List<String> css,List<String> jss,String code)'''
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
«FOR ii : css»
	<link type="text/css" href="«ii»" rel="stylesheet">
«ENDFOR»
«FOR ii : jss»
	<script type="text/javascript" src="«ii»"></script>
«ENDFOR»
	<title>ChangeIt</title>
</head>

<body>
	«code»
</body>

</html>
	'''
}

