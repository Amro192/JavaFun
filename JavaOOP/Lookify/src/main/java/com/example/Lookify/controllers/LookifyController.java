package com.example.Lookify.controllers;

import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Lookify.models.lookify;
import com.example.Lookify.services.lookifyService;

@Controller
public class LookifyController {
	private final lookifyService lookyService;
	
	public LookifyController(lookifyService lookyService) {
        this.lookyService = lookyService;
    }
	@RequestMapping("/lookify")
	public String welcome() {
		return "/lookify/welcome.jsp";
	}
	
	@RequestMapping("/dashboard")
    public String index(Model model) {
        List<lookify> lookys = lookyService.alllookify();
        model.addAttribute("lookys", lookys);
        return "/lookify/dashboard.jsp";
    }
	@RequestMapping("/lookify/search/topTen")
	public String top(Model model) {
        List<lookify> lookys = lookyService.top();
        model.addAttribute("lookys", lookys);
        return "/lookify/TopTen.jsp";
    }
	@RequestMapping(value = "/lookify/search" ,method = RequestMethod.POST)
	public String search(Model model , @RequestParam (value="artist") String artist) {
        List<lookify> lookys = lookyService.search(artist);
        model.addAttribute("lookys", lookys);
        model.addAttribute("artist", artist);
        return "/lookify/search.jsp";
    }
	@RequestMapping("/songs/{id}")
    public String show(@PathVariable("id") Long id , Model model){
	 lookify looky = lookyService.findLookify(id);
    	 model.addAttribute("looky", looky);
		return "/lookify/show.jsp";
    }
	
	
	 @RequestMapping("/lookify/new")
	    public String newLookify(@ModelAttribute("looky") lookify looky) {
	        return "/lookify/new.jsp";
	}
	 @RequestMapping(value="/lookify", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("looky") lookify looky, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/lookify/new.jsp";
	        } else {
	        	lookyService.createLookify(looky);
	            return "redirect:/dashboard";
	        }
	} 

	 	@RequestMapping("/lookify/{id}/delete")
	   		public String destroy(@PathVariable("id") Long id) {
	 		lookyService.deleteLookify(id);
		   	return "redirect:/dashboard";
	   }
}
