package com.example.petclinic.model;

import java.util.ArrayList;
import java.util.Objects;

public class Pet implements Modifiable {

    private Long id;
    private String name;
    private PetType petType;
    private String birthday;
    private Owner owner;

    public Pet() {

    }

    public Pet(Long id) {
        this.id = id;
        this.name = null;
        this.petType = null;
        this.birthday = null;
        this.owner = null;
    }

    public Pet(Long id, String name, PetType petType, String birthday, Owner owner) {
        this.id = id;
        this.name = name;
        this.petType = petType;
        this.birthday = birthday;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPetType() {
        return petType.toString();
    }

    public String getBirthday() {
        return birthday;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(id, pet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pet{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", pet type='").append(petType).append('\'');
        sb.append(", birthday='").append(birthday).append('\'');
        sb.append(", owner='").append(owner.getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
