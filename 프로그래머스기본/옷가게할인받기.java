package 프로그래머스기본;

public class 옷가게할인받기 {

	public static void main(String[] args) {
		int price = 580000;
		Solution5 sol = new Solution5();
		int answer = sol.solution(price);
		System.out.println(price);
	}

}

class Solution5 {
    public int solution(int price) {
    	int answer = 0;
    	if(price >= 500000) {
    		answer = (int)(price - price * 0.2);
    	}else if(price >= 300000) {
    		answer = (int)(price - price * 0.1);
    	}else if(price >= 100000){
    		answer = (int)(price - price * 0.05);
    	}else {
    		answer = price;
    		}
        return answer;
    }
}