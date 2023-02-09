package 배열;

public class 배열개념_확인문제 {

	public static void main(String[] args) {
		// 여러개의 데이터를 램에 저장해두고 CPU가 접근하여 사용하고
		// 싶은 경우 사용하는 부품
		// 1. 값을 이미 알고 있는 경우
		int[] week = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(week[0]);
		System.out.println(week[1]);
		System.out.println("전체 개수 : " + week.length); // 이 주소가 가리키는 length변수

		week[2] = 10;
		week[4] = 12;
		System.out.println(week[2]);
		System.out.println(week[4]);

		// 2. 값을 아직 모르고 있는데, 먼저 저장공간 만들어두고
		// 나중에 값을 넣는 경우
		int[] tour = new int[5];
		tour[0] = 20;
		tour[2] = 30;
		System.out.println("전체 개수 : " + tour.length);
	}

}