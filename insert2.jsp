<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. 전달된 값을 받아주세요 -->
    <!-- 2. dao에게 값 전달 -->
    <!-- 3. 전달된 값을 출력하세요 -->
    <%
    String no = request.getParameter("no");
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String writer = request.getParameter("writer");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTP-8">
<title>Insert title here</title>
</head>
<body>
글쓰기 요청되었음.
<hr color="red">
글번호 : <%= no %> <br>
제목 : <%= title %> <br>
내용 : <%= content %> <br>
작성자 : <%= writer %> <br>
</body>
</html>