<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">

		<c:if test="${empty vo}">
			
			<h1>비밀번호가 맞지 않습니다</h1>
		
		
		
		</c:if>

		<c:if test="${!empty vo}">
		<h1>${vo.id }님 안녕하세요.</h1>
		</c:if>
		
		
</div>
</body>
</html>