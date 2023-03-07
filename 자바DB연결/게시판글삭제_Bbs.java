package 자바DB연결;

import java.util.Scanner;

public class 게시판글삭제_Bbs {

	public static void main(String[] args) {
		
		//입력해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 title을 입력하세요.");
		
		String TITLE = sc.next();
		
		BbsDAO dao = new BbsDAO();
		dao.delete(TITLE);
	}

}
