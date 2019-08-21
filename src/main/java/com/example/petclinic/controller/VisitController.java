package com.example.petclinic.controller;

import com.example.petclinic.model.Visit;
import com.example.petclinic.service.VisitService;

import java.util.List;

public class VisitController {

    private VisitService visitService;
    
    public VisitController(VisitService visitService) {

        this.visitService = visitService;
    }

    public Visit add(Visit visit) {

        return this.visitService.add(visit);
    }

    public Visit get(Long id) {

        return this.visitService.get(id);
    }

    public Visit modify(Visit visit) {

        return this.visitService.modify(visit);
    }

    public boolean delete(Visit visit) {

        return this.visitService.delete(visit);
    }

    public List<Visit> getAll() {

        return this.visitService.getAll();
    }
}
