package 형변환;

import java.util.ArrayList;

public class 형변환연습 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("김길동");
		list.add(500);
		list.add(12.3);
		list.add(true);

		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

		list.add(list);

		list.remove(0);
		System.out.println(list);

		list.remove(0);
		System.out.println(list);
		
		list.set(0, "정길동");
		System.out.println(list);
		
		int index = list.indexOf(true);
		System.out.println(index);
		
		boolean result = list.contains(10.5);
		System.out.println(result);

	}

}
