<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="java.util.*, mvc.spring.mybatis.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${empList }" var="vo">
   ${vo.id } --- ${vo.name } 
</c:forEach>

==================================================
 <% List<EmpVO> list = 
 (List<EmpVO>)request.getAttribute("empList");
 for(EmpVO vo : list){
	 out.println(vo.getId()+":"+vo.getName()+"<br>");
 }
 %>
 =====================================================
</body>
</html>