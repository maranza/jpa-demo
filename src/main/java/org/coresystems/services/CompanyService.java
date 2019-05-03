package org.coresystems.services;

import org.coresystems.models.Company;
import org.coresystems.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	public List<Company> getCompanies() {
		return new ArrayList<>(companyRepository.findAll());
	}

	public void addCompany(Company company) {
		companyRepository.save(company);
	}

}
