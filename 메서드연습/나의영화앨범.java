package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나의영화앨범 {

	static int index = 2; // 현재 2부터 시작

	public static void main(String[] args) {
		String[] title = { "상견니", "바빌론", "아바타 : 물의길", "앤트맨과 와스프 : 퀀텀매니아", "스톰보이" };
		String[] img = { "상견니.jpg", "바빌론.jpg", "ava.jpg", "앤트맨.jpg", "스톰보이.jpg" };
		double[] jumsu = { 8.32, 7.76, 6.62, 8.14, 7.53 };

		JFrame f = new JFrame();
		f.setSize(300, 350);
		f.getContentPane().setBackground(Color.orange);

		Font font = new Font("바탕", Font.BOLD, 20); // 객체생성을 하는데, 특정한 입력값을 넣지 않으면 못만들게 함
		Font font2 = new Font("바탕", Font.BOLD, 10);

		// 배치부품(객체)를 바꾸어주지 않으면 경계레이아웃을 사용하도록 셋팅
		// = BorderLayout
		JLabel top = new JLabel(title[2]);
		top.setForeground(Color.red);
		top.setFont(font);
		f.add(top, BorderLayout.NORTH);

		// 포스터
		JLabel center = new JLabel();
		center.setFont(font);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);

		// 평점
		// String.valueOf() : int, double,... => String 으로 변환
		// int + ""
		// Integer.parse() : double, String,... => int 로 변환
		// Double.parse() : int, String,... => double 로 변환
		JLabel under = new JLabel(String.valueOf(jumsu[2]));
		under.setHorizontalAlignment(0); // 가운데로 오게하기
		under.setForeground(Color.darkGray);
		under.setFont(font);
		f.add(under, BorderLayout.SOUTH);

		JButton left = new JButton("<<"); // 왼쪽
		left.setBackground(Color.pink);
		left.setFont(font2);
		f.add(left, BorderLayout.WEST);

		// 액션처리 하는 방법
		// 1. 액션기능을 add
		// 2. 클릭액션이 있을 때 처리할 부품을 만들어주세요.
		// 3. 클릭액션이 있을 때 어떻게 처리할지 내용을 코딩해주세요.

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					// 현재 인덱스보다 하나 적은 값들로 top, center, under를 setting
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					under.setText(jumsu[index - 1] + "");
					index--; // index = index - 1; / index -= 1; 셋 다 같은내용
				} else {
					JOptionPane.showConfirmDialog(f, "첫번째 영화입니다.");
				}

			}
		});

		JButton right = new JButton(">>"); // 오른쪽
		right.setBackground(Color.pink);
		right.setFont(font2);
		f.add(right, BorderLayout.EAST);

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < 4) {
					// 현재 인덱스보다 하나 적은 값들로 top, center, under를 setting
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText(jumsu[index + 1] + "");
					index++; // index = index + 1; / index += 1; 셋 다 같은내용
				} else {
					JOptionPane.showConfirmDialog(f, "마지막 페이지");
				}

			}
		});

		// 프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}
}
