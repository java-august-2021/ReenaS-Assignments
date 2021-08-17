package com.example.firstProj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	@RequestMapping("/")
	private String index(Model model) {
		model.addAttribute("firstName","Mike");
		model.addAttribute("stack","Java");
		return "index.jsp";
	}
	@RequestMapping("/welcome")
	private String welcome() {
		return "Hello welcome to Java Jordan!!";
	}

}
