package org.coresystems.controllers;

import org.coresystems.models.Company;
import org.coresystems.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/all")
	public List<Company> getCompanies() {
		return companyService.getCompanies();
	}
	
	@PostMapping("/add")
	public void addCompany(@RequestBody Company company) {
		companyService.addCompany(company);
	}
}
