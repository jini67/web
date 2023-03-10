package 도서시스템_12조;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import 자바DB연결.MemberDAO3;
import 화면DB연결.MemberVO;

public class BookUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("도서 상세정보");
		f.setSize(500, 700);
		f.getContentPane().setBackground(Color.white);
		
		JLabel l1 = new JLabel("상세정보");
		JLabel center = new JLabel();
		ImageIcon icon = new ImageIcon("편의점.jpg");
		center.setIcon(icon);
		
		
		BookDAO dao = new BookDAO();
		ArrayList<BookVO> list = dao.list(); // ArrayList<MemberVO>
		
		String[] header = {"책제목", "저자", "가격"};
		Object[][] all = new String[list.size()][5];
		
		
		if (list.size() == 0) {
			System.out.println("검색결과 없음. ");
		} else {
			System.out.println("검색결과는 전체 " + list.size() + "개 입니다.");
			for (int i = 0; i < all.length; i++) { //13개의 가방,13개의 행  
				all[i][1] = list.get(i).getTITLE();
				all[i][2] = list.get(i).getWRITER();
				all[i][3] = list.get(i).getPRICE();
			}
		}//else  
		
		JTable table = new JTable(all, header);
		JScrollPane scroll = new JScrollPane(table);
		
		JButton b1 = new JButton("리뷰");
		JButton b2 = new JButton("구매");
		
		f.setLayout(new FlowLayout());
		
		f.add(l1);
		f.add(center, BorderLayout.CENTER);
		f.add(scroll);
		f.add(b1);
		f.add(b2);
		
		
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		
		f.setVisible(true);
	}//main
}
