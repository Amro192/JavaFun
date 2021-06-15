package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("{text}")
	public String dojos(@PathVariable("text") String text) {
		if(text.equals("dojo")) {
		return "The  dojo  is awesome!";
		}
		else if(text.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		}
		else if(text.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}
		return "nothing!";


	}
}