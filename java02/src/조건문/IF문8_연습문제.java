package 조건문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class IF문8_연습문제 {

	public static void main(String[] args) {
		//265p 1번문제
		String pw = JOptionPane.showInputDialog("암호를 대시오");
		
		if (pw.equals("pass")) { //true
			System.out.println("들어오세요");
		} else { //false
			System.out.println("나가세요");
		}
		
		//2번문제
		String menu = JOptionPane.showInputDialog("당신이 먹고싶은 메뉴는?");
				
		switch (menu) { //int, char, string
		case "짜장면":
			System.out.println("중국집으로 가요");
			break;
		case "라면":
			System.out.println("분식집으로 가요");
			break;
		case "회":
			System.out.println("횟집으로 가요");
			break;
		default:
			break;
		}
		
		//3번문제
		String data1 = JOptionPane.showInputDialog("정수를 입력하세요-1");
		String data2 = JOptionPane.showInputDialog("정수를 입력하세요-2");
		
		int data11 = Integer.parseInt(data1); 
     	int data22 = Integer.parseInt(data2);
     	
     	if (data11 > data22) {
			System.out.println("첫번째 입력값이 더 큼");
		} else if (data11 < data22) {
			System.out.println("두번째 입력값이 더 큼");
		} else {
			System.out.println("동일");
		}
     	
     	//4번문제
     	String no = "A100EX";
     	char dep = no.charAt(0);
     	switch (dep) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;
		case 'D':
			System.out.println("해당 부서 없음");
			break;
		default:
			break;
		}
     	String sub = no.substring(1, 4);
     	System.out.println("사원 고유번호는" + sub);
     	
	}

}
