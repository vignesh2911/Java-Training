package com.pirai.mvc.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {
	@GetMapping("/hello/")
	public ModelAndView getWelcomePage()
	{
		return new ModelAndView("welcome");
	}
}
