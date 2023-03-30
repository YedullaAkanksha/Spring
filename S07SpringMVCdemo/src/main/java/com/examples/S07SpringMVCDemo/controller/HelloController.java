package com.examples.S07SpringMVCDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.S07SpringMVCDemo.model.Employee;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelview=new ModelAndView();
		modelview.addObject("id",1);
		modelview.addObject("name","Akki");
		modelview.addObject("age",21);
		modelview.setViewName("hello");
		return modelview;
	}
	@RequestMapping("/readobject")
	public ModelAndView read1() {
		ModelAndView modelview=new ModelAndView();
		Employee emp=new Employee();
		emp.setId(11);
		emp.setName("Ron");
		emp.setAge(25);
		modelview.addObject("employee",emp);
		modelview.setViewName("hello");
		return modelview;
	}
	@RequestMapping("/employees")
	public ModelAndView read2() {
		ModelAndView modelview=new ModelAndView();
		List<Employee> employee=new ArrayList<>();
		Employee emp=new Employee();
		emp.setId(111);
		emp.setName("rach");
		emp.setAge(25);
		employee.add(emp);
		
		emp=new Employee();
		emp.setId(12);
		emp.setName("John");
		emp.setAge(28);
		employee.add(emp);
		modelview.addObject("employees",employee);
		
		modelview.setViewName("employees");
		
		return modelview;
	}
	
	@RequestMapping("/showdata")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name) {
		System.out.println("Id= "+ id);
		System.out.println("Name= "+ name);
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("id", id);
		mv.addObject("name", name);
		mv.setViewName("showdata");
		return mv;
	}
}
