package 자바DB연결;

import 화면DB연결.ProductVO;

public class ProductDAO {
	// CRUD 기능을 메서드로 만들어준다.
	public void insert(ProductVO bag) {
		// 1. 가방이 전달되면 저장
		// 2. 필요할 때 가방에서 데이터를 하나씩 꺼내주세요.
		System.out.println("전달된 ID는 " + bag.getID());
		System.out.println("전달된 NAME은 " + bag.getNAME());
		System.out.println("전달된 CONTENT는 " + bag.getCONTENT());
	}
}
