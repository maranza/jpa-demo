package org.coresystems.repositories;

import org.coresystems.models.Programmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammerRepository extends JpaRepository<Programmer, Integer> {
}
