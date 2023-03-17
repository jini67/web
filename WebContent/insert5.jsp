<%@page import="multi.TasteDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- 이렇게 해주면 밑에 가방 지정 안해줘도 됨 -->
    <!-- 자바 밖에 넣어줘야 함 -->
    <jsp:useBean id="bag" class="multi.TasteVO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    
    <!-- 1. 전달된 값을 받아주세요 -->
    <!-- 2. dao에게 값 전달 -->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내주세요. -->
    <%
    // 2. DAO에게 가방을 전달하면서 insert해달라고 하자
    TasteDAO dao = new TasteDAO();
    dao.insert(bag);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTP-8">
<title>입력하는창</title>
</head>
<body>
식당등록 요청되었음.
<hr color="red">
식당명 : <%= bag.getName() %> <br>
대표메뉴 : <%= bag.getMenu() %> <br>
가격 : <%= bag.getPrice() %> <br>
전화번호 : <%= bag.getTel() %> <br>
사진 : <%= bag.getImg() %> <br>
</body>
</html>