<%@page import="multi.MemberVO"%>
<%@page import="multi.MemberDAO3"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");

MemberDAO3 dao = new MemberDAO3();
MemberVO bag2 = dao.one(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	당신이 검색을 원하는 아이디는
	<%=id%>
	<hr color="blue">
	검색한 pw :
	<%=bag2.getPw()%>
	<br> 검색한 이름 :
	<%=bag2.getName()%>
	<br> 검색한 전화번호 :
	<%=bag2.getTel()%>
	<br>
</body>
</html>