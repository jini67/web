package 복습;

public class 기본형심화2 {

	public static void main(String[] args) {
		// 정수형 변수 4가지 
		// >> -128~127 까지 1byte >> byte
		//    -3만~3만 까지 2byte >> short
		//    -21억~21억 까지 4byte >> int
		//    21억 이상 8byte >> long
		
		byte age = 127;
		short days = 1000;
		int money = 100000; // ★ 자주사용
		long bank = 2300000000L; //long은 항상 숫자뒤에 L,l을 써줘야함!!
		
		// 실수형 변수 2가지 
		// 소수점 4자리까지 4byte >> float
		float height = 170.4F; // 숫자 뒤에 항상 F,f를 써줘야함
		// 소수점 4자리 이상 8byte >> double
		double weight = 43.333333; // ★ 자주사용
		// 문자 1 
		// 논리형 
		

	}

}
