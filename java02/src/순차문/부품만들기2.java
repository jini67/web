package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 부품만들기2 {

	public static void main(String[] args) {
		// JFrame 부품을 만들어 램에 저장
		// JButton 부품을 만들어 램에 저장
		// JFrame에 버튼을 추가
		// 버튼이 추가된 JFrame 화면을 보여주세요.
		
		JFrame a = new JFrame();
		a.setSize(150, 150);
		
		JButton b = new JButton();
		b.setText("버튼");
		
		a.add(b);
		
		a.setVisible(true);
	}

}
