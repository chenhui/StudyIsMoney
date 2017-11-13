package com.chenhui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.chenhui.domain.User;

@Controller
public class UserController {
	
	@GetMapping(value="/user")
	public String userForm(Model model){
		model.addAttribute("user",new User());
		return "user";
	}
	
	@PostMapping(value="/user")
	public String userSubmmit(@ModelAttribute User user){
		return "result";
	}


}
