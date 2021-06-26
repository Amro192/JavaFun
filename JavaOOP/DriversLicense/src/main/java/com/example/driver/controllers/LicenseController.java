package com.example.driver.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.driver.Service.LicenseService;
import com.example.driver.Service.PersonService;
import com.example.driver.models.License;
import com.example.driver.models.Person;

@Controller
public class LicenseController {
	private final PersonService personService;
	private final LicenseService licenseService;

	public LicenseController(LicenseService licenseService, PersonService personService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}

	@RequestMapping("/license/new")
	public String newLicense(Model model) {
		model.addAttribute("license", new License());
		List<Person> persons=licenseService.findLicense();
		model.addAttribute("persons", persons);
		return "/newl.jsp";
	}

	@RequestMapping(value="/license/new/create", method=RequestMethod.POST)
	public String createl(@Valid @ModelAttribute("license") License license, @ModelAttribute("person") Person person ,BindingResult result) {
		if (result.hasErrors()) {
			return "/new.jsp";
		} else {
			licenseService.createLicense(license);
			Long id = person.getId();
			return "redirect:/persons/" + id;
		}
	}
	
	@RequestMapping("/persons/{id}")
	public String viewPersonLicense(@PathVariable("id") Long id, Model model) {
		Person p = personService.findPerson(id);
		License L = p.getLicense();
		model.addAttribute("personName", p.getFirstName() + " " + p.getLastName());
		model.addAttribute("licenseNumber", L.getNumber());
		model.addAttribute("state", L.getState());
		model.addAttribute("expirationDate", L.getExpirationDate());
		return "show.jsp";
	}
}
