package com.example.dojo.controller;

import java.util.ArrayList;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.dojo.Service.dojoService;
import com.example.dojo.Service.ninjaService;
import com.example.dojo.models.Dojos;
import com.example.dojo.models.Ninjas;

@Controller
public class DojoController {
	
	private final dojoService dojoS;
	private final ninjaService ninjaS;
	public DojoController(dojoService dojoS , ninjaService ninjaS) {
		this.dojoS = dojoS;
		this.ninjaS = ninjaS;
	}
	

	@RequestMapping("/")
	public String main(@ModelAttribute ("dojo") Dojos dojo , Model model) {
		return "/main.jsp";
	}

	@RequestMapping(value="/dojos", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("dojo") Dojos dojo,Model model , BindingResult result){
		if (result.hasErrors()) {
            return "/main.jsp";
        } else {	
        	dojoS.create(dojo);
            return "redirect:/ninjas/new";
        }
    }
	@RequestMapping("/dojos/{id}")
	public String show(@PathVariable("id") Long id,Model model) {
		Dojos d = dojoS.findDojo(id);
		Dojos alldn = dojoS.findDojo(id);
		model.addAttribute("name", d);
		ArrayList<Ninjas> allDN = ninjaS.findAllDojoNinjas(alldn);
		model.addAttribute("allDN", allDN);
		return "/show.jsp";
	}

	
}
