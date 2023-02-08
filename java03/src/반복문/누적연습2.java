package 반복문;

import javax.swing.JOptionPane;

public class 누적연습2 {

	public static void main(String[] args) {
		
		// 숫자 누적
		int sum = 0;
		for (int i = 1; i <= 300; i++) {
			if (i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("전체 더한 값은 " + sum);
		
		// 글자 누적
		String sum2 = ""; //String의 초기값은 ""
		for (int i = 0; i < 4; i++) {
			String data = JOptionPane.showInputDialog("먹고 싶은 음식 4가지 입력");
					sum2 = sum2 + data + "랑 ";
		}
		System.out.println("먹고 싶은 음식 종류 " + sum2);
	}

}
