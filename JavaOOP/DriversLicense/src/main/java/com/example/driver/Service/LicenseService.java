package com.example.driver.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.driver.models.License;
import com.example.driver.models.Person;
import com.example.driver.repositories.LicenseRepository;
import com.example.driver.repositories.PersonRepository;

@Service
public class LicenseService {
	 private final LicenseRepository licenseRepository;
	 private final PersonRepository personRepository;
	 public static String LicenseNumber="000000";
	    
	  public LicenseService(LicenseRepository licenseRepository,PersonRepository personRepository) {
	        this.licenseRepository = licenseRepository;
	        this.personRepository=personRepository;
	    }
	  public List<License> allLicense() {
	        return licenseRepository.findAll();
	    }

	    public License createLicense(License b) {
	    	String Number=generateLicenseNumber(b);
	    	System.out.println(Number);
	    	b.setNumber(Number);
	        return licenseRepository.save(b);
	        
	    }

	    public License findLicense(Long id) {
	        Optional<License> optionalLicense = licenseRepository.findById(id);
	        if(optionalLicense.isPresent()) {
	            return optionalLicense.get();
	        } else {
	            return null;
	        }
	    }
	    public List<Person> findLicense() {
	    	return personRepository.findByLicenseIsNull();
	    }
	    public String generateLicenseNumber(License l) {
			if(LicenseNumber.equals("000000")) {
				LicenseNumber="000001";
				l.setNumber(LicenseNumber);
				return LicenseNumber;
			}
			else {
				int num= Integer.parseInt(LicenseNumber);
				num++;
				String Number= String.valueOf(num);
				while(Number.length() !=6) {
					Number="0"+Number;
				}
				LicenseNumber=Number;
				l.setNumber(LicenseNumber);
				return LicenseNumber;
			}
		}

}
