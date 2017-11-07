package com.chenhui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chenhui.domain.User;

@Controller
public class UserController {
	
	@GetMapping(value="/user")
	public String userForm(Model model){
		model.addAttribute("user",new User());
		return "user";
	}
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public String userSubmmit(@ModelAttribute User user){
		return "result";
	}

}