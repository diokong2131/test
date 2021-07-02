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
<h1>${id }</h1>
	<c:if test="${!empty id}">
	
		
		<h1>${id }님 안녕하세요.</h1>
		
	</c:if>
	<c:if test="${empty id }">
		
		
	</c:if>
	
	<button type="button" onclick="location.href='home.do'">홈가기</button>
</div>
</body>
</html>