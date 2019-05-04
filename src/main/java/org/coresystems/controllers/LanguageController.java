package org.coresystems.controllers;

import org.coresystems.models.Language;
import org.coresystems.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/languages")
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @GetMapping("/all")
    public List<Language> getAllLanguages(){
        return languageService.getAll();
    }

    @PostMapping("/add")
    public String addLanguage(@RequestBody Language language){
        languageService.addLanguage(language);
        return "data saved!!";
    }
}
