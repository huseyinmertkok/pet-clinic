package com.tutorial.petclinic.repositories;

import com.tutorial.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
