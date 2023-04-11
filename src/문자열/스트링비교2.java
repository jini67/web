package 문자열;

import java.awt.List;
import java.util.Arrays;

public class 스트링비교2 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		
		// 1. String[]로 바꾸어보세요
		String[] all2 = all.split(",");
		System.out.println(all2[0]);
		System.out.println(all2[1]);
		System.out.println(all2[2]);
		System.out.println(all2[3]);
		
		// 2. 바꾸었더니 공백이 포함되어있다면, 공백을 모두 제거 후
		//	  다시 배열에 넣으세요
		for (int i = 0; i < all2.length; i++) {
			if(all2[i].contains(" ")) {
			all2[i] = all2[i].trim();
			}
		}
		System.out.println(Arrays.toString(all2));
		System.out.println(all2[1]);
		
		// 3. 과목수는?
		System.out.println("과목수 : " + all2.length);
		
		// 4. 컴퓨터의 위치는?
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].equals("컴퓨터")) {
				System.out.println(i + "번째");
			}
		}
		
		// 5. 과목명이 3글자 미만인 과목수는?
		int count = 0;
		for (int i = 0; i < all2.length; i++) {
			if(all2[i].length() < 3) {
				count++;
			}
		}
		System.out.println(count + "개");
		
		java.util.List<String> list = Arrays.asList(all2);
		System.out.println(list.indexOf("컴퓨터"));
		
	}

}
