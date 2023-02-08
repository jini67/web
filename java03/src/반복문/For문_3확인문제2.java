package 반복문;

import javax.swing.JOptionPane;

public class For문_3확인문제2 {

	public static void main(String[] args) {
		// 1.
		for (int i = 0; i < 10; i++) {
			System.out.print("*"); // ln을 지우면 가로로 보여짐
		}
		
		System.out.println(); // 세로줄 공백 넣기
		
		// 2.
		for (int i = 0; i < 5; i++) {
			System.out.print("커피*");
		}
		
		System.out.println(); // 세로줄 공백 넣기
		
		// 3.
		for (int i = 0; i < 3; i++) {
			System.out.println("커피*우유");
		}
		
		//4.
		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + ": 짱!");
		}
	}

}
