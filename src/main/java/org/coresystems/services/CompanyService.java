package org.coresystems.services;

import java.util.List;

import org.coresystems.models.Company;
import org.coresystems.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	public List<Company> getCompanies() {
		return (List<Company>) companyRepository.findAll();
	}
}
