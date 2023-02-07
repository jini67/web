package 조건문;

import java.util.Date;

public class IF문7 {

	public static void main(String[] args) {
		Date date = new Date();
		
		int year = date.getYear() + 1900;
		
		if (year >= 2000) {
			System.out.println("밀레니엄 세대시군요");
		}
		
		int day = date.getDay();
		
		switch (day) {
		case 6: case 0:
			System.out.println("쉬자");
			break;
		default:
			System.out.println("열심히 공부하자");
			break;
		}
		
		int month = date.getMonth() + 1;
		
				
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지");
			break;

		default: //나머지
			System.out.println("31일까지");
			break;
		}
	}

}
