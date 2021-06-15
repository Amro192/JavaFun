package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("your_server")
public class HumanApplication {
	public static void main(String[] args) {
		SpringApplication.run(HumanApplication.class, args);
	}
	@RequestMapping("")
	public String human(@RequestParam(value="amro", required = false) String amro) {
		if(amro == null) {
		return "<h1>Hello human!</h1><div>welcome to spring boot!</div>";
	}
		else {
			return "<h1>Hello "+ amro +" !</h1><div>welcome to spring boot!</div>";
		}
		}


}
