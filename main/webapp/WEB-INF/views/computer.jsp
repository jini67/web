<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 결과창! html 자동으로 들어가있어서 안써줌 -->
<table border=1>
	<tr>
		<td>항목명</td>
		<td>가격</td>
	</tr>
	<tr>
		<td>${vo.com}</td>
		<td>${vo.price}</td>
	</tr>
	<tr>
		<td>${vo.mouse}</td>
		<td>${vo.price2}</td>
	</tr>
	<tr>
		<td>총합계</td>
		<td>${vo.sum}</td>
	</tr>
</table>
