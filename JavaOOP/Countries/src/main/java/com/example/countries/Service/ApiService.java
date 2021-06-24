package com.example.countries.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.countries.repositories.CountryRepo;
@Service
public class ApiService {
	private final CountryRepo cRepo;

	public ApiService(CountryRepo cRepo) {
		super();
		this.cRepo = cRepo;
	}
	public List<Object[]> countrySpeaksSlovene(){
		return cRepo.countriesSpeaksSlovenee();
	}
	public List<Object[]> totalCities(){
		return cRepo.TotalCities();
	}
	public List<Object[]> mexicoCities(){
		return cRepo.getMexicoCities();
	}
}
