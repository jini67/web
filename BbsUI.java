package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 자바DB연결.BbsDAO;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 자바DB연결.BbsDAO;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BbsUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 게시판");
		f.setSize(400, 700);
		
		JLabel l1 = new JLabel("☆★나의 게시판★☆");
		JLabel l2 = new JLabel("게시판 n o");
		JLabel l3 = new JLabel("게시판 제 목");
		JLabel l4 = new JLabel("게시판 내 용");
		JLabel l5 = new JLabel("게시판 작성자");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("게시물 작성하기");
		JButton b2 = new JButton("게시물 삭제하기");
		JButton b3 = new JButton("게시물 검색하기");
		JButton b4 = new JButton("게시판 검색하기");
		
		// f에 위에 있는 요소들을 add로 붙여주어야 하는데,
		// 붙이는 순서대로 물흐르듯이 붙여주고 싶음.
		// 물흐르듯 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();
		
		// 폰트를 설정하기 위해 font부품 필요
		Font font = new Font("돋움", Font.BOLD, 30);
		
		// ★필요한 부품(객체)를 ram에 가져다놓기. 준비 끝!★
		// ☆조립 시작☆
		f.setLayout(flow);
		
		f.add(l1); 
		f.add(l2); f.add(t1);
		f.add(l3); f.add(t2);
		f.add(l4); f.add(t3);
		f.add(l5); f.add(t4);
		f.add(b1); f.add(b2);
		f.add(b3); f.add(b4);
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		t1.setBackground(Color.pink);
		t1.setForeground(Color.DARK_GRAY);
		t2.setBackground(Color.pink);
		t2.setForeground(Color.DARK_GRAY);
		t3.setBackground(Color.pink);
		t3.setForeground(Color.DARK_GRAY);
		t4.setBackground(Color.pink);
		t4.setForeground(Color.DARK_GRAY);
		
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.blue);
		b2.setBackground(Color.yellow);
		b2.setForeground(Color.blue);
		b3.setBackground(Color.yellow);
		b3.setForeground(Color.blue);
		b4.setBackground(Color.yellow);
		b4.setForeground(Color.blue);
		
		// 검색기능
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시판검색처리");
				String no = t1.getText();
				int no2 = Integer.parseInt(no);
				
				BbsDAO dao = new BbsDAO();
				BbsVO bag = dao.one(no2);
				if(bag != null) {
					t2.setText(bag.getTITLE());
					t3.setText(bag.getCONTENT());
					t4.setText(bag.getWRITER());
					t2.setBackground(Color.pink);
					t3.setBackground(Color.pink);
					t4.setBackground(Color.pink);
				}else {
					t2.setText("");
					t3.setText("");
					t4.setText("");
					JOptionPane.showMessageDialog(f, "검색결과 없음");
				}
			}// action
		}); // b4
				
		f.getContentPane().setBackground(Color.white);
		// 맨 끝으로!!
		f.setVisible(true);
	}

}
