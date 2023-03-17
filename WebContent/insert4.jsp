<%@page import="multi.MovieDAO"%>
<%@page import="multi.MovieVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- 이렇게 해주면 밑에 가방 지정 안해줘도 됨 -->
    <!-- 자바 밖에 넣어줘야 함 -->
    <jsp:useBean id="bag" class="multi.MovieVO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    
    <!-- 1. 전달된 값을 받아주세요 -->
    <!-- 2. dao에게 값 전달 -->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내주세요. -->
    <%
    /*String id = request.getParameter("id");
    String name = request.getParameter("name");
    String content = request.getParameter("content");
    String price = request.getParameter("price");
    String company = request.getParameter("company");
    String img = request.getParameter("img"); */
    
    // 1. 받은 데이터를 DAO에게 주기 위해 가방을 만들어서 넣자
    /* ProductVO bag = new ProductVO();
    
    bag.setId(id);
    bag.setName(name);
    bag.setContent(content);
    bag.setPrice(Integer.parseInt(price));
    bag.setCompany(company);
    bag.setImg(img); */
    
    // 2. DAO에게 가방을 전달하면서 insert해달라고 하자
    MovieDAO dao = new MovieDAO();
    dao.insert(bag);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTP-8">
<title>입력하는창</title>
</head>
<body>
영화등록 요청되었음.
<hr color="red">
id : <%= bag.getId() %> <br>
영화제목 : <%= bag.getTitle() %> <br>
영화내용 : <%= bag.getContent() %> <br>
촬영지 : <%= bag.getLocation() %> <br>
감독 : <%= bag.getDirector() %> <br>
</body>
</html>