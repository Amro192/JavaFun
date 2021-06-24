package com.example.Lookify.services;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.stereotype.Service;
import com.example.Lookify.models.lookify;
import com.example.Lookify.repositories.lookifyRepository;


@Service
public class lookifyService {
	private final lookifyRepository lookifyRepo;
	public lookifyService(lookifyRepository lookifyRepo) {
		this.lookifyRepo = lookifyRepo;
	}
	public List<lookify> alllookify() {
        return lookifyRepo.findAll();
    }
	public List<lookify> top() {
        return lookifyRepo.findTop10ByOrderByRatingDesc();
    }
	public List<lookify> search(String artist){
		return lookifyRepo.findByArtist(artist);
	}
	public lookify createLookify(lookify l) {
	        return lookifyRepo.save(l);
	}
    public lookify findLookify(Long id) {
        Optional<lookify> optionallookify = lookifyRepo.findById(id);
        if(optionallookify.isPresent()) {
            return optionallookify.get();
        } else {
            return null;
        }
    }
	public lookify updateLookify(Long id, String title, String artist, int rating) {
		lookify looky = findLookify(id);
		looky.setTitle(title);
		looky.setArtist(artist);
		looky.setRating(rating);
		return lookifyRepo.save(looky);
		 
	}
	public void deleteLookify(Long id) {
		this.lookifyRepo.deleteById(id);
	}
	public lookify updateLookify(@Valid lookify looky) {
		lookify looky2 = findLookify(looky.getId());
		looky2.setTitle(looky.getTitle());
		looky2.setArtist(looky.getArtist());
		looky2.setRating(looky.getRating());
		return lookifyRepo.save(looky2);
		
	}
	
}
