package com.example.petclinic.service;

import com.example.petclinic.model.Vet;
import com.example.petclinic.repository.VetRepository;

import java.util.List;

public class VetService implements BasicService<Vet> {

    private VetRepository vetRepository;

    public VetService(VetRepository vetRepository) {

        this.vetRepository = vetRepository;
    }

    public Vet add(Vet vet) {

        return this.vetRepository.create(vet);
    }

    public Vet get(Long id) {

        return this.vetRepository.read(new Vet(id));
    }

    public Vet modify(Vet vet) {

        return this.vetRepository.update(vet);
    }

    public boolean delete(Vet vet) {

        return this.vetRepository.delete(vet);
    }

    public List<Vet> getAll() {

        return vetRepository.getAll();
    }
}
