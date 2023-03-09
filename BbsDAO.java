package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import 화면DB연결.BbsVO;
import 화면DB연결.MemberVO;

// 테이블 하나당 DAO 하나!
// CUD 완성하기
public class BbsDAO {
	
	public BbsVO one(int no) {
		ResultSet rs = null;
		BbsVO bag = null;
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
			
			String sql = "select * from hr.BBS where no = ? ";
			PreparedStatement ps = con.prepareStatement(sql); 
			ps.setInt(1, no);
			//con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어주세요. 
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			rs = ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(rs.next()) { //검색결과가 있는지 여부는 rs.next()
				// true이면 있다는 뜻, false이면 없다는 뜻
				System.out.println("성공! 검색결과 있음.");
				int no2 = rs.getInt(1); //no
				String title = rs.getString(2); 
				String content = rs.getString(3); 
				String writer = rs.getString(4); 
				System.out.println(	no2 + " " 
									+ title + " " 
									+ content + " " 
									+ writer);
				// 검색결과를 검색화면 UI 부분으로 주어야함.
				bag = new BbsVO();
				bag.setNo(no);
				bag.setTITLE(title);
				bag.setCONTENT(content);
				bag.setWRITER(writer);
			} else {
				System.out.println("검색결과 없음.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}

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
