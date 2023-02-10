package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		// 
		int[] jumsu2 = new int[1000];
		
		Random r = new Random();
		
		// 2~20까지 임의로 만들어서 배열에 넣기
		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19) + 2;
		}
		for (int x : jumsu2) {
			System.out.println(x);
		}
		
		// 15 이상인 숫자 몇개인지 프린트!
		//배열은 전체를 가지고 와서, 3이상인것 체크
		//갯수를 써주세요
		int count = 0;
		int sum = 0;
		for (int i = 0; i < jumsu2.length; i++) {
			if (jumsu2[i] >= 15) {
				count++; //count = count + 1;
				sum = sum + jumsu2[i];
			}
		} //for
		System.out.println("15이상인 숫자 갯수 : " + count);
		System.out.println("15이상인 숫자 총 합 : " + sum);
	}

}
