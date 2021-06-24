package com.example.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.countries.models.Country;

public interface CountryRepo extends CrudRepository<Country, Long>{
	@Query(value="select language , percentage, countries.name FROM languages \r\n"
			+ "INNER JOIN countries ON countries.id = languages.country_id \r\n" 
			+ "where language =\"Slovene\"\r\n"
			+ "ORDER BY percentage DESC; \r\n" ,nativeQuery = true)
	List<Object[]> countriesSpeaksSlovenee(); 
	
	@Query(value="SELECT countries.name AS country, COUNT(cities.id) AS number_cities\r\n"
			+ "FROM countries\r\n"
			+ "JOIN cities ON countries.code = cities.country_code\r\n"
			+ "GROUP BY countries.code\r\n"
			+ "ORDER BY COUNT(cities.id) desc;",nativeQuery = true)
	List<Object[]> TotalCities();
	
	@Query(value="select cities.name, cities.population , country_id from cities join countries on cities.country_id = countries.id\r\n"
			+ " where countries.name ='mexico' and cities.population >500000;", nativeQuery = true)
	List<Object[]> getMexicoCities();
}
