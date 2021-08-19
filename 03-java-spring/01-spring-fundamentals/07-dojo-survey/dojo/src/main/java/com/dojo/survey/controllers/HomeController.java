package com.dojo.survey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
//	@RequestMapping("/welcome")
//	@RequestMapping(path="/welcome", method=RequestMethod.POST)
	@PostMapping("/welcome")
	public String welcome(@RequestParam("firstName") String fName,
			@RequestParam("email") String email,
			@RequestParam("program") String program,
			Model userModel,
			HttpSession session) {
		userModel.addAttribute("firstName",fName);
		userModel.addAttribute("email",email);
		userModel.addAttribute("program",program);
		session.setAttribute("fName", fName);
		return "welcome.jsp";
	}
	@GetMapping("/stack")
	public String stack() {
		return "stack.jsp";
	}

}
