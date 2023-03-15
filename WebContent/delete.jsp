<%@page import="multi.copy.MemberDAO3"%>
<%@page import="multi.copy.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
    String id = request.getParameter("id");
    
    MemberDAO3 dao = new MemberDAO3();
    dao.delete(id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 탈퇴를 원하는 id는 <%= id %>
</body>
</html>