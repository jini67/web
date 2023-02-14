package 클래스복습;

public class 벽돌틀 {
	// 멤버변수, 성질
	// 전역변수(글로벌변수), 자동초기화시켜줌.
	int x = 0;
	int y = 0;
	String color = null; //참조형은 null로 초기화
	
	//멤버메서드, 동작
	public void 쌓다() {
		int move = 50; // 지역변수(로컬변수), 자동초기화X
		System.out.println(move + "만큼 벽돌을 쌓다.");
	}
	
}
