package com.example.petclinic.controller;

import com.example.petclinic.model.Owner;
import com.example.petclinic.service.OwnerService;

import java.util.List;

public class OwnerController implements BasicController<Owner> {

    private OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {

        this.ownerService = ownerService;
    }

    public Owner add(Owner owner) {

        return this.ownerService.add(owner);
    }

    public Owner get(Long id) {

        return this.ownerService.get(id);
    }

    public Owner modify(Owner owner) {

        return this.ownerService.modify(owner);
    }

    public boolean delete(Owner owner) {

        return this.ownerService.delete(owner);
    }

    public List<Owner> getAll() {

        return this.ownerService.getAll();
    }

}
