package com.tutorial.petclinic.services;

import com.tutorial.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
