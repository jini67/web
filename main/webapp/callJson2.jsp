<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- content delivery network  : CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url: "json1",
				dataType : "json",
				success: function(json) {
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel //json에서 tel키로 값을 추출
					$('#result').append(id + " " + pw + " " + name + " " + tel + "<br>")
				} //success
			}) //ajax
		})//b1
		$('#b11').click(function() {
			$.ajax({
				url: "json1",
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
		})//b11
		$('#b111').click(function() {
			$.ajax({
				url: "json1",
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
		})//b111
		$('#b3').click(function() {
			$.ajax({
				url: "json3.jsp",
				dataType : "json",
				success: function(json) {
					today = json.today
					temp = json.temp
					hu = json.hu
					$('#result').append(today + " " + temp + " " + hu + "<br>")
					if(today == 'rain') {
						$('#result').append("<img src=resources/img/rain.png><br>")
					}else if(today == 'sun'){
						$('#result').append("<img src=resources/img/sun.jpg><br>")
					}
				} //success
			}) //ajax
		})//b3
		$('#b2').click(function() {
			$.ajax({
				url: "json2",
				dataType : "json",
				success: function(json) {//[{}, {id: "", name: "", pw : "", tel: ""}]
					id1 = json[1].id
					name1 = json[1].name
					$('#result').append("json배열 중 2번째 것>> " + name1 + " " + id1 + "<br>")
					
				} //success
			}) //ajax
		})//b2
		$('#b4').click(function() {
			$.ajax({
				url: "json4.jsp",
				dataType : "json",
				success: function(json) {
					high1 = json[0].high
					low1 = json[0].low
					end1 = json[0].end
					
					high2 = json[1].high
					low2 = json[1].low
					end2 = json[1].end
					$('#result').append("어제 주가: " + high1 + " " + low1 + " " + end1 + "<br>")
					$('#result').append("오늘 주가: " + high2 + " " + low2 + " " + end2 + "<br>")
					
				} //success
			}) //ajax
		})//b4
	})//$
</script>

</head>
<body>
<button id="b1">컨트롤러에서 JSON(텍스트)을 받아오자.!</button>
<button id="b11">컨트롤러에서 JSON(다른 모양, table, li)을 받아오자.!</button>
<button id="b111">컨트롤러에서 JSON(다른 모양, table, li)2을 받아오자.!</button>
<button id="b2">컨트롤러에서 JSONArray를 받아오자.!</button>
<hr color="blue">
<button id="b3">컨트롤러에서 JSON3을 받아오자.!</button>
<!-- url: json3, bbs vo에 값을 하나 넣어서 json으로 받아와서 출력 --> 

<button id="b4">컨트롤러에서 JSONArray4를 받아오자.!</button>
<!-- url: json4, bbs vo 2개가 들어간 arraylist를 만들어서 
	json array으로 받아와서 출력 --> 
	
<hr color="red">
<div id="result"></div>
</body>
</html>