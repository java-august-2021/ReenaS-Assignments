package com.user.projects.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.user.projects.models.User;
import com.user.projects.services.UserService;
import com.user.projects.validators.UserValidator;

@Controller
public class UserController {
	@Autowired
	private  UserService userService;
	
	@Autowired
	private  UserValidator userValidator;
	
   
    @GetMapping("/")
    public String registerForm(@ModelAttribute("user") User user) {
        return "index.jsp";
    }
    
    @PostMapping("/registration")
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        // if result has errors, return the registration page (don't worry about validations just now)
        // else, save the user in the database, save the user id in session, and redirect them to the /home route
    	userValidator.validate(user, result);
    	if(result.hasErrors()) {
    		return "index.jsp";
    	}
    	User newUser=userService.registerUser(user);
    	session.setAttribute("userId", newUser.getId());
    	return "home.jsp";
    }
    
    @PostMapping("/login")
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session,
    		RedirectAttributes redir
    		) {
        // if the user is authenticated, save their user id in session
        // else, add error messages and return the login page
    	if(userService.authenticateUser(email, password)) {
    		User user=userService.findByEmail(email);
    		session.setAttribute("userId", user.getId());
    		return "home.jsp";
    	}
    	redir.addFlashAttribute("error","Invalid email/pass");
    	return "redirect:/";
    	
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
        // redirect to login page
    	session.invalidate();
        return "redirect:/";
    }

}
