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
		background-color: pink
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
	});
		
</script>
		

</head>
<body>
	<h1>欢迎登录啊</h1>
	<form action="LoginServlet" method="post">
		用户名称：<input type="text" name="username" id="username"><span style="color: red" id="msgSpan"> <%=request.getAttribute("msg")==null?"":request.getAttribute("msg") %></span><br>
		用户密码：<input type="password" name="password"><br>
		<input type="submit" value="登录">
	</form>
</body>
</html>