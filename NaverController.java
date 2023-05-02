package com.multi.mini01;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NaverController {
	
	
	@RequestMapping("naverLogin")
	public void home(NaverVO vo, Model model) {
		System.out.println(vo);
		model.addAttribute("vo", vo);
	}
}
