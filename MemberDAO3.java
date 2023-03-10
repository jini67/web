package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import 화면DB연결.MemberVO;

public class MemberDAO3 { //CRUD
	
	public MemberVO one(String id) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고있는 테이블
		// 기본형 정수/실수/문자/논리만 값으로 초기화
		// 나머지 데이터형(참조형) 주소가 들어가있음.
		// 참조형 변수를 초기화 할 때는 null (주소가 없다는 의미)
		MemberVO bag = null;
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
			
			String sql = "select * from hr.MEMBER where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); 
			ps.setString(1, id);
			//con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어주세요. 
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			rs = ps.executeQuery(); // select문 전송시 
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(rs.next()) { //검색결과가 있는지 여부는 rs.next()
				// true이면 있다는 뜻, false이면 없다는 뜻
				System.out.println("성공! 검색결과 있음.");
				String id2 = rs.getString(1); //id
				String pw = rs.getString(2); //pw
				String name = rs.getString(3); //name
				String tel = rs.getString(4); //tel
				System.out.println(	id2 + " " 
									+ pw + " " 
									+ name + " " 
									+ tel);
				// 검색결과를 검색화면 UI 부분으로 주어야함.
				bag = new MemberVO();
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
			} else {
				System.out.println("검색결과 없음.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// return id, pw, name, tel은 안됨!!!
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
		return bag;
	}

	public int delete(String id) {
		int result = 0;
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
			
			String sql = "delete from hr.MEMBER where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); 
			ps.setString(1, id);
			//con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어주세요. 
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(result == 1) {
				System.out.println("회원탈퇴 성공.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println(result);
		return result;
	}
	
	public int update(MemberVO bag) {
	
		int result = 0;
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
			
			String sql = "update hr.MEMBER set tel = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); 
			//con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어주세요. 
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getId());
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			ps.executeUpdate(); //insert, 결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(result == 1) {
				System.out.println("회원정보수정 성공.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println(result);
		return result;
	}
	
	public int insert(MemberVO bag) {
	
		int result = 0;
		
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
			
			String sql = "insert into hr.MEMBER values (?, ?, ?, ?)"; //물음표 연산자
			PreparedStatement ps = con.prepareStatement(sql); 
			// con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어주세요. 
			// R빼고, 인덱스 0부터 시작!
			// 유일하게 db는 인덱스가 1부터 시작!!!!!
			ps.setString(1, bag.getId()); //ps.setInt(1, no);
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			//==> insert into hr.MEMEBER value ('a', 'a', 'a', 'a');
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			result = ps.executeUpdate(); //1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원가입 성공!");
			} 
			System.out.println(result);			
		} catch (Exception e) {
			// insert가 제대로 안된 경우, 위험한 상황이라고 판단하여
			// catch가 실행
			// 실행된 row수가 없으므로 result에 0을 넣어주자!
			//result = 0;
			e.printStackTrace();
		} 
		//System.out.println(result);
		return result;
	}

}
