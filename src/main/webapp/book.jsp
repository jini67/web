<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>조별로하는 과제</title>
</head>
<body>
<h3>북마크 화면입니다. </h3>
<hr color="orange">
<form action="insert3.multi">
	name : <input name="name"><br>
	url : <input name="url"><br>
	img : <input name="img"><br>
	<button type="submit">서버로 전송</button>
	</form>
<hr color="orange">
<form action="one3.multi">
	id : <input name="id"><br>
	<button type="submit">서버로 전송</button>
</form>

<a href="list3">모든 게시판 리스트 가지고 오기</a>
<hr color="red">
</body>
</html>