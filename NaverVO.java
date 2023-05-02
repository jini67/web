package com.multi.mini01;

import java.sql.Date;

public class NaverVO {
	private String username;
	private String password;
	private String email;
	private String nickname;
	private String mobile;
	private Date create_date;
	private Date modify_date;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getModify_date() {
		return modify_date;
	}
	public void setModify_date(Date modify_date) {
		this.modify_date = modify_date;
	}
	@Override
	public String toString() {
		return "NaverVO [username=" + username + ", password=" + password + ", email=" + email + ", nickname="
				+ nickname + ", mobile=" + mobile + ", create_date=" + create_date + ", modify_date=" + modify_date
				+ "]";
	}
	
	
}
