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
			url: "one22",
			data : {
				no: 1
			},
			dataType : "json",
			success: function(json) {
				no = json.no
				content = json.content
				$('#result').append(no + " " + content + "<br>")
			} //success
		}) //ajax
	})//b1
	$('#b11').click(function() {
		$.ajax({
			url: "list55",
			dataType : "json",
			success: function(json) {//[{}, {id: "", name: "", pw : "", tel: ""}]
				no1 = json[1].no
				content1 = json[1].content
				$('#result').append("json배열 중 2번째 것>> " + no1 + " " + content1 + "<br>")
				
			} //success
		}) //ajax
	})//b11
	$('#b2').click(function() {
		$.ajax({
			url: "list55",
			dataType : "json",
			success: function(json) {//[{}, {id: "", name: "", pw : "", tel: ""}]
				no1 = json[1].no
				content1 = json[1].content
				$('#result').append("json배열 중 2번째 것>> " + no1 + " " + content1 + "<br>")
				
			} //success
		}) //ajax
	})//b2
})
</script>
</head>
<body>
<button id="b1">컨트롤러에서 bbs JSON(text)을 받아오자.!</button>
<button id="b11">컨트롤러에서  bbs JSON(table)를 받아오자.!</button>
<button id="b2">컨트롤러에서 bbs JSONArray를 받아오자.!</button>
<hr color="orange">
<div id="result"></div>
</body>
</html>