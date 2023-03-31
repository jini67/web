<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="resources/img/김치전.jpg">
<%
if(session.getAttribute("id") !=null){ //로그인 성공
%>
<a href="bbb"><button>공동구매 참여</button></a>
<%}else{%> <!-- 로그인 안함 -->
<a href="login.jsp">로그인페이지로</a>
<%} %>
</body>
</html>