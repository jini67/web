package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제3 {

	public static void main(String[] args) {
		Random r = new Random(5);
		
		int[] n = new int[20];
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(900);
		}
		Arrays.sort(n); //오름차순
		
		System.out.println(n[19]);
	}
}