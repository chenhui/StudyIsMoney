package com.chenhui.controller;

import com.chenhui.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.chenhui.domain.User;

import java.util.List;

@Controller
public class UserController {

	@Autowired
	private UserRepository  userRepository;


	@GetMapping(value="/user")
	public String userForm(Model model){
		model.addAttribute("user",new User());
		return "user";
	}
	
	@PostMapping(value="/user/register")
	public String userSubmmit(User user){
		this.userRepository.save(user);
		return "redirect:/user/users";
	}
	
	@GetMapping(value="/user/register")
	public String showRegisterForm(Model model){
		model.addAttribute("user",new User());
		return "registerForm";
	}



	@GetMapping(value = "user/users")
	public String ListUsers(Model model){
		List<User> users=this.userRepository.findAll();
		if (users!=null) {
			model.addAttribute("users", users);
		}
		return "allUsers";
	}
	
	


}
