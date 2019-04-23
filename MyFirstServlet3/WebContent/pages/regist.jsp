<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<base href="http://localhost:8080/MyFirstServlet3/">
<style type="text/css">
	body {
		background-color: blue
	}
</style>
<script type="text/javascript" src="script/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function(){
		//给文本框绑定获得焦点的事件
		$("#username").focus(function(){
			//alert("你点我干嘛");
			 $("#msgSpan").text("")
			/*  text()获取或设置出现标签中的文本值
			对象.text() 获取文本值
			对象.text("value") 设置文本值
			html()与text()方法区别是html()可以解析html标签
			 */
			//$("#msgSpan").text("<font color='blue'>蓝色</font>");
			//$("#msgSpan").html("<font color='blue'>蓝色</font>");

		});
		// 给注册按钮绑定单击事件
		$("#sub").click(function()	{
			//获取用户输入的用户名
			//var与text类似,用于input标签
			var username = $("#username").val();
			alert(username);
			//验证用户是否复合规则的正则表达式
			var userReg = /^[a-zA-Z0-9_-]{3,9}$/;
			var flag=userReg.test(username);
			if(!flag){
				alert("请输入3到9位的字母,数字下划线或-的用户名")
				return false;
			}
			//alert(flag);
			
			var password = $("#password").val();
			alert(password);
			//验证密码是否复合规则的正则表达式
			var pwdReg = /^[a-zA-Z0-9_-]{6,18}$/;
			var flag=pwdReg.test(username);
			if(!flag){
				alert("请输入6到18位的字母,数字下划线或-的用户名")
				return false;
			}
			//alert(flag);
			//return false;
			
			var repwd = $("#repwd").val();
			alert(repwd);
			//验证用户是否复合规则的正则表达式
			if(repwd!=password){
				alert("两次输入密码不一致")
				return false;
			}
			//alert(flag);
			//return false;
		});
		
		//给文本狂绑定change事件
		$("#username").change(function(){
			//alert("看我七十二变");	
		});
		
		
	});
		
</script>
		

</head>
<body>
	<h1>欢迎注册啊</h1>
	<form action="RegistServlet" method="post">
		用户名称：<input type="text" name="username" id="username"><span style="color: red" id="msgSpan"> <%=request.getAttribute("msg")==null?"":request.getAttribute("msg") %></span><br>
		用户密码：<input type="password" name="password" id="password"><br>
		确认密码：<input type="password" name="password" id="repwd"><br>
		用户邮箱：<input type="text" name="email"><br>
		<input type="submit" value="注册" id="sub" >
	</form>
</body>
</html>