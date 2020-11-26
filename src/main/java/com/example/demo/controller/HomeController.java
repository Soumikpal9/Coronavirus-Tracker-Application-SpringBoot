package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.CoronavirusService;

@Controller
public class HomeController {
	
	@Autowired
	CoronavirusService coronavirusDataService;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("locationStats", coronavirusDataService.getAllStats());
		return "home";
	}
}
