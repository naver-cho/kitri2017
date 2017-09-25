<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 사원 등록 폼 </title>
</head>
<body>
<form action="insert.emp" method="post">
	사번:<input type=text name="id" ><br>
	이름:<input type=text name="name" ><br>
	이메일:<input type=text name="email" ><br>
	직종:
	<select name="job_id">
	<c:forEach items="${jobList }" var="job">
	 <option> ${job}</option>
	</c:forEach>
	</select> <br>
	급여:<input type=text name="salary" ><br>
	<input type=submit value="등록완료" >
</form>
</body>
</html>






