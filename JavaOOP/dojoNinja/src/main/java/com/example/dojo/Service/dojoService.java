package com.example.dojo.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.dojo.Repository.dojoRepository;
import com.example.dojo.models.Dojos;


@Service
public class dojoService {
	private final dojoRepository dojoR;
	public dojoService(dojoRepository dojoR) {
		this.dojoR=dojoR;
	}
	public List<Dojos> find(){
		return dojoR.findAll();
	}
	public Dojos create(Dojos d){
		return dojoR.save(d);
	}
	public Dojos findDojo(Long id) {
		return dojoR.findById(id).orElse(null);
	}
	public Dojos findDojos(Long id) {
		return this.dojoR.findById(id).orElse(null);
	}
	
}
