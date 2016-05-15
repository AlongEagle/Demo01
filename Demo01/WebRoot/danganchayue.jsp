<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="en" class="no-js">

    <head>

        <meta charset="utf-8">
        <title>档案查阅记录</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        
        
        <script type="text/javascript" src="easyui/jquery.min.js"></script>
		<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>




<meta charset="UTF-8">

<title>东至县城乡居保中心|档案管理系统</title>
<link rel="icon" type="image/gif" href="imagess/favicon.gif" />
<link rel="stylesheet" type="text/css"
	href="easyui/themes/bootstrap/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>


   
   
    </head>
    
<script >

	  $(function () {
   $('#xiugaishuju').window('close');
   });
	function add() { 
				
					
					  $("#xiugaishuju").dialog("open").dialog('setTitle', '修改档案信息');
					
						/* $.messager.alert('请谨慎修改！', row.onlyid+":"+row.detail+":"+row.dept); */
					}


</script>
   <body class="easyui-layout">
	<div data-options="region:'north',border:false"
		style="overflow:hidden; height:60px;background-image:url('logo9.jpg');background-repeat:repeat-x; padding:10px;text-align:center;texe-size:40">
		<font color="#FFFFFF" size="100px">档案查阅记录</font>
	</div>



	<div data-options="region:'west',split:true,title:'相关操作'"
		style="width:230px;padding:1px;">



		<div class="easyui-panel" style="padding:0px;width:100%;height: 100%">
		
		<button  style="width:98% " onclick="add();" >新增查阅记录</button>
		<hr>
		<button  style="width:98%" onclick="">删除查阅记录</button>
		
		<div style="text-align:center;padding:3px">
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<font color="gray" size="5px" >1、请档案管理员准确记录查阅时间和相关人员</font><br>
			<font color="gray" size="5px" >2、请查阅完毕及时归还档案</font>
		
		</div>
		</div>

	</div>
	
	
	
	<div data-options="region:'center',title:'详细信息'"
		style="width:1250px;padding:1px;">
		<div style="1300px ;text-align:center">
			<div>
				<table class="easyui-datagrid" id="list_data" 
					style="text-align:center;width:100%;height:550px;"
					data-options="singleSelect:true,collapsible:true,loadMsg:'档案量大，请稍等，数据装载中......',url:'servlet/ChaYueServlet',method:'post',pagination:false">


					<thead>
						<tr>
							
							<th data-options="field:'id',width:40">编号</th>
							<th data-options="field:'seeDate',width:80">查阅时间</th>
							<th data-options="field:'seeUser',width:110">查阅者</th>
							<th data-options="field:'seeContent',width:475">查阅内容</th>
							<th data-options="field:'ps',width:300">备注</th>
							



						</tr>
					</thead>
				</table>
			</div>
	
	

	<script type="text/javascript">
		
		
		



		
		
		
		
		
		function submitForm1(){
	      	var chayueshijian=$('#chayueshijian').val();
	      	var chayuezhe=$('#chayuezhe').val();
	      	var chayueneirong=$('#chayueneirong').val();
	      	var beizhu=$('#beizhu').val();
	      	
	      
	      	$.ajax(
	        							{
	        							url:"servlet/CharuChayueServlet?random="+Math.random()+"&chayueshijian="+encodeURI(chayueshijian,'utf-8')+"&chayuezhe="+encodeURI(chayuezhe,'utf-8')+"&chayueneirong="+encodeURI(chayueneirong,'utf-8')+"&beizhu="+encodeURI(beizhu,'utf-8'),
	        							async:true,
	        							type:"post",
	        							 contentType:"application/x-www-form-urlenchayueneirongd:charset=UTF-8",
	        							 
	        							 success: function (msg){
 										
	 							     			if(msg=="success"){
	 							     				
	 							     			$.messager.alert('修改成功！',"数据更新成功，请重新查找验证！");
	 							     			$("#xiugaishuju").window('close');
	 							     			$('#list_data').datagrid('reload');
	 							     			}
										    }
 							     			
 							     			
 							     			
 							     			
 							     			
 				         				,  
						 				 error: function (data,status,e){  
						 					alert("导入出错");   
			  							}
	        							 
	        							 
	        							 }); 
	    
	    
	    
	    
	    }
	    
		
	
	</script>

	



	</div>
	</div>
	<div data-options="region:'south',border:false"
		style="height:12px;background:#FFFFFF;padding:0px;text-shadow:black; text-align: center;">
		<a style="color: #4A4A4A" href="#">业务咨询|技术支持：
			黄女士(QQ:1034106711)&nbsp;&nbsp;&nbsp;陈先生(QQ:510850919)&nbsp;&nbsp;&nbsp;潘同学
			(QQ:1107635271)&nbsp;&nbsp;&nbsp;【东至县城乡居保中心】</a>
	</div>
	
	<!--  -------------------------修改数据---------------------------------- -->

	<div id="xiugaishuju" closed="true" class="easyui-window" title="请务必仔细核对填写！" data-options="iconCls:'icon-edit'"
		style="width:520px;height:320px;padding:5px;">
		<div style="padding:10px 10px 10px 10px;align:center">
		<font style="color:red;text-align:center"><h3>请填写相关信息（全部都不能为空！）</h3>
				</font>
		
			<form id="xiugaiform" method="post" style="align:center">
				<table>
					<tr>
						<td>查阅时间:</td>
						<td><input type="text" style="width: 350px" id="chayueshijian"
							name="chayueshijian" data-options=""></input>
						</td>
					</tr>
					<tr>
						<td>查阅者:</td>
						<td><input type="text" style="width: 350px"
							id="chayuezhe" name="chayuezhe" data-options=""></input>
						</td>
					</tr>
					<tr>
						<td>查阅内容:</td>
						<td><input type="text" style="width: 350px" id="chayueneirong"
							name="chayueneirong" data-options=""></input>
						</td>
					</tr>
					<tr>
						<td>备注:</td>
						<td><input type="text" style="width: 350px" id="beizhu"
							name="beizhu" ></input>
						</td>
					</tr>
				</table>
			</form>
			<div style="text-align:center;padding:5px">
				<a href="javascript:void(0)" class="easyui-linkbutton"
					onclick="submitForm1()">确认修改</a> <a href="javascript:void(0)"
					class="easyui-linkbutton" onclick="clearForm()">取 消</a>
			</div>


			
	    
	      	
	      	
	    
	    


			<div style="align:center">
				<hr>
				<font style="color:red;text-align:center"><h3>该修改将直接影响档案系统的原始数据，并会记录操作者，请仔细填写!</h3>
				</font>

			</div>
		</div>




	</div>
	



			





      

    </body>

</html>

