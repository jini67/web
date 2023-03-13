package 도서시스템_12조;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 도서_김미경 {

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
		ImageIcon icon = new ImageIcon("김미경1.jpg");
		center.setIcon(icon);
		center.setHorizontalAlignment(0);
		
		JLabel l2 = new JLabel("               < 김미경의 마흔 수업 >       저자 : 김미경         18,000 원                   ");
		l2.setFont(font2);
		
		JLabel l8 = new JLabel("                                                            ");
		
		JLabel l3 = new JLabel("이 책은 뭔가를 시작하기엔 이미 늦었다고 생각하는 사람들,");
		l3.setFont(font2);
		JLabel l4 = new JLabel("마흔이 되도록 이룬 게 없다고 생각하는 사람들, 40대를 어떻게 보내야 할지");
		l3.setFont(font2);
		JLabel l5 = new JLabel("모르는 사람들을 위한 일종의 성장 매뉴얼이다. 마흔에 대한 막연한 불안감을");
		l3.setFont(font2);
		JLabel l6 = new JLabel("해소하고, 여러 역할 속에서 인생의 균형을 찾으며 인생 후반전을");
		l3.setFont(font2);
		JLabel l7 = new JLabel("                           재미있게 살아갈 수 있도록 ‘인생 힌트’를 주는 응원과 솔루션이 가득하다.                         ");
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
