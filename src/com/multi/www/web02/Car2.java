package com.multi.www.web02;
// com폴더 안에 multi폴더 안에 www폴더 안에 web02폴더를 한번에 만든것

public class Car2 {

	String color; // 주소(4바이트)
	int price; // 4
	int speed; // 4

	public static Car2 car2;

	// 싱글톤은 해당클래스에서 하나만 만들어서 제공!

	public static Car2 getInstance() {
		if (car2 == null) {
			car2 = new Car2("빨강", 100, 110);
		}
		return car2;
	}
	
	public void run() {
		System.out.println("달리자~~~~~!!!");
	}

	private Car2(String color, int price, int speed) {
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
