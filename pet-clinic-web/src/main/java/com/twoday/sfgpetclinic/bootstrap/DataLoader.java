package com.twoday.sfgpetclinic.bootstrap;

import com.twoday.sfgpetclinic.model.Owner;
import com.twoday.sfgpetclinic.model.Pet;
import com.twoday.sfgpetclinic.model.Vet;
import com.twoday.sfgpetclinic.services.OwnerService;
import com.twoday.sfgpetclinic.services.PetService;
import com.twoday.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final PetService petService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, PetService petService, VetService vetService) {
        this.ownerService = ownerService;
        this.petService = petService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Mr. First");
        owner1.setLastName("Owner");
        ownerService.save(owner1);
        System.out.println("Loaded Owner: " + owner1.getFirstName() + " " + owner1.getLastName());

        Owner owner2 = new Owner();
        owner2.setFirstName("Mr. Second");
        owner2.setLastName("Owner");
        ownerService.save(owner2);
        System.out.println("Loaded Owner: " + owner2.getFirstName() + " " + owner2.getLastName());

        Vet vet1 = new Vet();
        vet1.setFirstName("Dr. First");
        vet1.setLastName("Vet");
        vetService.save(vet1);
        System.out.println("Loaded Vet: " + vet1.getFirstName() + " " + vet1.getLastName());

        Vet vet2 = new Vet();
        vet2.setFirstName("Dr. Second");
        vet2.setLastName("Vet");
        vetService.save(vet2);
        System.out.println("Loaded Vet: " + vet2.getFirstName() + " " + vet2.getLastName());

        Pet pet1 = new Pet();
        pet1.setName("Doggy");
        pet1.setOwner(owner1);
        petService.save(pet1);
        System.out.println("Loaded Pet: " + pet1.getName() + " for Owner: " + owner1.getFirstName() + " " + owner1.getLastName());

    }

}
