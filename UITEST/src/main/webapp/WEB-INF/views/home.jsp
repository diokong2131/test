<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>로그인</title>
</head>
<body>

<div align="center">
	<div><h1>로 그 인</h1></div>
	<c:if test="${!empty id }">
		<h1>${id }님은 이미 로그인 되어있습니다.</h1>
		<button type="button" onclick="location.href='home.do'">홈으로</button>
	</c:if>
	<c:if test="${empty id }">
	<form:form modelAttribute="member" action="memberLogin" method="post">
		<label for="id">아이디 : </label>
		<form:input path="id"/><br/>
		<label for="password">패스워드 : </label>
		<form:input path="password"/> <br/>
		<input type="submit" value="로그인">	
	</form:form>
	</c:if>
</div>
</body>
</html>
