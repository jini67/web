<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
    String no = request.getParameter("no");
    String content = request.getParameter("content");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 수정을 원하는 번호는 <%= no %> <br>
당신이 수정을 원하는 내용은 <%= content %>
</body>
</html>