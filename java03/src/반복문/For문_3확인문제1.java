package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class For문_3확인문제1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(350, 400);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		JButton b1 = new JButton();
		b1.setText("별10개");
		JButton b2 = new JButton();
		b2.setText("커피*5");
		JButton b3 = new JButton();
		b3.setText("커피*우유3개");
		JButton b4 = new JButton();
		b4.setText("1:짱!");

		Font font = new Font("D2Coding", 1, 45);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		// 1. 버튼에 액션기능을 추가하겠다고 설정
		// 2. 클릭 액션이 있을 때 어떤 부품이 액션 처리를 어떻게 할지 코딩해주면 됨.
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리하고 싶은 내용!!
				System.out.println("b1을 클릭했음");
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리하고 싶은 내용!!
				System.out.println("b2를 클릭했음");
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리하고 싶은 내용!!
				System.out.println("b3를 클릭했음");
			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리하고 싶은 내용!!
				System.out.println("b4를 클릭했음");
			}
		});

		f.setVisible(true);
	}

}
