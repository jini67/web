package 도서시스템_12조;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 도서_편의점3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("도서 상세정보");
		f.setSize(600, 1000);
		
		JTextField a1 = new JTextField(8);
		JTextField a2 = new JTextField(8);
		JTextField a3 = new JTextField(8);

		BookDAO dao = new BookDAO();
		BookVO bag = new BookVO();
		
		String title = a1.getText(); 
		String writer = a2.getText();
		String price = a3.getText();
		bag.setTITLE(title);
		bag.setWRITER(writer);
		bag.setPRICE(price);
		a1.setText(title);
		a2.setText(writer);
		a3.setText(price);
		
		
		
		f.getContentPane().setBackground(Color.white);

		Font font = new Font("돋움", Font.BOLD, 30);
		Font font2 = new Font("돋움", Font.BOLD, 15);
		
		JLabel l1 = new JLabel(" - 상세정보 - ");
		l1.setFont(font);
		
		JLabel center = new JLabel();
		ImageIcon icon = new ImageIcon("편의점2.jpg");
		center.setIcon(icon);
		center.setHorizontalAlignment(0);
		
		JLabel l2 = new JLabel("               < 불편한 편의점 >       저자 : 김호연         14,000 원                   ");
		l2.setFont(font2);
		
		JLabel l8 = new JLabel("                                                            ");
		
		JLabel l3 = new JLabel("김호연의 다섯 번째 장편소설 『불편한 편의점』이 나무옆의자에서 출간되었다.");
		l3.setFont(font2);
		JLabel l4 = new JLabel("『불편한 편의점』은 청파동 골목 모퉁이에 자리 잡은 작은 편의점을 무대로 ");
		l3.setFont(font2);
		JLabel l5 = new JLabel("힘겨운 시대를 살아가는 우리 이웃들의 삶의 속내와 희로애락을 ");
		l3.setFont(font2);
		JLabel l6 = new JLabel("따뜻하고 유머러스하게 담아낸 작품이다. 서울의 오래된 동네 청파동에 대한");
		l3.setFont(font2);
		JLabel l7 = new JLabel("                           공감각을 생생하게 포착해 흥미진진한 ‘동네 이야기’를 탄생시켰다.                         ");
		l3.setFont(font2);
		JLabel l9 = new JLabel("                                                            ");
		
		JButton b1 = new JButton("리뷰");
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JButton b2 = new JButton("구매");
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		f.setLayout(new FlowLayout());
		
		f.add(l1);
		f.add(center, BorderLayout.CENTER);
		f.add(a1);
		f.add(a2);
		f.add(a3);
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
