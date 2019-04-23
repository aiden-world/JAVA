<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- JavaScript代码需要写在script标签中 -->
<script type="text/javascript">
	//文档加载完成之后执行函数内容
	window.onload = function(){
		var btnEle = document.getElementById("btnId");
		btnEle.onclick = function(){
			alert("Hello JavaScript");	
		};
	};
</script>
</head>
<body>
<!-- 
		绝对路径:以/开头的路径即为绝对路径
		/代表什么?
		如果地址由浏览器解析,那么/代表:http://localhost:8080/
			以下路径由浏览器解析
				1)HTML标签中的路径,如a标签中href属性的路径,
								form表单中action属性中的路径
				2)重定向中的路径
		如果地址由服务器解析,那么/代表:http:localhost:8080/MyFirstServlet/
				1)web.xml配置文件中url-pattern的路径
				2)转发中的路径
	 -->
	<a href="MyFirstServlet">Hello Servlet</a>
	<h1>Get请求</h1>
	<form action="AutoServlet" method="get">
		用户名:<input type="text" name = "username"> <br>
		密码:<input type="password" name = "password"> <br>
		<input type="submit">
	</form>
	<h1>Post请求</h1>
	<form action="AutoServlet" method="post">
		用户名:<input type="text" name = "username"> <br>
		密码:<input type="password" name = "password"> <br>
		<input type="submit">
	</form>
	
	<a href="pages/login.jsp">我要登陆</a><br>
	
	<a href="pages/regist.jsp">我要注册</a><br>
	
	<button id= "btnId">say hello</button>
</body>
</html>