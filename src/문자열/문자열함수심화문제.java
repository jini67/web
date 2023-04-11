package 문자열;

import java.util.Arrays;

public class 문자열함수심화문제 {

	public static void main(String[] args) {
		String s5 = "[  10, 20, 30, 40, 50]";
		// 6. String s5 = " [  10, 20, 30, 40, 50]"에서 
		// 모든 데이터를 꺼내어 합한 값을 프린트(힌트)
		// [, ] – replace()를 이용하여 제거 
		s5 = s5.replace("[", "");
		s5 = s5.replace("]", "");
		System.out.println(s5);

		s5 = s5.trim();
		System.out.println(s5);

		System.out.println(s5.length()); // 18글자
		String[] s55 = s5.split(", "); // {"10", "20", "30", ~~~}
		System.out.println(s55[0]);
		System.out.println(s55[1]);
		System.out.println(s55[2]);

		int sum = 0; // "10" --> 10, "20" --> 20 ==> 10 + 20(30)

		for (String x : s55) { // {"10", "20", "30", ~~~}
			int x2 = Integer.parseInt(x);
			sum = sum + x2;
		}

		System.out.println(sum);

		// 10 - trim()을 이용하여 공백 제거
		// ,를 기준으로 split()를 이용하여 배열로 분리
		// 배열로 분리된 값을 꺼내 정수로 변환후, 합해줌.
		// 7.  위 6번에서 생성된 String[]의 값을 새로운 int[]로 옮겨서 오름차순 정렬후, 프린트!
		System.out.println(s55.length);
		int[] newArray = new int[s55.length];// {0,0,0,0,0}
		// {"10", "20", "30", ~~~}
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = Integer.parseInt(s55[i]);
		}
		System.out.println(Arrays.toString(newArray));
		
		
	}

}