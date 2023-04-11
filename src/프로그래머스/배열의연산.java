package 프로그래머스;

import java.util.Scanner;

public class 배열의연산 {
	// {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 
	// 세 수를 더했을 때 가장 큰 숫자를 구해보세요.
	// 배열이 오름차순으로 정렬되어있는 상태

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double answer = sol.solution(numbers); // int[]
		System.out.println(answer);
	}
}

class Solution4 {
	public int solution(int[] numbers) {
		int answer = numbers[numbers.length - 3] + numbers[numbers.length - 2] + numbers[numbers.length - 1];
		return answer;
	}
}