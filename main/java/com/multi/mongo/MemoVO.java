package com.multi.mongo;

public class MemoVO {

	private Integer age;
	private String name;
	private String office;
	private String phone;
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "MemoVO [age=" + age + ", name=" + name + ", office=" + office + ", phone=" + phone + "]";
	}
	
	
	
}
