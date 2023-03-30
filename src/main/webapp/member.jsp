<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 화면입니다.</title>
</head>
<body>
<h3>검색화면입니다.</h3>
<hr color="black">
<a href="list">모든 회원정보 가지고 오기</a>

<!-- one?id=1 -->
<hr color="violet">
<form action="one" method="get">
아이디 : <input name="id" value="apple"><br>
<button type="submit">서버로 전송</button>
</form>
<hr color="yellow">

<h3>로그인 화면입니다.</h3>
<hr color="violet">
<form action="login" method="get">
아이디 : <input name="id" value="apple"><br>
패스워드 : <input name="pw" value="1234"><br>
<button type="submit">서버로 전송</button>
</form>
<hr color="pink">

<h3>회원가입 화면입니다.</h3>
<hr color="pink">
<form action="insert" method="get">
아이디 : <input name="id" value="apple"><br>
패스워드 : <input name="pw" value="1234"><br>
이름 : <input name="name" value="park"><br>
전화번호 : <input name="tel" value="011"><br>
<button type="submit">서버로 전송</button>
</form>
<hr color="pink">

<h3>회원수정 화면입니다. </h3>
<hr color="blue">
<form action="update" method="get">
	id : <input name="id" value="apple"><br>
	tel : <input name="tel" value="011"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>회원탈퇴 화면입니다. </h3>
<hr color="red">
<form action="delete" method="get">
	id : <input name="id" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="orange">

<h3>회원검색 화면입니다. </h3>
<hr color="red">
<form action="one" method="get">
	id : <input name="id" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="lime">

<button type="button">먹통버튼(아무기능없음)</button>
</body>
</html>