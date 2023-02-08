package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명 {

	public static void main(String[] args) {
		// 10명에게 배부른가요? 물어보고
		// 배부르다고 한 사람, 안배부르다고 한 사람 몇 명인지 카운트
		int bts = 0; 
		int nct = 0; 
		int sos = 0; 
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("1.bts 2.nct 3.5sos");
			if (data.equals("1")) {
				bts++; //[ bts = bts + 1; // 0 + 1 ]<<이거랑 같은 뜻
			} else if (data.equals("2")) {
				nct++;
			} //else
			else if (data.equals("3")) {
				sos++;
			} //else
		} //for
		System.out.println("bts 몇명?" + bts + "명");
		System.out.println("nct 몇명?" + nct + "명");
		System.out.println("5sos 몇명?" + sos + "명");

	}

}
