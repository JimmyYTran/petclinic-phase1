package com.example.petclinic.model;

import java.util.Objects;

public class Visit implements Modifiable{

    private Long id;
    private String date;
    private String description;
    private Pet pet;

    public Visit() {

    }

    public Visit(Long id) {
        this.id = id;
        this.date = null;
        this.description = null;
        this.pet = null;
    }

    public Visit(Long id, String date, String description, Pet pet, Owner owner, Vet vet) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.pet = pet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visit visit = (Visit) o;
        return Objects.equals(id, visit.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Visit{");
        sb.append("id=").append(id);
        sb.append(", date='").append(date).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", pet='").append(pet.getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
