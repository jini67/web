package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기1 {

	public static void main(String[] args) {
		// 자주 사용하지 않는 부품을 만들어보자
		// 틀이 있어서 그 틀을 가지고 찍어서 필요한 부품을 만들어 CPU가 조립!
		// new : 틀을 가지고 찍어낼 때 사용
		// new JFrame() 은 JFrame이라는 틀을 이용해서 부품을 찍어내라!
		// 만든 부품은 모두다 ram에 저장되어야 
		JFrame f = new JFrame();
		f.setSize(500, 300);
		
		//물 흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓아야 함
		//FlowLayout
		FlowLayout flow = new FlowLayout();
		
		//f에 물 흐르듯이 배치해주는 부품을 사용하겠다 라고 조립(설정)
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("나는 버튼1");

		JButton b2 = new JButton();
		b2.setText("나는 버튼2");
		
		JLabel text1 = new JLabel(); //글씨
		text1.setText("아이디");

		JLabel text2 = new JLabel(); //글씨
		text2.setText("패스워드");
		
		//글자 넣는곳 만들기
		JTextField input1 = new JTextField(10); //글자쓰는란의 크기
		JTextField input2 = new JTextField(10); 
		// import가 안된 경우 Font위에 마우스를 올리면 됨 (또는 F2)
		// import Font~~ 를 클릭!!
		// 단축키로는 ctrl + shift + o
		Font font = new Font("돋움", 1 , 20); 
		
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b2.setFont(font);
		
		b1.setBackground(Color.red); //배경색
		b1.setForeground(Color.white); //버튼의 위색, 글자색
		b2.setBackground(Color.red); //배경색
		b2.setForeground(Color.white); //버튼의 위색, 글자색
		input1.setBackground(Color.blue); //배경색
		input1.setForeground(Color.white); //버튼의 위색, 글자색
		input2.setBackground(Color.blue); //배경색
		input2.setForeground(Color.white); //버튼의 위색, 글자색
		
		//no.png 파일명을 쓰면 java02프로젝트 바로 아래 있는것으로 인식!
		ImageIcon icon = new ImageIcon("no.png");
		ImageIcon icon2 = new ImageIcon("ok.png");
		
		b1.setIcon(icon);
		b2.setIcon(icon2);
		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		
		//보여주는 것은 맨 끝으로!!
		f.setVisible(true);
	}

}
