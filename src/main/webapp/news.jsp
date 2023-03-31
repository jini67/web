<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="resources/img/4.png">
<%
if(session.getAttribute("id") !=null){ //로그인이 성공해서 ram에 id를 저장해놓은것
%>
<form action="aaa">
댓글 : <input name="reply"><br>
<button>댓글달기</button>
</form>
<%} %>
</body>
</html>