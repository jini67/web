package 컬렉션;

public class 편지 {

	public static void main(String[] args) {
		String letter = "할머니 사랑해요!!!";
		Solution9 sol = new Solution9();
		int answer = sol.solution(letter);
		System.out.println(answer);
	}

}

class Solution9 {
    public int solution(String message) {
    	return message.length()*2;
    }
}