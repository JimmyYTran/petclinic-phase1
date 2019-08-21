package com.example.petclinic.repository;

public abstract class BasicRepository {
    protected FakeDatabase fakeDatabase;

    public BasicRepository() {
        fakeDatabase = FakeDatabase.getInstance();
    }
}
