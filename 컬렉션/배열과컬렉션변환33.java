package 컬렉션;
import java.util.*;

public class 배열과컬렉션변환33 {

	public static void main(String[] args) {
		String[] s2 = {"aaa", "bbb", "ccc", "aaa"};
		stringPrint(s2);
	
		List<String> list3 = new ArrayList<String>(Arrays.asList(s2));
		list3.add("hahaha");
		list3.remove("bbb");
		list3.set(0, "hohoho");
		System.out.println(list3);
		
		//다시 배열로!
		String[] answer = new String[list3.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list3.get(i);
		}
		stringPrint(answer);

//		Object[] s33 = list3.toArray();
//		System.out.println("object>> " + Arrays.toString(s33));
//		
//		String[] s3 = list3.toArray(new String[list3.size()]); 
//		stringPrint(s3);
//		
//		List<Object> list4 = new ArrayList<Object>();
//		list4.add("a");
//		list4.add("b");
//		Object[] s4 = list4.toArray();
//		System.out.println(Arrays.toString(s4));
	}
	
	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
}
