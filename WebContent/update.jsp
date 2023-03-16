<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
    String id = request.getParameter("id");
    String tel = request.getParameter("tel");

    MemberVO bag = new MemberVO();
    bag.setId(id);
    bag.setTel(tel);
    
    MemberDAO3 dao = new MemberDAO3();
    dao.update(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 수정을 원하는 id는 <%= id %> <br>
당신이 수정을 원하는 tel은 <%= tel %>
</body>
</html>