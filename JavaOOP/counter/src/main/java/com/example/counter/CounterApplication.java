package com.example.counter;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class CounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.isNew()) {
			session.setAttribute("counter", 0);
		}
		else {
			Integer count = (Integer) session.getAttribute("counter");
			count ++;
			session.setAttribute("counter", count);
		}

	return "index.jsp";
	}
	@RequestMapping("/counter")
	public String counter(Model model, HttpSession session) {
		model.addAttribute("counter", session.getAttribute("counter"));
		
		return "counter.jsp";
	}

	}
