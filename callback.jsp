<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.parser.JSONParser"%>
<%@ page import="java.net.URLEncoder"%>
<%@ page import="java.net.URL"%>
<%@ page import="java.net.HttpURLConnection"%>
<%@ page import="java.io.BufferedReader"%>
<%@ page import="java.io.InputStreamReader"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!doctype html>
<html lang="ko">
<head>
<script type="text/javascript"
	src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js"
	charset="utf-8"></script>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
</head>
<body>
	<script type="text/javascript">
		var naver_id_login = new naver_id_login("개인id",
				"http://localhost:8888/mini01/callback.jsp");
		//var naver_id_login = new naver_id_login("VFdsT2SPGL6J7j2_rpyi", "http://localhost:8888/mini01/callback.jsp");
		// 접근 토큰 값 출력
		//alert(naver_id_login.oauthParams.access_token);
		// 네이버 사용자 프로필 조회
		naver_id_login.get_naver_userprofile("naverSignInCallback()");
		// 네이버 사용자 프로필 조회 이후 프로필 정보를 처리할 callback function
		function naverSignInCallback() {
			//username = naver_id_login.getProfileData('username')
			//password = naver_id_login.getProfileData('password')
			email = naver_id_login.getProfileData('email')
			nickname = naver_id_login.getProfileData('nickname')
			//mobile = naver_id_login.getProfileData('mobile')
			//create_date = naver_id_login.getProfileData('create_date')
			//modify_date = naver_id_login.getProfileData('modify_date')
			
			location.href=	"naverLogin?email=" + email +
    				"&nickname=" + nickname
			
			/* location.href = "naverLogin?username=" + username + "&password=" + password
			+ "&email=" + email + "&nickname=" + nickname + "&mobile=" + mobile
			+ "&create_date=" + create_date + "&modify_date=" + modify_date */
		}
	</script>
</body>
</html>