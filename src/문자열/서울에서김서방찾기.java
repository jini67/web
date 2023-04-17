package 문자열;

public class 서울에서김서방찾기 {

	public static void main(String[] args) {
		String[] s = {"Jane", "kim"};
		String answer = "";
		int findIndex = 0;
		// Kim이 어디있는지 위치를 찾기!
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("kim")) {
				findIndex = i;
			}
		}
		answer = "김서방은 " + findIndex + "에 있다.";
		System.out.println(answer);
	}

}
