package com.example.petclinic;

import com.example.petclinic.controller.OwnerController;
import com.example.petclinic.controller.PetController;
import com.example.petclinic.controller.VetController;
import com.example.petclinic.controller.VisitController;
import com.example.petclinic.model.*;
import com.example.petclinic.repository.OwnerRepository;
import com.example.petclinic.repository.PetRepository;
import com.example.petclinic.repository.VetRepository;
import com.example.petclinic.repository.VisitRepository;
import com.example.petclinic.service.OwnerService;
import com.example.petclinic.service.PetService;
import com.example.petclinic.service.VetService;
import com.example.petclinic.service.VisitService;

import java.util.List;


public class PetClinicDriver {

    public static void main(String[] args) {

        testApp();

    }

    private static void testApp() {

        // Owner 3-Tier setup using manual dependency injection (DI)
        OwnerRepository ownerRepository = new OwnerRepository();
        OwnerService ownerService = new OwnerService(ownerRepository);
        OwnerController ownerController = new OwnerController(ownerService);

        // Pet 3-Tier setup using manual dependency injection
        PetRepository petRepository = new PetRepository();
        PetService petService = new PetService(petRepository);
        PetController petController = new PetController(petService);

        // Visit 3-Tier setup using manual dependency injection
        VisitRepository visitRepository = new VisitRepository();
        VisitService visitService = new VisitService(visitRepository);
        VisitController visitController = new VisitController(visitService);

        // Vet 3-Tier setup using manual dependency injection
        VetRepository vetRepository = new VetRepository();
        VetService vetService = new VetService(vetRepository);
        VetController vetController = new VetController(vetService);

        // Owner test data

        // create our owners
        Owner owner1 = new Owner(1L, "Homer Simpson", "742 Evergreen Terrace", "Springfield", "9395550113");
        Owner owner2 = new Owner(2L, "Marge Simpson", "742 Evergreen Terrace", "Springfield", "9395550113");
        Owner owner3 = new Owner(3L, "Lisa Simpson", "742 Evergreen Terrace", "Springfield", "9395550113");
        Owner owner4 = new Owner(4L, "Bart Simpson", "742 Evergreen Terrace", "Springfield", "9395550113");

        // save owners to database
        ownerController.add(owner1);
        ownerController.add(owner2);
        ownerController.add(owner3);
        ownerController.add(owner4);

        // get all owners from database and display them
        List<Owner> owners = ownerController.getAll();
        display(owners);

        // delete owner
        ownerController.delete(owner1);

        // Pet test data
        // create pets
        Pet pet1 = new Pet(11L, "Cat", PetType.DOG, "06-09-2012", owner1);
        Pet pet2 = new Pet(22L, "Dog", PetType.CAT, "09-06-2031", owner3);
        
        // save pets to database
        petController.add(pet1);
        petController.add(pet2);
        
        // get all pets from database and display them
        List<Pet> pets = petController.getAll();
        display(pets);
        
        // delete pet
        petController.delete(pet1);

        // Visit test data
        // create visits
        Visit visit1 = new Visit(111L, "09-09-2018", "Surgery", pet1);
        Visit visit2 = new Visit(222L, "08-18-2019", "X-Ray", pet2);

        // save visits to database
        visitController.add(visit1);
        visitController.add(visit2);

        // get all visits from database and display them
        List<Visit> visits = visitController.getAll();
        display(visits);

        // delete visit
        visitController.delete(visit2);

        // Vet test data
        // create vets
        Vet vet1 = new Vet(1111L, "Dr. Jekyll", Speciality.DENTISTRY, "111 W West St", "Hurk", "983-178-1283");
        Vet vet2 = new Vet(2222L, "Dr. Hyde", Speciality.SURGERY, "222 E East St.", "Gurg", "123-345-6789");

        // save vets to database
        vetController.add(vet1);
        vetController.add(vet2);

        // get all vets from database and display them
        List<Vet> vets = vetController.getAll();
        display(vets);

        // delete vet
        vetController.delete(vet2);
    }

    /**
     * Convenience method to display results
     *
     * @param obj
     */
    private static void display(Object obj) {

        if (obj instanceof List) {

            List<?> list = (List) obj;
            for (Object o : list) {
                System.out.println("\t" + o);
            }

        } else {

            System.out.println(obj);

        }

        System.out.println();
    }
}
