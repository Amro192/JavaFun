package com.example.dojo.Repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.dojo.models.Dojos;


public interface dojoRepository extends CrudRepository<Dojos, Long>{
	List<Dojos> findAll();
}
