package 조건문;

public class IF문3 {

	public static void main(String[] args) {
		int id = 1111;
		int id2 = 2222;
		//idx,idy가 같은지 비교해보고
		//같으면 "로그인 성공" 프린트
		//같지 않으면 "로그인 실패" 프린트
		
		if (id == id2) {
			System.out.println("동일합니다.");
		} else {
			System.out.println("동일하지 않습니다.");
		}
	}

}
