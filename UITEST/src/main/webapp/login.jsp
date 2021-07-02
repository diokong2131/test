<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>

<html>
<head>
	<title>login</title>
</head>
<body>
<div align="center">
	<div><h1>로 그 인</h1></div>
	
	<form action="login" method="post">
		아이디 :	<input type="text" id="id" name="id" /><br/>
		패스워드 : <input type="password" id="password" name="password"/> <br/>
		<input type="submit" value="로그인">	
		<input type="reset" value="취소">
	</form>

</div>
</body>
</html>
