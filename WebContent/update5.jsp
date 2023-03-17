<%@page import="multi.TasteDAO"%>
<%@page import="multi.TasteVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
    String menu = request.getParameter("menu");
    String name = request.getParameter("name");
    
    TasteVO bag = new TasteVO();
    bag.setMenu(menu);
    bag.setName(name);
    
    TasteDAO dao = new TasteDAO();
    dao.update(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 수정을 원하는 메뉴는 <%= menu %> <br>
당신이 메뉴수정을 원하는 식당은 <%= name %>
</body>
</html>