package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@SpringBootApplication
@Controller
public class TheCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheCodeApplication.class, args);
	}
	@RequestMapping("/")
	public String root() {
		return "root.jsp";
	}
	
	 @RequestMapping(value="/code", method=RequestMethod.POST)
	public String code(@RequestParam(value="codeint") String codeint,HttpSession session, Model model) {
		 
		 session.setAttribute("code", codeint);
		 String codeint1= (String) session.getAttribute("code");
		 session.setAttribute("code", codeint);
		 if(codeint1.equals("bushido")){
			 
			 model.addAttribute("codeint", "bushido");
			 return "redirect:/success";
			 		
			  }
		 else {
		 		return "redirect:/createError";
		 }
	}
	 
	 @RequestMapping("/success")
	 public String success(Model model) {
		 return "code.jsp";
	 }
	    @RequestMapping("/createError")
	    public String flashMessages(RedirectAttributes error) {
	        error.addFlashAttribute("Try harder");
	        return "redirect:/";
	    } 

	
	

}
