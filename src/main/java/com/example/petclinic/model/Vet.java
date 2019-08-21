package com.example.petclinic.model;

import java.util.Objects;

public class Vet implements Modifiable {

    private Long id;
    private String name;
    private Speciality speciality;
    private String address;
    private String city;
    private String phoneNumber;

    public Vet() {

    }

    public Vet(Long id) {
        this.id = id;
        this.name = null;
        this.speciality = null;
        this.address = null;
        this.city = null;
        this.phoneNumber = null;
    }

    public Vet(Long id, String name, Speciality speciality, String address, String city, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vet vet = (Vet) o;
        return Objects.equals(id, vet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Vet{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", specialty='").append(speciality).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
