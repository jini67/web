package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {
	
	@RequestMapping("food")
	private String food(FoodVO bag) {
		System.out.println(bag);
		String like = bag.getLike();
		String dislike = bag.getDislike();
		if (like.equals("김치전")) {
			return "like";
		}
		if (dislike.equals("고수")) {
			return "dislike";
		}
		if (like.equals("아무거나")) {
			return "redirect:food.jsp";
		} else {
			return "redirect:food.jsp";
		}
	}
	
}
