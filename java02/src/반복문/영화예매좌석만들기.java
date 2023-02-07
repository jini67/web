package 반복문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화예매좌석만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		//반복하고 싶을 때
		// 반복하고 싶은 곳 블럭 잡고 우클릭 > surround with > 2번 for
		for (int i = 0; i < 100; i++) {
			JButton b = new JButton("나는 버튼");
			f.add(b);
		} //100번 반복하기
		
		f.setVisible(true);
	}

}
