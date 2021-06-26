package com.example.driver.controllers;


import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.driver.Service.PersonService;
import com.example.driver.models.Person;


@Controller
public class PersonController {
	private final PersonService personService;

    
    public PersonController(PersonService personService) {
		this.personService = personService;
    }
    
    @RequestMapping("/")
    public String newPerson(@ModelAttribute("person") Person person , Model model) {
        return "/new.jsp";
    }
 @RequestMapping(value="/person", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("person") Person person, BindingResult result) {
        if (result.hasErrors()) {
            return "/new.jsp";
        } else {	
        	personService.createPerson(person);
            return "redirect:/license/new";
        }
    }
}
