package com.example.petclinic.service;

import com.example.petclinic.model.Visit;
import com.example.petclinic.repository.VisitRepository;

import java.util.List;

public class VisitService implements BasicService<Visit> {

    private VisitRepository visitRepository;

    public VisitService(VisitRepository visitRepository) {

        this.visitRepository = visitRepository;
    }

    public Visit add(Visit visit) {

        return this.visitRepository.create(visit);
    }

    public Visit get(Long id) {

        return this.visitRepository.read(new Visit(id));
    }

    public Visit modify(Visit visit) {

        return this.visitRepository.update(visit);
    }

    public boolean delete(Visit visit) {

        return this.visitRepository.delete(visit);
    }

    public List<Visit> getAll() {

        return visitRepository.getAll();
    }
}
