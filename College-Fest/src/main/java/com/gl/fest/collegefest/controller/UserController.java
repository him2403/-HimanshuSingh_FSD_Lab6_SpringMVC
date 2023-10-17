package com.gl.fest.collegefest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.fest.collegefest.dto.UserRegistrationDto;
import com.gl.fest.collegefest.entity.User;
import com.gl.fest.collegefest.service.UserService;

@Controller
@RequestMapping("/register")
public class UserController {
	@Autowired
	UserService userService;
	@GetMapping
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		
		return "register";
	}
	@PostMapping
	public String registerUser(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/register?success";
	}
	
}
