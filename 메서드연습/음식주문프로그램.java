package 메서드연습;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class 음식주문프로그램 {

	public static JTextField t1;
	static int count;
	final static int PRICE = 5000;
	
	
	public static void main(String[] arge) {
		JFrame f = new JFrame("나의 음식 주문 프로그램");
		f.getContentPane().setBackground(Color.pink);
		f.setSize(500, 500);
	}

}
