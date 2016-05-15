<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<html>
<head>


<%
		String dangantype=request.getParameter("dangantype");
		String niandu=request.getParameter("niandu");
		String townid=request.getParameter("townid");
		String zhenglidate=request.getParameter("zhenglidate");
		String code=request.getParameter("code");
		String danghao=request.getParameter("danghao");


 %>
<title>jatoolsPrinter打印</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
	.jp-page{position:relative}
	.jp-text,.jp-label,.jp-image,.jp-barcode{position:absolute;overflow:hidden}
	.jp-auto-stretch,.jp-barcode object,.jp-barcode embed{width: 100%; height: 100%;}
	.jp-paper-background{position:absolute;width:100%;height:100%;}
	.jp-comp-0{zoom: 1; filter:  }
	.jp-comp-1{height: 42px; width: 202px; text-align: center; left: 329px; z-index: 101; top: 192px}
	.jp-comp-2{height: 29px; width: 59px; left: 113px; z-index: 102; top: 672px}
	.jp-comp-3{height: 27px; width: 35px; left: 199px; z-index: 103; top: 671px}
	.jp-comp-4{height: 32px; width: 41px; left: 290px; z-index: 104; top: 670px}
	.jp-comp-5{height: 26px; width: 16px; left: 354px; z-index: 105; top: 671px}
	.jp-comp-6{height: 42px; width: 179px; text-align: center; left: 541px; z-index: 106; top: 754px}
	.jp-comp-7{height: 30px; width: 29px; left: 214px; z-index: 107; top: 765px}
	.jp-comp-8{height: 21px; width: 35px; left: 276px; z-index: 108; top: 764px}
	.jp-comp-9{height: 43px; width: 80px; left: 645px; z-index: 109; top: 982px}
	.jp-comp-10{height: 72px; width: 144px; left: 525px; z-index: 110; top: 373px}
	.jp-comp-11{height: 94px; width: 147px; left: 129px; z-index: 111; top: 357px}
	.jp-comp-12{height: 69px; width: 157px; left: 340px; z-index: 112; top: 377px}
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
<div>
	<input type="button" value="打印预览..." onclick="doPrint('打印预览...')">
	<input type="button" value="打印..." onclick="doPrint('打印...')">
	<input type="button" value="打印" onclick="doPrint('打印')">
	<span style="font-size:12px;color:gray;margin-left:20px;">本网页代码可以在IE,Firefox,Chrome,Safari 上打印.</span>
</div>
<div id=page1 class=jp-page style="HEIGHT: 297mm; WIDTH: 210mm">
	<img class="jp-paper-background screen-only" src="http://print.jatools.com/jatoolsPrinterUI/../backgroundImages/jp-1399004733319877572.jpg">
	<div class="jp-label jp-comp-1">
		<%= dangantype %>
	</div>
	<div class="jp-label jp-comp-2">
		<%= niandu %>
	</div>
	<div class="jp-label jp-comp-3">
		<%= niandu %>
	</div>
	<div class="jp-label jp-comp-4">
		<%= niandu %>
	</div>
	<div class="jp-label jp-comp-5">
		<%= niandu %>
	</div>
	<div class="jp-label jp-comp-6">
		<%= danghao %>
	</div>
	<div class="jp-label jp-comp-7">
			<%= danghao %>
	</div>
	<div class="jp-label jp-comp-8">
			<%= code %>
	</div>
	<div class="jp-label jp-comp-9">
		
	</div>
	<div class="jp-label jp-comp-10">
			<%= dangantype %>
	</div>
	<div class="jp-label jp-comp-11">
			<%= niandu %>
	</div>
	<div class="jp-label jp-comp-12">
			<%= townid %>
	</div>
</div>
<object id="ojatoolsPrinter" codebase="jatoolsPrinter.cab#version=5,4,0,0" classid="clsid:B43D3361-D075-4BE2-87FE-057188254255" width="0" height="0">
	<embed id="ejatoolsPrinter" type="application/x-vnd.jatoolsPrinter" width="0" height="0"></embed>
</object>
</body>
</html>