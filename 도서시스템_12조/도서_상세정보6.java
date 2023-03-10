package 도서시스템_12조;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 도서_상세정보6 {

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
		ImageIcon icon = new ImageIcon("하얼빈2.jpg");
		center.setIcon(icon);
		center.setHorizontalAlignment(0);
		
		JLabel l2 = new JLabel("               < 하얼빈 >       저자 : 김훈         16,000 원                   ");
		l2.setFont(font2);
		
		JLabel l8 = new JLabel("                                                            ");
		
		JLabel l3 = new JLabel("난세를 헤쳐가야 하는 운명을 마주한 인간의 내면에 집중하는 김훈의 시선은");
		l3.setFont(font2);
		JLabel l4 = new JLabel("『하얼빈』에서 더욱 깊이 있고 오묘한 장면들을 직조해낸다. 이토 히로부미로");
		l3.setFont(font2);
		JLabel l5 = new JLabel("상징되는 제국주의의 물결과 안중근으로 상징되는 청년기의 순수한 열정이 부딪치고,");
		l3.setFont(font2);
		JLabel l6 = new JLabel("살인이라는 중죄에 임하는 한 인간의 대의와 윤리, 천주교인으로서 지닌");
		l3.setFont(font2);
		JLabel l7 = new JLabel("                                        신앙심과 속세의 인간으로서 지닌 증오심이 부딪친다.                                ");
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
