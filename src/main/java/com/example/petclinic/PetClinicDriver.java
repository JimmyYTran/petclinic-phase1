package com.example.petclinic;

import com.example.petclinic.controller.OwnerController;
import com.example.petclinic.model.Owner;
import com.example.petclinic.repository.OwnerRepository;
import com.example.petclinic.service.OwnerService;

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

        // TODO Create Pet 3-Tier setup using manual dependency injection

        // TODO Create Visit 3-Tier setup using manual dependency injection

        // TODO Create Vet 3-Tier setup using manual dependency injection

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
        // TODO Add test data for pets

        // Visit test data
        // TODO Add test data for visits

        // Vet test data
        // TODO Add test data for vets
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
