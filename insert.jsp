<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 브라우저가 보낸 데이터를 받아야 함. ==> 자바로 짜야함 -->
    <!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함 -->
    <% //스크립트릿
    // ★자바코드 넣는부분★
    //HttpServletRequest request = new HttpServletRequest();
    //tomcat은 미리 reqeust를 만들어서 내장시켜놓음! 안만들어줘도 됨~~
    String id = request.getParameter("id"); //"apple" <<아이디 불러옴
    String pw = request.getParameter("pw"); 
    String name = request.getParameter("name"); 
    String tel = request.getParameter("tel"); 
    %>
    <!-- 3. 브라우저에게 결과를 알려주기 위한 html코드가 미리 들어가 있음, -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTP-8">
<title>Insert title here</title>
<style type="text/css">
body {
background: #abffe2;
}
</style>
</head>
<body>
회원가입 요청되었음.
<hr color="red">
가입한 id : <%= id %> <br>
가입한 pw : <%= pw %> <br>
가입한 name : <%= name %> <br>
가입한 tel : <%= tel %> <br>
</body>
</html>