package com.example.petclinic.controller;

import com.example.petclinic.model.Vet;
import com.example.petclinic.service.VetService;

import java.util.List;

public class VetController {

    private VetService vetService;

    public VetController(VetService vetService) {

        this.vetService = vetService;
    }

    public Vet add(Vet vet) {

        return this.vetService.add(vet);
    }

    public Vet get(Long id) {

        return this.vetService.get(id);
    }

    public Vet modify(Vet vet) {

        return this.vetService.modify(vet);
    }

    public boolean delete(Vet vet) {

        return this.vetService.delete(vet);
    }

    public List<Vet> getAll() {

        return this.vetService.getAll();
    }
}
