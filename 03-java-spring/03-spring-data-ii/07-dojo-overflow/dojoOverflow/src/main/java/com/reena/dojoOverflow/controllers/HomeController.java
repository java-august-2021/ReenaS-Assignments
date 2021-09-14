package com.reena.dojoOverflow.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.reena.dojoOverflow.models.Answer;
import com.reena.dojoOverflow.models.Question;
import com.reena.dojoOverflow.services.OverflowService;
import com.reena.dojoOverflow.validators.TagValidator;

@Controller
public class HomeController {
	@Autowired 
	private OverflowService oService;
	@Autowired
	private TagValidator validator;
	
	@GetMapping("/")
	public String index(Model viewModel) {
		viewModel.addAttribute("allQuestions", this.oService.getAllQuestions());
		return "index.jsp";
	}
	@GetMapping("/new")
	public String newQuestion(@ModelAttribute("question") Question question) {
		return "new.jsp";
	}
	@PostMapping("/newQuestion")
	public String addQuestion(@Valid @ModelAttribute("question") Question question, BindingResult result) {
		validator.validate(question, result);
		if(result.hasErrors()) {
			return "new.jsp";
		}
		this.oService.createQuestion(question);
		return "redirect:/";
	}
	@GetMapping("/show/{id}")
	public String show(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("answer") Answer answer) {
		viewModel.addAttribute("question", this.oService.findOneQuestion(id));
		return "show.jsp";
	}
	@PostMapping("/addAnswer")
	public String addAnswer(@Valid @ModelAttribute("answer") Answer answer, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("question", this.oService.findOneQuestion(answer.getQuest().getId()));
			return "show.jsp";
		}
		this.oService.createAnswer(answer);
		return "redirect:/show/" +answer.getQuest().getId();
	}
}
