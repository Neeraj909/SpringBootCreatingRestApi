package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.WelcomeService;

@RestController
public class WelcomeController {
	
	
	@Autowired
	private WelcomeService service;
	
	
	@RequestMapping("/welcome")
	public String  showWelcomePage() {
		return service.retriveMessage();
	}

}

