package com.example.dojo.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.dojo.Repository.ninjaRepository;
import com.example.dojo.models.Dojos;
import com.example.dojo.models.Ninjas;

@Service
public class ninjaService {
	private final ninjaRepository ninjaR;
	public ninjaService (ninjaRepository ninjaR) {
		this.ninjaR = ninjaR;
	}
	public Ninjas create(Ninjas n) {
		return ninjaR.save(n);
	}
	public ArrayList<Ninjas> findAllDojoNinjas(Dojos d){
		List <Ninjas> allNinjas= ninjaR.findAll();
		ArrayList<Ninjas> allDojoNinjas= new ArrayList<Ninjas>();
		for(int i=0; i<allNinjas.size(); i++) {
			Dojos dojo=allNinjas.get(i).getDojo(); 
			if(dojo.getId() == d.getId()) {
				allDojoNinjas.add(allNinjas.get(i));
			}
		}
		return allDojoNinjas;
}
}