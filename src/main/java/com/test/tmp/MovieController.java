package com.test.tmp;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //컨트롤러로 등록, 싱글톤 생성
public class MovieController {
	@RequestMapping("movie")
	public void com(MovieVO vo, Model model) {
		System.out.println(vo);
		model.addAttribute("vo", vo);
	}
	@RequestMapping("fruit")
	public void fruit(Model model) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("딸기");
		list.add("키위");
		list.add("포도");
		model.addAttribute("list", list);
	}
	@RequestMapping("tour")
	public void tour(Model model) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("프랑스");
		list.add("스페인");
		list.add("포르투갈");
		list.add("스위스");
		model.addAttribute("list", list);
	}
}