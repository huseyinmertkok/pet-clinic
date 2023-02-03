package com.tutorial.petclinic.repositories;

import com.tutorial.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
