package com.tutorial.petclinic.bootstrap;

import com.tutorial.petclinic.model.Owner;
import com.tutorial.petclinic.model.Vet;
import com.tutorial.petclinic.services.OwnerService;
import com.tutorial.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Gleanne");

        System.out.println("Loading Owner Complete!");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Roman");
        vet1.setLastName("Zayn");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Sami");
        vet2.setLastName("Uso");

        vetService.save(vet2);

        System.out.println("Loading Vet Complete!");
    }
}
