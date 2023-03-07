package 자바DB연결;

import java.util.Scanner;

public class 게시판수정하기_Bbs {

	public static void main(String[] args) {
		
		//입력해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("no/content 순으로 입력하세요.");
		int no = sc.nextInt();
		String CONTENT = sc.next();
		
		BbsDAO dao = new BbsDAO();
		dao.update(no, CONTENT);
	}

}
