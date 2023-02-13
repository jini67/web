package 배열심화;

public class 배열깊은복사 {

	public static void main(String[] args) {
		int[] num3 = {100, 200, 300 };
		//int[] num4 = num3; // 참조형의 복사(얇은 복사)
		int[] num4 = num3.clone(); // 참조형의 복사(깊은 복사)
		
		num3[0] = 999;
		
		for (int x : num3) {
			System.out.println(x + " ");
		}
		System.out.println();
		
		for (int x : num4) {
			System.out.println(x + " ");
		}

	}

}
