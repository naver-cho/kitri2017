<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사원등록결과</title>
</head>
<body>등록한 사원은
${empvo.id }  : ${empvo.name } : ${empvo.email }
 : ${empvo.job_id } : ${empvo.salary }
입니다.
입사일자는 자동으로 오늘 날짜로 설정됩니다.
</body>
</html>