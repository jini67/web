package 상속;

import 복습.직원;

public class 직원사용 {

	public static void main(String[] args) {
		직원 work = new 직원(); //f2
		work.name = "홍길동"; // public
		
		//work.adress = "강남구"; // default
		// 다른패키지에서 접근해서 에러
		
		//work.salary = 100; // protected
		// ==> 다른 패키지인 경우 상속관계에서만 됨!
	}

}
