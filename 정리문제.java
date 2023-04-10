package 배열;

import java.util.Random;
import java.util.Scanner;

public class 정리문제 {

	public static void main(String[] args) {
		// 1번문제
		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		int min = n[0];
		int[] s1 = { 55, 66, 77, 22, 33 };

		for (int x : n) {
			if (x < min) {
				min = x;
			}
		} // for
		System.out.println("최소값은 " + min);
	}
}