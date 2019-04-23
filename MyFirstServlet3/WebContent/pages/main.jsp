<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="http://localhost:8080/MyFirstServlet3/">
</head>
<body>
	<center>
		<h1>欢迎<span style="color:blue">${sessionScope.user.username}</span>登陆</h1>
		<h3>=====================</h3>
		<%-- ${requestScope.emps} --%> 
		<c:if test="${empty requestScope.emps}">
				<h1>没有任何员工</h1>
		</c:if>
		<c:if test="${not empty requestScope.emps }">
			<h1>员工列表</h1>
			${requestScope.emps}
			<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<th>ID</th>
				<th>LastName</th>
				<th>Email</th>
				<th>Salary</th>
				<th>Dept</th>
				<th colspan="2">Operate</th>
			</tr>
	<c:forEach items="${requestScope.emps}" var="emp">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.lastName}</td>
				<td>${emp.email}</td>
				<td>${emp.salary}</td>
				<td>${emp.dept}</td>
				<td><a href="#">Edit</a> </td>
				<td><a href="#">DeleteEmployee</a> </td>
			
			</tr>	
			
			</c:forEach>		
			</table>
			
			</c:if>
		
		
		
		
	</center>	
	
</body>
</html>