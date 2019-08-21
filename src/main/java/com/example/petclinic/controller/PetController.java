package com.example.petclinic.controller;

import com.example.petclinic.model.Pet;
import com.example.petclinic.service.PetService;

import java.util.List;

public class PetController {

    private PetService petService;

    public PetController(PetService petService) {

        this.petService = petService;
    }

    public Pet add(Pet pet) {

        return this.petService.add(pet);
    }

    public Pet get(Long id) {

        return this.petService.get(id);
    }

    public Pet modify(Pet pet) {

        return this.petService.modify(pet);
    }

    public boolean delete(Pet pet) {

        return this.petService.delete(pet);
    }

    public List<Pet> getAll() {

        return this.petService.getAll();
    }
}
