package com.multi.mvc05;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookCotroller22 {
	
	@Autowired
	BookDAO dao;//100
	
	@RequestMapping("one3.multi")
	public void one3(String id, Model model) {
		BookVO bag =  dao.one(id); //bag에 검색결과가 들어있을 것임.
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list3")
	public void list3(Model model) {
		System.out.println("aaaaa");
		ArrayList<BookVO> list3 = dao.list();
		System.out.println(list3.size()); 
		model.addAttribute("list3", list3);
	}
}