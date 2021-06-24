package com.example.Lookify.controllers;


import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.Lookify.models.lookify;
import com.example.Lookify.services.lookifyService;

@RestController
public class LookifyApi {
	private final lookifyService lookyService;
	public LookifyApi(lookifyService lookyService){
        this.lookyService = lookyService;
    }
	@RequestMapping("/api/lookify")
		public List<lookify> index() {
		return lookyService.alllookify();
	}
	@RequestMapping(value="/api/lookify", method=RequestMethod.POST)
    public lookify create(@RequestParam(value="title") String title, @RequestParam(value="artist") String artist, @RequestParam(value="rating") int rating)	 {
        lookify looky = new lookify(title, artist , rating);
        return lookyService.createLookify(looky);
    }
	@RequestMapping("/api/lookify/{id}")
    public lookify show(@PathVariable("id") Long id) {
		lookify looky = lookyService.findLookify(id);
        return looky;
    }
	   @RequestMapping(value="/api/lookify/{id}", method=RequestMethod.PUT)
	    public lookify update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="artist") String artist, @RequestParam(value="rating") int rating){
		   lookify looky = lookyService.updateLookify(id, title, artist, rating );
	        return looky;
	    }
	    
	    @RequestMapping(value="/api/lookify/{id}", method=RequestMethod.DELETE)
	    public void destroy(@PathVariable("id") Long id) {
	    	lookyService.deleteLookify(id);
	    }
	}

