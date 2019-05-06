package org.coresystems.controllers;

import org.coresystems.models.Programmer;
import org.coresystems.services.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/developers")
public class ProgrammerController {

	@Autowired
	private ProgrammerService programmerService;

	@GetMapping("/all")
	public List<Programmer> getAll(){
		return programmerService.getAllProgrammers();
	}

	@PostMapping("/add")
	public String addProgrammer(@RequestBody Programmer programmer){
		programmerService.addProgrammer(programmer);
		return "data saved!";
	}
}
