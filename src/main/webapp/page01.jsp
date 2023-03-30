<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키심기</title>
</head>
<body>
<%
Cookie c1 = new Cookie("category", "운동");
Cookie c2 = new Cookie("ex", "축구");

response.addCookie(c1);
response.addCookie(c2);
%>

<hr>브라우저에 쿠키를 심었음.
<a href="page02.jsp">쿠키리스트가지고오기</a>
</body>
</html>