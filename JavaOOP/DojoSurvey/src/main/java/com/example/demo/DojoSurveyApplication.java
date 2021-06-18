package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class DojoSurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DojoSurveyApplication.class, args);
	}
	@RequestMapping("/")
	 public String index() {
	        return "root.jsp";
	    }
	
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String show(@RequestParam(value="name") String name, @RequestParam(value="location") String location,
	@RequestParam(value="language") String language,@RequestParam(value="message") String message , Model model,HttpSession session) {
		 session.setAttribute("name", name);
		 session.setAttribute("location", location);
		 session.setAttribute("language", language);
		 session.setAttribute("message", message);
		 
	     String namesession = (String) session.getAttribute("name");	
	     String locationsession = (String) session.getAttribute("location");
	     String languagesession = (String) session.getAttribute("language");
	     String messagesession = (String) session.getAttribute("message");
	     
		model.addAttribute("name" , name);
		model.addAttribute("location" , location);
		model.addAttribute("language" , language);
		model.addAttribute("message" , message);
		return "redirect:/show";
    }	
	
	@RequestMapping("/show")
    public String dashboard() {
        return "show.jsp";

	}
	}
