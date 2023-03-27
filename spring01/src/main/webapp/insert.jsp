<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 1. 브라우저에서 넘어오는 값 서버에서 받아주세요.
    // 넘어오는 값 제어해주는 코드 (자바코드)
    // Controller(자바코드)
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String name = request.getParameter("name");
    String tel = request.getParameter("tel");
    
    // 2. dao에 데이터값을 주면서 Insert 요청하세요.(자바코드)
    // DAO(JDBC 4단계에 의해 코딩이 됨. 항상 방법이 똑같음)
    // Model(자바코드)
    
    // 3. 결과를 html에 담아서 클라이언트로 전송해주세요.
    // 보여주는 부분 (html)
    // View(html)
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 화면입니다.</title>
</head>
<body>
<h3>회원가입 화면입니다.</h3>
<hr color="blue">
가입 id : <%= id %><br>
가입 pw : <%= pw %><br>
가입 name : <%= name %><br>
가입 tel : <%= tel %><br>
</form>
</body>
</html>