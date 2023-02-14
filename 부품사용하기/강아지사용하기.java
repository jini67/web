package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		// 강아지 1마리
		강아지 dog = new 강아지();
		dog.color = "황색";
		dog.field = "진돗개";
		dog.꼬리를흔들다();
		
		System.out.println(dog.color);
		System.out.println(dog.field);
	}

}
