<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>居保档案系统</title>
<meta name="generator" content="MShtml 8.00.6001.18783" />
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<!--IE下用静态icon-->
<link rel="stylesheet" type="text/css"
	href="easyui/themes/bootstrap/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<link rel="shortcut icon" type="image/x-icon" href="imagess/favicon.ico" />
<link rel="bookmark" type="image/x-icon" href="imagess/favicon.ico" />
<!--FF下可用gif动态icon-->
<link rel="icon" type="image/gif" href="imagess/favicon.gif" />
<link rel="stylesheet" type="text/css" href="css2/style.css" />
<style type="text/css">
.download{margin:20px 33px 10px;*margin-bottom:30px;padding:5px;border-radius:3px;-webkit-border-radius:3px;-moz-border-radius:3px;background:#e6e6e6;border:1px dashed #df0031;font-size:14px;font-family:Comic Sans MS;font-weight:bolder;color:#555}
.download a{padding-left:5px;font-size:14px;font-weight:normal;color:#555;text-decoration:none;letter-spacing:1px}
.download a:hover{text-decoration:underline;color:#36F}
.download span{float:right}
</style>
<script type="text/javascript">
$(function(){
	$('#welcome').window("close");

});

</script>


</head>


<script>






function check(){
				
		var name=document.getElementById("name").value;
		var password=document.getElementById("password").value;
		
		if(name!=""&&name!=null&&password!=null&&password!=""){
								
            	$.ajax(
	        							{
	        							url:"servlet/LoginCheckServlet?random="+Math.random()+"&name="+encodeURI(name,'utf-8')+"&password="+encodeURI(password,'utf-8'),
	        							async:true,
	        							 contentType:"application/x-www-form-urlencoded:charset=UTF-8",
	        							 
	        							 success: function (msg){
	        							 
 										if(msg=="success"){
 										$('#welcome').window("open");
 										setTimeout(function(){
 										
 										
 										
 										window.open('http://127.0.0.1:8089/Demo01/LayoutDemo.jsp','_self');
 										},2000);
 										
 										
 										
 										}else{
 							     				$('#password').val("");
 							     				alert("账号或者密码错误,请重新输入！" );
 							     			}
 							     			
 							     			
 				         				},  
						 				 error: function (data,status,e){  
			  							},
	        							 
	        							 
	        							 }); 
		
		
		
		
		
		
				
		
		}else{
			alert("用户名密码不能为空！！");

		}
	}



</script>

<body>
<!--实例演示 开始-->
<div class="main">
	<div class="header hide">东至县居保中心档案系统</div>
	<div class="content">
		<div class="title hide">档案管理员登录</div>
		<form name="login" action="#" method="post">
			<fieldset>
				<div class="input">
					<input class="input_all name" name="name" id="name" placeholder="用户名" type="text" onFocus="this.className='input_all name_now';" onBlur="this.className='input_all name'" maxLength="24" />
				</div>
				<div class="input">
					<input class="input_all password" name="password" id="password" type="password" placeholder="密码" onFocus="this.className='input_all password_now';" onBlur="this.className='input_all password'" maxLength="24" />
				</div>
				<div class="checkbox">
					<input type="checkbox" name="remember" id="remember" /><label for="remember"><span>记住密码</span></label>
				</div>
				<div class="enter">
					<input class="button hide" name="submit" type="submit" value="登录" onclick="check();return false;"/>
				</div>
			</fieldset>
		</form>
	</div>
</div>


	<div id="welcome" class="easyui-window" title=""
		data-options=""
		style="width:440px;height:350px;padding:0px;">
	<image src="images/zairu3.gif"></image>
	<div style="text-align:center">
	<h1>登录中，请稍后...</h1>
	</div>
	<%
	session.setAttribute("name", "ddd"); 
	
	%>

	</div>
<script type="text/javascript" src="js2/placeholder.js"></script>
<script type="text/javascript" src="js2/h.js"></script>

<script type="text/javascript">
</script>
</body>
</html>