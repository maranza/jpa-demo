package org.coresystems.services;

import org.coresystems.models.Language;
import org.coresystems.repositories.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageService {

    @Autowired
    private LanguageRepository languageRepository;

    public List<Language> getAll(){
        return new ArrayList<>(languageRepository.findAll());
    }

    public void addLanguage(Language language){
        languageRepository.save(language);
    }
}
