package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		int[] x = new int[10];
		// index는 0부터 시작, 마지막 위치의 인덱스는 10보다 작음
		//0~9
		System.out.println(x.length);
		x[0] = 10;
		x[1] = 20;
		
		for (int i = 0; i < 10; i++) {
			System.out.println(x[i] + " ");
		}
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
		
		// 1. 우리가족의 성별을 char[]로 저장, 프린트
		char[] gender = {'여', '남'};
		System.out.println("내 성별은 : " + gender[0]);
		
		// 2. 우리가족의 이름을 String[]로 저장, 프린트
		String[] name = {"구구구", "윤윤윤", "진진진"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]);
		}
//		System.out.println("내 이름은 " + name[1] + name[2]);
		
		// 3. 우리가족의 시력을 double[]로 저장, 프린트
		double[] eyes = {1.0, 1.5, 0.9, 1.5};
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(eyes[i] + " ");
		}
		System.out.println();

		
		// 4. 우리가족이 점심을 먹었는지 boolean[]로 저장, 프린트
		boolean[] food = { true, true, false, true };
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		
		String[] s = new String[3];
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

	}

}
