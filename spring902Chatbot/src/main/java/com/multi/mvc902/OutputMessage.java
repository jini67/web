package com.multi.mvc902;

//서버가 각각의 클라이언트에게 배포할 내용을 넣는 역할 
// 서버에서 받은 데이터를 채팅창에 들어와있는 멤버 브라우저에게 보낼 데이터를 넣을 VO
// ==> messageBroker가 json으로 만들어서 브라우저에 보낸다.

public class OutputMessage {

	private String from;
	private String text;
	private String time;

	public OutputMessage() {
	}
	public OutputMessage(String from, String text, String time) {
		super();
		this.from = from;
		this.text = text;
		this.time = time;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "OutputMessage [from=" + from + ", text=" + text + ", time=" + time + "]";
	}

}
