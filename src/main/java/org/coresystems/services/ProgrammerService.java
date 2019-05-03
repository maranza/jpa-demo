package org.coresystems.services;

import org.coresystems.models.Programmer;
import org.coresystems.repositories.ProgrammerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammerService {

    @Autowired
    private ProgrammerRepository programmerRepository;

    public List getAllProgrammers() {
        return programmerRepository.findAll();
    }

    public void addProgrammer(Programmer programmer) {
        programmerRepository.save(programmer);
    }
}
