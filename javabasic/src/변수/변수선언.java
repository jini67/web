package 변수;

public class 변수선언 {

	public static void main(String[] args) {
		// 자바는 변수를 만들 때, 어떤 타입의 데이터를 넣을지 미리 결정
		// 선언!! 타입 변수명!! ==> 변수가 생성됨!
		// 기본 데이터 => 정수, 실수, 문자1, 논리
		
		int num = 100; //정수변수
		double num2 = 22.2; //실수변수, 22.0, 22(정수를 넣을 수 있음)
		char c = '한'; //한글자만 쓸 땐 작은따옴표 ''
		String name = "홍길동"; //여러글자를 쓸 때는 ""
		boolean b = true; //true & false
		num = 200; //가능
		// b = 300; 불가능
		System.out.println("정수값은" + num);
		System.out.println("실수값은" + num2);
		System.out.println("문자1개 값은" + c);
		System.out.println("문자 여러개 값은" + name);
		System.out.println("부울렌값은" + b);

	}

}
