package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(800, 800);
		f.getContentPane().setBackground(Color.green);
		//배치해주는 부품-FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);//추가한 순서대로 f에 붙는다.
		
		//버튼 배열 많이 만들어서 집어 넣을 배열 생성
		JButton[] btn = new JButton[100];
		//반복해서 배열에 버튼 만들어 넣어주세요.
		//반복해서 f에 add해주세요.
		Font font = new Font("돋움", Font.BOLD, 25);

		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.red);
		result.setFont(font);
		
		// 예약여부를 저장하는 배열을 만들기
		int[] seat = new int[100];
		
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			btn[i].setBackground(Color.white);
			btn[i].setForeground(Color.blue);
			
			f.add(btn[i]);
			
			//버튼에 액션기능 add해보자.
			//1) 액션 기능 추가 
			//2) 클릭했을 때 어떤 부품이 담당할지 부품 생성 
			//3) 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
					//e.getActionCommand(); 클릭한 버튼의 글자를 가지고 와줌.
					String text = e.getActionCommand();
					System.out.println(text);
					int no = Integer.parseInt(text); // <- String을 Int로 바꿔준것임
					
					//이미 해당 좌석번호가 1로 저장되어 있는지 확인하고, 1이 아니면 예약가능
					if (seat[no] == 1) { // 이미 예약되어 1이 들어있음. 예약불가
						result.setText("이미 예약된 자리입니다. 예약불가");
						result.setForeground(Color.blue);
					} else { // 아직 예약이 안돼서 0이 들어있음. 예약가능
						seat[no] = 1; //예약좌석은 1로 변경!
						result.setText(text + "번 예약완료.");
						btn[no].setBackground(Color.LIGHT_GRAY); //선택하면 버튼색 변경
						btn[no].setText("예약");
						btn[no].setEnabled(false);
					}
					
				}
			});
		}
		
		f.add(result);
		
		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.cyan);
		total.setForeground(Color.DARK_GRAY);
		total.setFont(font);
		
		f.add(total);
		
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 내용 넣기
				// 배열에 몇개가 1인지 더해줌
				// 영화예매비 1장당 1만원, 결제금액 프린트
				int count = 0;
				for (int x : seat) {
					if (x == 1) {
						count ++;
					} //if
				} //for
				JOptionPane.showMessageDialog(f, "결제하실 금액은 " + (count * 10000) + "원 입니다.");
			}
		});
		//맨 끝에 있어야 함.
		f.setVisible(true);

	}

}
