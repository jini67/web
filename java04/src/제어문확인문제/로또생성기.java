package 제어문확인문제;

import java.util.Random;

public class 로또생성기 {

	public static void main(String[] args) {
		// 아무값이나 발생시키는 부품 ==> Randon
		// 가짜 랜덤을 만들어주는 부품. 시드값이 정해져있음
		// r.nextInt(45) : 0~44
		Random r = new Random(10); //Random()안에 넣은 숫자 >> 씨앗값, seed값
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + (r.nextInt(45) + 1)); //0~9
		}
		
			// 2~10
			Random a = new Random();
			for (int i = 0; i < 6; i++) {
				System.out.println(a.nextInt(9) + 2);
		}
			
			// 3~30
			Random b = new Random();
			for (int i = 0; i < 6; i++) {
				System.out.println(b.nextInt(28) + 3);
			}
		
	}

}
