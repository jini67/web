package com.multi.www.web02;
	// com폴더 안에 multi폴더 안에 www폴더 안에 web02폴더를 한번에 만든것

public class Car {
	// 멤버변수
	// 멤버메서드
	// toString()
	// 객체생성시 멤버변수값을 한꺼번에 넣어서 초기화하고 싶어요
	//-> 객체생성시 자동호출되는 메서드를 추가해주세요.
	//-> 생성자(메서드), costructor
	
	String color; //주소(4바이트)
	int price; //4
	int speed; //4
	
	public Car(String color, int price, int speed) {
		super();
		this.color = color;
		this.price = price;
		this.speed = speed;
	}

//	@Override
//	public String toString() {
//		return "car [color=" + color + ", price=" + price + ", speed=" + speed + "]";
//	}
//	
	
}
