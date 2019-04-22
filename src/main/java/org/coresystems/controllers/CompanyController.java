package org.coresystems.controllers;

import java.util.List;

import org.coresystems.models.Company;
import org.coresystems.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/company")
@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/all")
	public List<Company> getCompanies() {
		return companyService.getCompanies();
	}
}
