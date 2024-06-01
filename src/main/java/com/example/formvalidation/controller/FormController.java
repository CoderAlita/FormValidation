package com.example.formvalidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.formvalidation.entity.LoginData;

@Controller
public class FormController {

	
	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("loginData", new LoginData());
		return "form";
	}
}
