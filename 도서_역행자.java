package 도서시스템_12조;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 도서_역행자 {

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
		ImageIcon icon = new ImageIcon("역행자2.jpg");
		center.setIcon(icon);
		center.setHorizontalAlignment(0);
		
		JLabel l2 = new JLabel("               < 역행자 >       저자 : 자청        17,500 원                   ");
		l2.setFont(font2);
		
		JLabel l8 = new JLabel("                                                            ");
		
		JLabel l3 = new JLabel("‘연봉 10억 무자본 창업가’로 유명해진 그는 2020년, 단 20개의 영상으로");
		l3.setFont(font2);
		JLabel l4 = new JLabel("10만 구독자를 넘어 화제를 모았으나 미련 없이 유튜브를 그만뒀다.");
		l3.setFont(font2);
		JLabel l5 = new JLabel("이후 다방면으로 사업을 확장하며 ‘라이프해커 자청’이라는 캐릭터와");
		l3.setFont(font2);
		JLabel l6 = new JLabel("‘무자본 창업’이라는 개념은 사람들의 고정관념을 깨는 상징이 됐다.");
		l3.setFont(font2);
		JLabel l7 = new JLabel("                           ‘역행자의 7단계 모델’을 통해 함께 ‘인생의 추월차선’으로 향하자.                         ");
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
