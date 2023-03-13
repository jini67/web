package 도서시스템_12조;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 도서_세이노 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("도서 상세정보");
		f.setSize(600, 1000);

		f.getContentPane().setBackground(Color.white);

		Font font = new Font("돋움", Font.BOLD, 30);
		Font font2 = new Font("돋움", Font.BOLD, 15);
		
		JLabel l1 = new JLabel(" - 상세정보 - ");
		l1.setFont(font);
		
		JLabel center = new JLabel();
		ImageIcon icon = new ImageIcon("세이노2.jpg");
		center.setIcon(icon);
		center.setHorizontalAlignment(0);
		
		JLabel l2 = new JLabel("               < 세이노의 가르침 >       저자 : 세이노         7,200 원                         ");
		l2.setFont(font2);
		
		JLabel l8 = new JLabel("                                                                ");
		
		JLabel l3 = new JLabel("       재야의 명저 《세이노의 가르침》 2023년판 정식 출간!       ");
		l3.setFont(font2);
		JLabel l4 = new JLabel("순자산 천억 원대 자산가, 세이노의 ‘요즘 생각’을 만나다. 2000년부터 발표된 ");
		l3.setFont(font2);
		JLabel l5 = new JLabel("그의 주옥같은 글들. 독자들이 자발적으로 만든 제본서는 물론, 전자책과 앱까지 나왔던");
		l3.setFont(font2);
		JLabel l6 = new JLabel("《세이노의 가르침》이 드디어 전국 서점에서 독자들을 마주한다. ");
		l3.setFont(font2);
		JLabel l7 = new JLabel("                           여러 판본을 모으고 저자의 확인을 거쳐 최근 생각을 추가로 수록하였다.                         ");
		l3.setFont(font2);
		JLabel l9 = new JLabel("                                                            ");
		
		JButton b1 = new JButton("리뷰");
		JButton b2 = new JButton("구매");
		
		f.setLayout(new FlowLayout());
		
		f.add(l1);
		f.add(center, BorderLayout.CENTER);
		f.add(l8);
		f.add(l2);
		f.add(l9);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(b1);
		f.add(b2);
		
		
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		
		f.setVisible(true);

	}

}
