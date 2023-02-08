package 복습;

public class 조건문 {

	public static void main(String[] args) {
		int target = 77; // 숫자맞추기를 해봅시다.
		int me = 88;

		//조건은 비교하는 코드가 들어감. 결과가 무조건 논리형(true/false)
		if (target == me) {
			System.out.println("정답입니다!");
		} else {
			System.out.println("오답입니다!");
		}
		// if는 조건이 만족하면 처리하고 더이상 실행 X
		// if문은 자체 break기능이 있음.

		// switch case는 자체 break기능이 없음.
		// 내가 멈추고 싶은 곳에 break 써주어야 함
		String you = "로또";
		switch (you) {
		case "로또":
			System.out.println("정답이다!");
			break;
		case "신나": case "놀자": case "나가자":
			System.out.println("오답이다!");
			break;
		default:
			System.out.println("그만해!");
			break;
		}
	}

}
