package com.examples.S08SpringMVCORMDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.examples.S08SpringMVCORMDemo.entity.User;
import com.examples.S08SpringMVCORMDemo.exception.UserAlreadyExistsException;
import com.examples.S08SpringMVCORMDemo.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/register")
	public String showRegisterPage() {
		return "userreg";
	}
	@RequestMapping("/registeruser")
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		int result;
		try{
			result=userService.save(user);
		model.addAttribute("message","User created with id "+result);
		model.addAttribute("users",userService.getUsers());
		} catch(UserAlreadyExistsException e) {
		
		model.addAttribute("message",e.getMessage());
		}
	return "userreg";
		
	}
	
	@RequestMapping("/users")
	public String getUsers(ModelMap model) {
		//List<User> users=userService.getUsers();
		model.addAttribute("users",userService.getUsers());
		return "displayusers";
	}
}
