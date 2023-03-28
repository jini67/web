package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제허하는 역할로 등록
public class MemberController {

	@Autowired
	MemberDAO dao; // 전체영역에서 사용할 수 있는 ★전역변수(글로벌변수)★
	// 컨트롤하는 기능(CRUD)
	// 회원가입, 수정, 탈퇴, 정보검색
	
	// 클래스 내에서 기능처리 담당
	// 멤버변수 + 멤버메서드(기능처리 담당)
	// 하나의 요청당 하나의 메서드
	// 하나의 버튼호출당 하나의 함수 연결!
	// 바로 아래에 있는 메서드가 호출이 될지를 써주어야함
	
	@RequestMapping("insert")
	public void insert(MemberVO bag) {
		// 메서드의 입력변수(파라메터)로 변수를 선언해두면,
		// 컨드롤러의 메서드내에서는 
		// 1) bag을 만들어서
		// 2) 클라이언트로부터 전달된 데이터도 다 받아줌.
		// 3) bag에 데이터 다 넣어줌.
		System.out.println("insert 요청됨");
		System.out.println(bag);
		// MemberDAO dao = new // MemberDAO();
		// dao에게 insert 요청
		dao.insert(bag);
	}
	
	@RequestMapping("update")
	public void update(MemberVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println("delete요청됨.");
		System.out.println(id);
		dao.delete(id);
	}
	
	@RequestMapping("one")
	public void one(MemberVO bag) {
		System.out.println("one요청됨.");
		System.out.println(bag);
	}
	
	@RequestMapping("list")
	public void list() {
		
	}

	
}