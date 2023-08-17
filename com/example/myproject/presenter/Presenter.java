package com.example.myproject.presenter;

import com.example.myproject.model.Person;
import com.example.myproject.model.Service;
import com.example.myproject.view.View;

public class Presenter {
    private final Service service;

    public Presenter(View view) {
        this.service = new Service();
    }

    public void addPerson(String name, int age) {
        service.addPerson(new Person(name, age));
    }

    public String getPersonsInfo() {
        return service.getPersonsInfo();
    }

    public void sortByAge() {
        service.sortByAge();
    }

    public void sortByName() {
        service.sortByName();
    }

    public void displaySortedByName() {
    
    }
    public void displaySortedByAge() {
    }
}    