<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		//시작하자마자 보여줄 ajax
		$.ajax({
			url : "testPage.jsp",
			success : function(x) {
				$('#result').append(x)
			}//success
		})//ajax

		$('#b1').click(function() {
			$('#result').empty() //기존것 삭제됨
			$.ajax({
				url : "buy.jsp",
				success : function(x) {
					$('#result').append(x)
				}//success
			})//ajax
		})//b1
	})//$
</script>
</head>
<body>
	마이스테이지박스
	<a href="http://localhost:8888/mini01/member2.jsp">
		<button>로그인</button>
	</a>
	<a href="http://localhost:8888/mini01/member3.jsp">
		<button>회원가입</button>
	</a>
	<hr color="orange">
	<!-- 카카오 로그인 -->
	<a class="p-2"
		href="https://kauth.kakao.com/oauth/authorize?client_id=7d82a34e6c4c00f0c8af6bad0d046044&redirect_uri=http://localhost:8888/mini01/kakaoLogin&response_type=code">
		<!-- REST_API키 및 REDIRECT_URi는 본인걸로 수정하세요 --> <img
		src="resources/img/카카오버튼.png" style="height: 40px">
	</a>
	<a href="https://nid.naver.com/nidlogin.login?oauth_token=si2QCtqK2U23gEsj8Z&consumer_key=개인id&logintp=oauth2&nurl=https%3A%2F%2Fnid.naver.com%2Foauth2.0%2Fauthorize%3Fresponse_type%3Dtoken%26state%3D00690abe-c445-4cfb-a442-cf6fd0c3a785%26client_id%3DAMkeOwuTJY71fYcpifZl%26redirect_uri%3Dhttp%253A%252F%252Flocalhost%253A8888%252Fmini01%252Fcallback.jsp%26locale%3Dko_KR%26inapp_view%3D%26oauth_os%3D&locale=ko_KR&inapp_view=&svctype=">
	<img width="180"
		src="https://developers.naver.com/doc/review_201802/CK_bEFnWMeEBjXpQ5o8N_20180202_7aot50.png" /></a>
	<br>
	<hr color="orange">
	메뉴1 메뉴2 메뉴3 메뉴4 메뉴5
	<br>
	<hr color="orange">
	<img src="resources/img/풍경.jpg" width=180 height=180>
	<br>
	<br>
	<table border="1" width="180" heigth="30">
		<tr align="center">
			<td>닉네임</td>
			<td>id</td>
		</tr>
		<tr align="center">
			<td>가입일</td>
			<td>2000</td>
		</tr>
		<tr align="center">
			<td>관람수</td>
			<td>1</td>
		</tr>
	</table>
	<br>
	<button id="b1">예매내역</button>
	<br>
	<button id="b2">작성한 후기</button>
	<br>
	<button id="b3">문의내역</button>
	<Br>
	<button id="b4">티켓북</button>

</body>
</html>