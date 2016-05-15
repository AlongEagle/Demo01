<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form id="ff" method="post" style="align:center">
	    	<table cellpadding="8">
	    		<tr>
	    			<td>关键信息:</td>
	    			<td><input class="easyui-textbox" type="text" style="width: 350px" id="keyinfo" name="detail"  data-options=""></input></td>
	    		</tr>
	    		<tr>
	    			<td>档案编号:</td>
	    			<td><input class="easyui-textbox" type="text" style="width: 350px"  id="danganbianhao1" name="danghao" data-options=""></input></td>
	    		</tr>
	    		<tr>
	    			<td>页	码:</td>
	    			<td><input class="easyui-textbox" type="text" style="width: 350px"  id="code" name="code" data-options=""></input></td>
	    		</tr>
	    	</table>
	    </form>
	    
	    <input type="button" value="发送">
  </body>
  
  <script>
  
    function aaa(){
    
    $('#keyinfo').val("测试护具");
    
    
    };
  
  </script>
</html>
