package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MockDAO2 { // CRUD

	public int insert(MockVO2 bag) {

		int result = 0;

		try {
			// 1. mysql과 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mysql과 자바 연결할 부품 설정 성공.");

			// 2. mysql에 연결해보자 (java --- oracle)
			// String url = "jdbc:mysql:@localhost:3306:multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 홍길동
			System.out.println("2. mysql 연결 성공.");

			String sql = "insert into mock2 values (?, ?, ?, ?)"; // 물음표 연산자
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bag.getId());
			ps.setString(2, bag.getCity());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getPhone());
			// ==> insert into hr.MEMEBER value ('a', 'a', 'a', 'a');

			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원가입 성공!");
			}
			System.out.println(result);
		} catch (Exception e) {
			// insert가 제대로 안된 경우, 위험한 상황이라고 판단하여
			// catch가 실행
			// 실행된 row수가 없으므로 result에 0을 넣어주자!
			// result = 0;
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

}
