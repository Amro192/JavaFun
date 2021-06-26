package com.example.dojo.Repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.dojo.models.Ninjas;

public interface ninjaRepository extends CrudRepository<Ninjas, Long> {
	List<Ninjas> findAll();
			
}
