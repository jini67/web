package 도서시스템_12조;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 도서_상세정보5 {

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
		ImageIcon icon = new ImageIcon("슬램덩크2.jpg");
		center.setIcon(icon);
		center.setHorizontalAlignment(0);
		
		JLabel l2 = new JLabel("               < 슬램덩크 리소스 >       저자 : 이노우에 타케히코         20,000 원                   ");
		l2.setFont(font2);
		
		JLabel l8 = new JLabel("                                                               ");
		
		 
		
		
		JLabel l3 = new JLabel("이노우에 다케히코가 영화를 제작하는 과정에서 그린 ");
		l3.setFont(font2);
		JLabel l4 = new JLabel("「글」과 「그림」을 풍성하게 수록 & 분석!!");
		l3.setFont(font2);
		JLabel l5 = new JLabel("                           영화 제작 결정 후 영화가 개봉될 때까지 공개된 포스터와 티저 비주얼 게재!!        ");
		l3.setFont(font2);
		JLabel l6 = new JLabel("           ");
		
		JButton b1 = new JButton("리뷰");
		JButton b2 = new JButton("구매");
		
		f.setLayout(new FlowLayout());
		
		f.add(l1);
		f.add(center, BorderLayout.CENTER);
		f.add(l8);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(b1);
		f.add(b2);
		
		
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		
		f.setVisible(true);

	}

}
