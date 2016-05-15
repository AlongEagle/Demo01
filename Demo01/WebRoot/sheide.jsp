<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>jatoolsPrinter打印</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
	.jp-page{position:relative}
	.jp-text,.jp-label,.jp-image,.jp-barcode{position:absolute;overflow:hidden}
	.jp-auto-stretch,.jp-barcode object,.jp-barcode embed{width: 100%; height: 100%;}
	.jp-paper-background{position:absolute;width:100%;height:100%;}
	.jp-comp-0{filter: none;}
</style>
<script>
function doPrint(how){
	var myDoc={
		settings:{
			paperWidth:2100,
			paperHeight:2970,
			orientation:1
		},
		marginIgnored:true,
		enableScreenOnlyClass:true,
		documents:document,
		copyrights:'杰创软件拥有版权  www.jatools.com'
	};
	var jatoolsPrinter = navigator.userAgent.indexOf('MSIE') > -1 ? document.getElementById('ojatoolsPrinter'): document.getElementById('ejatoolsPrinter');
	if(how=='打印预览...')
		jatoolsPrinter.printPreview(myDoc);
	else if(how=='打印...')
		jatoolsPrinter.print(myDoc,true);
	else
		jatoolsPrinter.print(myDoc,false);
}
</script>
</head>
<body>
<%String pank=request.getParameter("pank"); %>



<div align="center">
	<input type="button" value="打印预览..." onclick="doPrint('打印预览...')">
	<input type="button" value="打印..." onclick="doPrint('打印...')">
	<input type="button" value="打印" onclick="doPrint('打印')">
</div>
<div class="jp-page" id="page1" style="width: 210mm; height: 297mm;">
	<%-- <%= name %> --%>
	${pank }
	<img class="jp-paper-background " src="beijinfengmian.jpg">
</div>
<object id="ojatoolsPrinter" codebase="jatoolsPrinter.cab#version=10,0,7564" classid="clsid:B43D3361-D075-4BE2-87FE-057188254255" width="0" height="0">
	<embed id="ejatoolsPrinter" type="application/x-vnd.jatoolsPrinter" width="0" height="0"></embed>
</object>
</body>
</html>