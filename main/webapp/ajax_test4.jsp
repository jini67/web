<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list",
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b1		
		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url: "list",
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
		})//b2
		$('#b3').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list6",
				data : {
					bbsno : 30
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b3
		$('#b4').click(function() {
			$('#result').empty()
			$.ajax({
				url : "one5",
				data : {
					id : "apple"
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b4
		$('#b5').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list6",
				data : {
					bbsno : 1
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b5
		$('#b6').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list",
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b6
		$('#b7').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list7",
				data : {
					writer : "apple"
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b7
		$('#b8').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list5",
				data : {
					writer : "apple"
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b8
	})//$
</script>
</head>
<body>
<button id="b1">member리스트 가지고오기</button>
<button id="b2">bbs번호 1번 reply리스트 가지고오기</button>
<button id="b3">bbs번호 30번 reply리스트 가지고오기</button>
<button id="b4">member id가 apple인 사람의 정보 가지고오기</button>
<!-- one5, id : apple, views/one5.jsp -->
<button id="b5">bbs번호 1인 게시물의 상세정보 가지고오기</button>
<!-- one6, no : 1, views/one6.jsp -->
<button id="b6">member의 모든 리스트 가지고오기</button>
<!-- list, views/list.jsp -->
<button id="b7">apple이 작성한 댓글리스트 가지고오기</button>
<button id="b8">apple이 작성한 게시글리스트 가지고오기</button>
<hr color="orange">
<div id="result" style="background: yellow"></div>
</body>
</html>