package 형변환;

import java.util.ArrayList;

public class 형변환연습문제 {

	public static void main(String[] args) {
		
		ArrayList me = new ArrayList();
		me.add(1000); // Object <- Integer <- int
		me.add(189.1); // Object <- Double <- double
		me.add(false); // Object <- Boolean <- boolean
		me.add('남'); // Object <- Character <- char
		
		// ArrayList는 toString()이 재정의
		// me라는 참조형이기 때문에 me를 프린트하면 주소가 프린트~
		// toString()이 재정의한 내용은 주소가 가리키는 값들을 String으로 만들어주도록 정의함.
		// me를 찍어보면 주소대신 String으로 만든 내용이 출력
		
		int money = (Integer)me.get(0); // int <- Integer <- Object
		System.out.println(money + 2000);
		
		double height = (double)me.get(1);  // double <- Double <- Object
		System.out.println(height + 10);
		
		boolean food = (boolean)me.get(2);
		
		char gender = (char)me.get(3);
		
		if (food) { // if : 조건이 true이면 
			System.out.println("배불러요");
		} else { // false이면
			System.out.println("배고파요");
		}
		if (gender == '남') {
			System.out.println("주민번호는 1,3이예요");
		} else {
			System.out.println("주민번호는 2,4이예요");
		}

	}

}
