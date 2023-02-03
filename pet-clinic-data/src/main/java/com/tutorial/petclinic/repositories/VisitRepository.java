package com.tutorial.petclinic.repositories;

import com.tutorial.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
