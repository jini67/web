package 배열;

public class 배열개념_확인문제2 {

	public static void main(String[] args) {
		int[] x = new int[5];
		//전체 만들어지는 변수의 개수는 7개
		System.out.println("배열의 크기는 " + x.length);
		//배열의 크기, 길이, 사이즈 ==> .length
		
		x[0] = 100;
		x[4] = 500;
		x[2] = 200;
		System.out.println("첫번째: " + x[0] + ", 다섯번째: " + x[4]  + ", 세번째: " + x[2]);
		
		//index 0~4
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		for (int i = 0; i < x.length; i++) {
			System.out.println(i + ": " + x[i]);
		}
	}

}
