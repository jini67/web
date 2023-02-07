package 제어문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// 프로그램을 어떤 순서대로 짜야할까?
		// 1. 입력 : 데이터를 가지고 옴
		// 2. 처리 : 특정한 작업 수행
		// 3. 출력 : 처리한 내용을 보여줌
		// 자바는 자주 사용하는 부품을 대문자로 바로 쓸 수 있다

		// 외부에서 대화창같은 것으로 입력받은 경우는 무조건 컴퓨터는 String(문자열)로 인식
//		1. 입력
//		당신이 좋아하는 운동은? 헬스
		String data1 = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
		
//		당신이 운동하기 좋아하는 요일은? 금요일
		String data2 = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");
//
//		2. 처리
//		금요일에 저는 헬스를 합니다.
		String result = data2 + "에 저는 " + data1 + "를 합니다.";
		
//		3. 출력
		System.out.println(result);
		}

}
