<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
}
</style>
</head>
<body>
<a href="bbs.jsp">처음페이지로</a>
<a href="list2">게시물 전체목록 페이지</a>
<hr color="orange">
게시글검색 처리 요청이 완료되었습니다.
<hr>
${bag.no}<br>
${bag.title}<br>
${bag.content}<br>
${bag.writer}
</body>
</html>