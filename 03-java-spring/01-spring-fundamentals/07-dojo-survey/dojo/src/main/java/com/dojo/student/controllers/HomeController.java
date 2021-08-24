package com.dojo.student.controllers;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index(Model model) {
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
//	@PostMapping("/create")
//	public String create(@Valid @ModelAttribute("student") Student student, BindingResult result) {
//        if (result.hasErrors()) {
//            return "index.jsp";
//        } else {
//            sService.createStudent(student);
//            return "redirect:/";
//        }
//    }

}
