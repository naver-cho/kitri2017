<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="java.util.*, mvc.spring.mybatis.mapper.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${empList }" var="vo">
   ${vo.employee_id } --- ${vo.first_name } 
</c:forEach>

==================================================
 <% List<EmpVO> list = 
 (List<EmpVO>)request.getAttribute("empList");
 for(EmpVO vo : list){
	 out.println(vo.getEmployee_id()+":"+vo.getFirst_name()+","+vo.getHire_date() +"," + vo.getSalary()+"<br>");
 }
 %>
 =====================================================
</body>
</html>