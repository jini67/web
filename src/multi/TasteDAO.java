package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TasteDAO { // CRUD

	// ★★ 컬럼 row 여러개 불러오는 법 ★★
	public ArrayList<TasteVO> list() {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		ArrayList<TasteVO> list = new ArrayList<>();

		TasteVO bag = null;
		try {
			// 1. mysql 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mysql과 자바 연결할 부품 설정 성공.");

			// 2. 오라클 11g에 연결해보자 (java --- oracle)
			// String url = "jdbc:mysql:@localhost:3306:multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 홍길동
			System.out.println("2. mysql 연결 성공.");

			String sql = "select name, menu, price, tel, img from taste" ;
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// 삭제!!!! ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				bag = new TasteVO();
				bag.setName(rs.getString("name"));
				bag.setMenu(rs.getString("mene"));
				bag.setPrice(rs.getInt("price"));
				bag.setTel(rs.getString("tel"));
				bag.setImg(rs.getString("img"));
				// 4. list에 bag을 추가해주자
				list.add(bag);
			}
			// System.out.println(result);
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;

	}

	public TasteVO one(String name) {
		// ★★검색결과가 null이 뜨는 경우에는
		// 입력값인 Id를 출력해보세요★★
		System.out.println(name);
		// ★★출력값(리턴값)을 출력해보세요★★
		
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고있는 테이블
		// 기본형 정수/실수/문자/논리만 값으로 초기화
		// 나머지 데이터형(참조형) 주소가 들어가있음.
		// 참조형 변수를 초기화 할 때는 null (주소가 없다는 의미)
		TasteVO bag = null;
		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mysql과 자바 연결할 부품 설정 성공.");

			// 2. 오라클 11g에 연결해보자 (java --- oracle)
			// String url = "jdbc:mysql:@localhost:3306:multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 홍길동
			System.out.println("2. mysql 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이어서 String에 넣은 문자열을 특정한 부품으로 인식하지 못함
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL 부품으로 만들어주어야 함
			// PreparedStatement가 SQL 부품!

			String sql = "select * from taste where name = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			// con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어주세요.
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다는 뜻, false이면 없다는 뜻
				System.out.println("성공! 검색결과 있음.");
				bag = new TasteVO();
				bag.setName(rs.getString("name"));
				bag.setMenu(rs.getString("mene"));
				bag.setPrice(rs.getInt("price"));
				bag.setTel(rs.getString("tel"));
				bag.setImg(rs.getString("img"));
			} else {
				System.out.println("검색결과 없음.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(bag);
		return bag;
	}

	public int delete(String name) {
		int result = 0;
		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mysql과 자바 연결할 부품 설정 성공.");

			// 2. 오라클 11g에 연결해보자 (java --- oracle)
			// String url = "jdbc:mysql:@localhost:3306:multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 홍길동
			System.out.println("2. mysql 연결 성공.");
			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이어서 String에 넣은 문자열을 특정한 부품으로 인식하지 못함
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL 부품으로 만들어주어야 함
			// PreparedStatement가 SQL 부품!

			String sql = "delete from taste where name = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			// con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어주세요.
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원탈퇴 성공.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.out.println(result);
		return result;
	}

	public int update(TasteVO bag) {

		int result = 0;
		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mysql과 자바 연결할 부품 설정 성공.");

			// 2. 오라클 11g에 연결해보자 (java --- oracle)
			// String url = "jdbc:mysql:@localhost:3306:multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 홍길동
			System.out.println("2. mysql 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이어서 String에 넣은 문자열을 특정한 부품으로 인식하지 못함
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL 부품으로 만들어주어야 함
			// PreparedStatement가 SQL 부품!

			String sql = "update taste set menu = ? where name = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			// con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어주세요.
			ps.setString(1, bag.getMenu());
			ps.setString(2, bag.getName());

			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			ps.executeUpdate(); // insert, 결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원정보수정 성공.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.out.println(result);
		return result;
	}

	public int insert(TasteVO bag) {

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

			String sql = "insert into taste values (?, ?, ?, ?, ?)"; // 물음표 연산자
			PreparedStatement ps = con.prepareStatement(sql);
			// con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어주세요.
			// R빼고, 인덱스 0부터 시작!
			// 유일하게 db는 인덱스가 1부터 시작!!!!!
			ps.setString(1, bag.getName()); // ps.setInt(1, no);
			ps.setString(2, bag.getMenu());
			ps.setInt(3, bag.getPrice());
			ps.setString(4, bag.getTel());
			ps.setString(5, bag.getImg());
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
		// System.out.println(result);
		return result;
	}

}
