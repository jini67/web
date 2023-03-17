<%@page import="multi.TasteVO"%>
<%@page import="multi.TasteDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
    String name = request.getParameter("name");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>식당 삭제 페이지</title>
</head>
<body>
당신이 삭제를 원하는 식당은 <%= name %>
</body>
</html>