package com.example.demo;
import java.lang.Math;
import java.text.SimpleDateFormat;   
import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class NinjaGoldApplication {
	public static int goldtext=0;

	public static void main(String[] args) {
		SpringApplication.run(NinjaGoldApplication.class, args);
	}
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.isNew()) {
			session.setAttribute("goldtext",goldtext);
	        session.setAttribute("activities", "");
	        return "home.jsp";
		}
		
		return "home.jsp";
	}
	@RequestMapping(value="/form", method=RequestMethod.POST)
    public String login(@RequestParam(value="bet") String bet,HttpSession session) {
		java.util.Date time = new java.util.Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd yyyy,  hh:mm:ss a");
		if(bet.equals("Farm")){
			int max=20;
			int min=10;
			int gold = (int)(Math.random()*(max-min+1)+min); 
			goldtext+=gold;
			session.setAttribute("goldtext",goldtext);
			String x= session.getAttribute("activities")+"\nyou are earned " + gold + " in " + formatter.format(time);
			session.setAttribute("activities", x);
			return "redirect:/";
		}
		if(bet.equals("cave")){
			int max=10;
			int min=5;
			int gold = (int)(Math.random()*(max-min+1)+min); 
			goldtext+=gold;
			session.setAttribute("goldtext",goldtext);
			String x= session.getAttribute("activities")+"\nyou earned " + gold + " in " + formatter.format(time);
			session.setAttribute("activities", x);
			return "redirect:/";
		}
		if(bet.equals("house")){
			int max=5;
			int min=2;
			int gold = (int)(Math.random()*(max-min+1)+min); 
			goldtext+=gold;
			session.setAttribute("goldtext",goldtext);
			String x= session.getAttribute("activities")+"\nyou earned " + gold + " in " + formatter.format(time);
			session.setAttribute("activities", x);
			return "redirect:/";
		}
		if(bet.equals("casino")){
			int max=50;
			int min=-50;
			int gold = (int)(Math.random()*(max-min+1)+min); 
			if(gold>0) {
			goldtext+=gold;
			session.setAttribute("goldtext",goldtext);
			String x= session.getAttribute("activities")+"\nyou earned " + gold + " in " + formatter.format(time);
			session.setAttribute("activities", x);
			return "redirect:/";
			}
			else if(gold<0) {
				goldtext+=gold;
				session.setAttribute("goldtext",goldtext);
				String x= session.getAttribute("activities")+"\nyou lost " + gold + " in " + formatter.format(time);
				session.setAttribute("activities", x);
				return "redirect:/";
			}
		}
		
		return "redirect:/";
		
	}
}
