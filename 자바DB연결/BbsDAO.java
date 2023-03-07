package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

// 테이블 하나당 DAO 하나!
// CUD 완성하기
public class BbsDAO {

	public void delete(String TITLE) {
		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			// 2. 오라클 11g에 연결해보자 (java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 홍길동
			System.out.println("2. 오라클 연결 성공.");
			
			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이어서 String에 넣은 문자열을 특정한 부품으로 인식하지 못함
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL 부품으로 만들어주어야 함
			// PreparedStatement가 SQL 부품!
			
			String sql = "delete from hr.BBS where title = ? ";
			PreparedStatement ps = con.prepareStatement(sql); 
			ps.setString(1, TITLE);
			//con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어주세요. 
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(int no, String CONTENT) {
		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			// 2. 오라클 11g에 연결해보자 (java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 홍길동
			System.out.println("2. 오라클 연결 성공.");
			
			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이어서 String에 넣은 문자열을 특정한 부품으로 인식하지 못함
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL 부품으로 만들어주어야 함
			// PreparedStatement가 SQL 부품!
			
			String sql = "update hr.BBS set CONTENT = ? where TITLE = ? ";
			PreparedStatement ps = con.prepareStatement(sql); 
			//con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어주세요. 
			ps.setString(1, CONTENT);
			ps.setInt(2, no);
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			ps.executeUpdate(); //insert, 결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insert(int no, String TITLE, String CONTENT, String WRITER) {
		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			// 2. 오라클 11g에 연결해보자 (java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 홍길동
			System.out.println("2. 오라클 연결 성공.");
			
			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이어서 String에 넣은 문자열을 특정한 부품으로 인식하지 못함
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL 부품으로 만들어주어야 함
			// PreparedStatement가 SQL 부품!
			
			String sql = "insert into hr.BBS values (?, ?, ?, ?)"; //물음표 연산자
			PreparedStatement ps = con.prepareStatement(sql); 
			// con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어주세요. 
			// R빼고, 인덱스 0부터 시작!
			// 유일하게 db는 인덱스가 1부터 시작!!!!!
			ps.setInt(1, no); 
			ps.setString(2, TITLE);
			ps.setString(3, CONTENT);
			ps.setString(4, WRITER);
			//==> insert into hr.MEMEBER value ('a', 'a', 'a', 'a');
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
