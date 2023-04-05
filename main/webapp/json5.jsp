<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//스크릿트릿
JSONObject json = new JSONObject();
json.put("id", "apple1");
json.put("pw", "apple1");
json.put("name", "apple1");
json.put("tel", "apple1");

JSONObject json2 = new JSONObject();
json.put("id", "apple2");
json.put("pw", "apple2");
json.put("name", "apple2");
json.put("tel", "apple2");

JSONObject json3 = new JSONObject();
json.put("id", "apple3");
json.put("pw", "apple3");
json.put("name", "apple3");
json.put("tel", "apple3");

JSONObject json4 = new JSONObject();
json.put("id", "apple4");
json.put("pw", "apple4");
json.put("name", "apple4");
json.put("tel", "apple4");

JSONArray array = new JSONArray();
array.add(json);
array.add(json2);
array.add(json3);
array.add(json4);
%><%=array.toJSONString()%>