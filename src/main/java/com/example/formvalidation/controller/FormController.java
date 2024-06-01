package com.example.formvalidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.formvalidation.entity.LoginData;

import jakarta.validation.Valid;

@Controller
public class FormController {

	
	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("loginData", new LoginData());
		return "form";
	}
	
	@PostMapping("/success")
	public String success(@Valid  @ModelAttribute("loginData") LoginData loginData ,BindingResult result) {
		
		if(result.hasErrors()) {
			
			System.out.println(result);
			return "form";
		}
		System.out.println(loginData);
	
		return "success";
	}
	

}
