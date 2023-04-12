package 배열문제;


import java.util.Arrays;

public class 문자열길이배열로리턴 { //프로그래머스 - 배열 원소의 길이

	public static void main(String[] args) {
		String[] strlist = { "I", "Love", "Programmers." };

		Solution2 sol = new Solution2();
		int[] answer = sol.solution(strlist);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution2 {
    public int[] solution(String[] strlist) {
        //int[] answer = {0, 0, 0};
    	int[] answer = new int[strlist.length];
    	for(int i = 0; i < strlist.length; i++) {
    		answer[i] = strlist[i].length();
    	}
    	
        return answer;
    }
}
