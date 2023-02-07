package 순차문;

import javax.swing.JOptionPane;
//부품이 있는 위치를 알려주는 역할

public class 순차문3 {

	public static void main(String[] args) {
		// 기본순차문 == 입력 --> 처리 --> 출력
		// 입력 -> 부품사용, 망치같은 언제나 바로 사용할 수 있는 것!!
		String tall = JOptionPane.showInputDialog("신장을 입력하세요");
		String kg = JOptionPane.showInputDialog("체중을 입력하세요");
		
		// 처리 -> 숫자 더하기 연산
		//       String을 int로 변경해주어야 함.

		double tall1 = Double.parseDouble(tall);
		double kg1 = Double.parseDouble(kg);

		double result = (tall1 - kg1) * 0.9; // 결과는 double
		
		// 출력 -> 모니터 화면에 보이고 싶음
		System.out.println(result);
	}

}
