package 배열응용;

import java.util.Random;

public class 수능만점자문제 {

	public static void main(String[] args) {
		// 수능 10000명의 점수를 처리! ==> 배열 필요
		int[] jumsu = new int[10000];
		//jumsu = {0,0,0,0,0,0,...};
		
		// 랜덤으로 10000명의 점수를 넣어주세요 ==> Random 필요
		Random r = new Random(42);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451); //0~450
		}
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(i + ": " + jumsu[i]);
		}
		System.out.println("-----------------");
		
		// 0~450
		// 1. 만점자가 몇명인지? 누구인지? (index)
		// 2. 0점이 몇명인지?
		int maxCount = 0;
		int zeroCount = 0;
		for (int x : jumsu) {
			// 점수가 450과 동일한지 체크(조건문)해서 true이면 카운트 증가 
			if (x == 450) {
				maxCount++; // maxCount = maxCount + 1;
			} //if
			if (x == 0) {
				zeroCount++;
			} //if
		} //for
		System.out.println("수능 만점자: " + maxCount + "명");
		System.out.println("수능 0점자: " + zeroCount + "명");
		
		// 3. 평균은 몇점인지? >> 합계를 먼저 구해야 함
		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x; // sum += x;
		}
		double avg = (double)sum / jumsu.length;
		System.out.println("전체 수험생의 평균은 " + avg);
		
		// (심화) 4.평균보다 +-50점인 학생 카운트(포함, >=)
		int avgPlusMinus = 0; //선언! 할 때 자바는 변수를 만들어준다!!
		// 250~300, avg = 300인 경우
		// avg-50 <= x <= acg+50 --> avg-50 <= x && x <= acg+50
		for (int x : jumsu) {
			if ((avg-50 <= x) && (x <= avg+50)) {
				avgPlusMinus++;
			}
		} //for
		System.out.println("평균 범위에 있는 수험생 수는 " + avgPlusMinus + "명");
		
		// 상위 30% 점수들의 평균
		
	}

}
