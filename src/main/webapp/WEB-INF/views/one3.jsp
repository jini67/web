<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
background: yellow;
}
</style>
</head>
<body>
<!--  표현식(expression -->
책검색 처리 요청이 완료되었습니다.<br>
<hr color="red">
${bag.id}, ${bag.name}, ${bag.url}, ${bag.img}
<img src="resources/img/${bag.img}">
</body>
</html>