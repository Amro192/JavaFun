package com.example.countries.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.countries.Service.ApiService;

@Controller
public class Controllers {
	private final ApiService apiS;
	public Controllers (ApiService apS) {
		this.apiS=apS;
	}
	@RequestMapping("/")
	public String handler(Model model) {
		List<Object[]> One = apiS.countrySpeaksSlovene();
		model.addAttribute("get" , One);
		return "index.jsp";
	}
	@RequestMapping("/tow")
	public String handler2(Model model) {
		List<Object[]> Tow = apiS.totalCities();
		model.addAttribute("tow",Tow);
		return "index.jsp";
	
	}
	@RequestMapping("/three")
	public String handler3(Model model) {
		List<Object[]> Three = apiS.mexicoCities();
		model.addAttribute("three",Three);
		return "index.jsp";
	
	}
}
