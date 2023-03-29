package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	@RequestMapping("insert2")
	public void insert(BbsVO bag) {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		dao.insert(bag);
	}
	
	@RequestMapping("update2.multi")
	public void update(BbsVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);	
		dao.update(bag);
	}
	
	@RequestMapping("delete2.multi")
	public void delete(int no) {
		System.out.println("delete요청됨.");
		System.out.println(no);
		dao.delete(no);
	}
	
	@RequestMapping("one2.multi")
	public void one(int no, Model model) {
		System.out.println("one요청됨 no val: " + no);
		
		BbsVO bag = dao.one(no);
		System.out.println("bag"+ bag);
		model.addAttribute("bag", bag);
	}
}
