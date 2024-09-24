package com.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model m) {

		
		String str = "home";
		m.addAttribute("page", str);
		return "home";

	}
	@RequestMapping("/add")
	public String addTodo(Model model)
	{
		model.addAttribute("page", "add");
		return "home";
		
	}


	
}
