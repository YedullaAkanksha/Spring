package com.examples.S07SpringMVCDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.examples.S07SpringMVCDemo.model.User;

@Controller
public class UserController {
	@RequestMapping("/register")
	public String showRegisterUser() {
		return "registeruser";
		
		}
	
	@RequestMapping(value="/signupuser",method=RequestMethod.POST)
	public  String SignupUser(@ModelAttribute("user") User user,ModelMap model) {
		System.out.println("from ui retrieving ob from spring container" + user);
		model.addAttribute("user",user);
		return "registeruserresult" ;
	
	
	}
}
