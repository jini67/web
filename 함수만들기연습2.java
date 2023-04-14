package 문자열;

public class 함수만들기연습2 {
	
	public static void 세수하기() {
		System.out.println("세수 1) 머리를 묶는다.");
		System.out.println("세수 2) 세수를 한다.");
	}
	public static void 밥먹기(String when) {
		for (int i = 0; i < 5; i++) {
			System.out.println(when + "밥 1) 밥통에서 밥을 푼다.");
			System.out.println(when + "밥 2) 반찬을 챙겨서 먹는다.");
		}
	}
	public static void 운동하기(String location) {
		System.out.println("운동 1) 신발을 신는다.");
		System.out.println("운동 2) " + location +  "에 간다.");
		System.out.println("운동 3) 운동을 한다.");
	}
	public static void 잠자기(String sleep) {
		System.out.println("잠 1) 침대에 눕는다.");
		System.out.println("잠 2) 이불을 덮는다");
		System.out.println("잠 3) " + sleep + "을 잔다.");
	}
	public static void 화장하기() {
		System.out.println("화장 1) 세수를 한다.");
		System.out.println("화장 2) 거울을 본다.");
		System.out.println("화장 3) 화장품을 바른다.");
	}

	public static void main(String[] args) {
		// 내가 일어나서 하는 일
		// 1. 세수하기
		세수하기();
		// 2. 밥먹기(아침)
		밥먹기("아침");
		// 3. 운동하기(운동장)
		운동하기("운동장");
		// 4. 잠자기(낮잠)
		잠자기("낮잠");
		// 5. 밥먹기(점심)
		밥먹기("점심");
		// 6. 세수하기(외출준비)
		세수하기();
		// 7. 화장하기
		화장하기();
		// 8. 밥먹기(저녁)
		밥먹기("저녁");
		// 9. 운동하기(공원)
		운동하기("공원");
		// 10. 잠자기(저녁)
		잠자기("밤잠");

	}

}
