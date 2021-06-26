package com.example.dojo.controller;	

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dojo.Service.dojoService;
import com.example.dojo.Service.ninjaService;
import com.example.dojo.models.Dojos;
import com.example.dojo.models.Ninjas;

@Controller
public class ninjaController {
	private final ninjaService ninjaS;
	private final dojoService dojoS;
	
	public ninjaController(ninjaService ninjaS , dojoService dojoS) {
		this.ninjaS = ninjaS;
		this.dojoS = dojoS;
	}
	@RequestMapping("/ninjas/new")
	public String index(Model model){
		List<Dojos> alldojos = dojoS.find();
		model.addAttribute("alls", dojoS.find());
		model.addAttribute("all", alldojos);
		model.addAttribute("ninja", new Ninjas());
		return "ninja.jsp";
	}

	@RequestMapping(value="/ninjas/new/create" , method=RequestMethod.POST)
	public String process_ninja_creation(@Valid @ModelAttribute("ninja") Ninjas ninja,@ModelAttribute("dojo") Dojos dojo ,BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "ninja.jsp";
		}
		ninjaS.create(ninja);
		Long id = dojo.getId();
		return "redirect:/dojos/" + id;
//		return "redirect:/ninjas/new";
		
	}
	
}
