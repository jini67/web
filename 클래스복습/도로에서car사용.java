package 클래스복습;

public class 도로에서car사용 {

	public static void main(String[] args) {
		car car1 = new car();
		// 객체생성
		// 객체 1개 생성할 때 마다
		// 램에 2개씩 저장공간이 생김
		car1.color = "검정색";
		System.out.println(car1.color);
		car1.run();
		
		car car2 = new car();
		car2.color = "빨강색";
		System.out.println(car2.color);
		car2.run();
		car2.up();

	}

}
