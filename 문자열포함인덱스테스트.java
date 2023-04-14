package 문자열;

public class 문자열포함인덱스테스트 {

	public static void main(String[] args) {
		String s = "aaabbccadda";
		
		// 포함되는게 있는지 확인, 결과는 true / false
		System.out.println(s.contains("a"));
		System.out.println(s.contains("aaa"));
		System.out.println(s.contains("bc"));
		
		// 위치 찾기
		System.out.println(s.indexOf("a")); // 가장 앞에있는 a의 위치
		System.out.println(s.lastIndexOf("a")); // 가장 마지막에 있는 a의 위치
		System.out.println(s.lastIndexOf("a", 3)); // 0~2 사이에서 가장 마지막 a의 위치, 범위를 정한것
		System.out.println(s.lastIndexOf("a", 8)); // 0~7 사이에서 가장 마지막 a의 위치
		System.out.println(s.indexOf("f")); // 없으면 결과는 -1

	}

}