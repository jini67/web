package 문자열문제;


public class 머쓱이보다키큰사람 {

	public static void main(String[] args) {
		int[] array = {149, 180, 198, 170};
		int height = 167;
		Solution6 sol = new Solution6();
		int answer = sol.solution(array, height);
		System.out.println(answer);
	}

}

class Solution6 {
    public int solution(int[] array, int height) {
    	 int answer = 0; //count
         for(int x : array) {
         	if(x > height) {
         		answer++;
         	}
         }
        return answer;
    }
}