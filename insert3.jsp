<%@page import="multi.ProductVO"%>
<%@page import="multi.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="multi.ProductVO"></jsp:useBean>
    <<jsp:setProperty property="*" name="bag"/>
    <!-- 이렇게 해주면 밑에 가방 지정 안해줘도 됨 -->
    
    <!-- 1. 전달된 값을 받아주세요 -->
    <!-- 2. dao에게 값 전달 -->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내주세요. -->
    <%
    /* String id = request.getParameter("id");
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
    ProductDAO dao = new ProductDAO();
    dao.insert(bag);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTP-8">
<title>입력하는창</title>
</head>
<body>
상품등록 요청되었음.
<hr color="red">
<img src="img/<%= bag.getImg() %>" width=200 height=200>
<hr color="red">
id : <%= bag.getId() %> <br>
name : <%= bag.getName() %> <br>
content : <%= bag.getContent() %> <br>
price : <%= bag.getPrice() %> <br>
company : <%= bag.getCompany() %> <br>
</body>
</html>