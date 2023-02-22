package 인터페이스;

public class 컴퓨터사용2 {

	public static void main(String[] args) {
		// 익명클래스
		// 인터페이스는 불완전하기 때문에 이것을 틀로 해서 객체생성 불가능!
		Computer com = new Computer() {
			
			@Override
			public void 코딩하다() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void 인터넷하다() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void 유튜브하다() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}