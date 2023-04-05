<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- content delivery network : CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	$('#b1').click(function() {
		$.ajax({
			url: "json5",
			dataType : "json",
			success: function(json) {
				id = json.id
				pw = json.pw
				name = json.name
				tel = json.tel //json에서 tel키로 값을 추출
				table = "<table><tr><td>항목명</td><td>값</td></tr>" + 
				"<tr><td>아이디</td><td>" + id +"</td></tr>" + 
				"<tr><td>패스워드</td><td>" + pw +"</td></tr>" + 
				"<tr><td>이름</td><td>" + name +"</td></tr>" + 
				"<tr><td>전화번호</td><td>" + tel +"</td></tr></table>"
				$('#result').append(table)
			} //success
		}) //ajax
	})//b1
	$('#b2').click(function() {
		$.ajax({
			url: "json5",
			dataType : "json",
			success: function(json) {
				id = json.id
				pw = json.pw
				name = json.name
				tel = json.tel //json에서 tel키로 값을 추출
				table = "<ul><li>" + id +"</li>" + 
				"<li>" + pw +"</li>" + 
				"<li>" + name +"</li>" + 
				"<li>" + tel +"</li></ul>"
				$('#result').append(table)
			} //success
		}) //ajax
	})//b2
	$('#b3').click(function() {
		$.ajax({
			url: "list55",
			dataType : "json",
			success: function(json) {//[{}, {id: "", name: "", pw : "", tel: ""}]
				no1 = json[1].no
				content1 = json[1].content
				$('#result').append("json배열 중 2번째 것>> " + no1 + " " + content1 + "<br>")
				
			} //success
		}) //ajax
	})//b3
})
</script>
</head>
<body>
<button id="b1">컨트롤러에서 member JSON(table)을 받아오자.!</button>
<button id="b2">컨트롤러에서 member JSON(list)를 받아오자.!</button>
<button id="b3">컨트롤러에서 member JSONArray를 받아오자.!</button>
<hr color="orange">
<div id="result"></div>
</body>
</html>