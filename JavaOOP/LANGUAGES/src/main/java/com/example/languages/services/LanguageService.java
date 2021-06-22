package com.example.languages.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import com.example.languages.models.Language;
import com.example.languages.repositories.LanguageRepository;



@Service
public class LanguageService {
	private final LanguageRepository langRepository;
	public LanguageService(LanguageRepository langRepository) {
		this.langRepository = langRepository;
	}
	 public List<Language> allLanguages() {
	        return langRepository.findAll();
	    }
	 public Language creatLanguage(Language l) {
	        return langRepository.save(l);
	    }
	 
	    public Language findLanguage(Long id) {
	        Optional<Language> optionallanguage = langRepository.findById(id);
	        if(optionallanguage.isPresent()) {
	            return optionallanguage.get();
	        } else {
	            return null;
	        }
	    }
		public void deleteLanguage(Long id) {
				this.langRepository.deleteById(id);
				
			}
		public Language updateLanguage(Long id,String name, String creator, String version) {
			Language language = findLanguage(id);
			language.setName(name);
			language.setCreator(creator);
			language.setVersion(version);
			langRepository.save(language);
			
			return language;
		}
		public Language updateLanguage(@Valid Language language) {
			Language language2 = findLanguage(language.getId());
			language2.setName(language.getName());
			language2.setCreator(language.getCreator());
			language2.setVersion(language.getVersion());
			return langRepository.save(language2);
			
		}
			
		}

