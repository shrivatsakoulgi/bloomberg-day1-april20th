package com.axis.webapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCController {
	
//	@RequestMapping(value = "/greetings", method=RequestMethod.GET)
	
	@GetMapping("/greetings")
	@ResponseBody
	public String greetWithMessage(@RequestParam("username") String username) {	
		return "Welcome "+username;
	}

	
	//@RequestMapping(value="/login", method=RequestMethod.POST)
	
	@PostMapping("/login")
	@ResponseBody
	public ModelAndView loginUser(@RequestParam("username") String username, 
			@RequestParam("pwd") String password,@RequestParam("age") String ageStr) {
		
		int age=Integer.parseInt(ageStr);
		// further process
		ModelAndView mv = new ModelAndView();	
		mv.addObject("age", age);
		if(username.equals("admin") && password.equals("admin123")) {
			mv.addObject("status", "success");
		}else {
			mv.addObject("status", "failure");
		}
		mv.setViewName("response.jsp");
		return mv;		
	}
} 
