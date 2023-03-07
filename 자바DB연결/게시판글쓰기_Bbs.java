package 자바DB연결;

import java.util.Scanner;

public class 게시판글쓰기_Bbs {

	public static void main(String[] args) {
		
		//입력해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("no/title/content/writer 순으로 입력하세요.");
		int no = sc.nextInt();
		String TITLE = sc.next();
		String CONTENT = sc.next();
		String WRITER = sc.next();
		
		BbsDAO dao = new BbsDAO();
		dao.insert(no, TITLE, CONTENT, WRITER);
	}

}
