package 도서시스템_12조;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class BookUI2 {

	public static void main(String[] args) {
		// 프로그램 시작하자마자 DB에서 데이터를 가져와서 
		// 화면을 만들어주고 싶음.
		JFrame f = new JFrame();
		f.setSize(500, 700);
		
		BookDAO dao = new BookDAO();
		ArrayList<BookVO> list = dao.list(); // ArrayList<MemberVO>
		
		String[] header = {"책 제목", "저자", "가격", "상세내용"};
		Object[][] all = new String[list.size()][4];
		
		
		if (list.size() == 0) {
			System.out.println("검색결과 없음. ");
		} else {
			System.out.println("검색결과는 전체 " + list.size() + "개 입니다.");
			for (int i = 0; i < all.length; i++) { //13개의 가방,13개의 행  
				all[i][0] = list.get(i).getTITLE();
				all[i][1] = list.get(i).getWRITER();
				all[i][2] = list.get(i).getPRICE();
				all[i][3] = list.get(i).getCONTENT();
			}
		}//else  
		
		JTable table = new JTable(all, header);
		JScrollPane scroll = new JScrollPane(table);
		f.setLayout(new FlowLayout());
		f.add(scroll);
		
		f.setVisible(true);
	}//main
}