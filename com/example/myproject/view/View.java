package com.example.myproject.view;

import com.example.myproject.presenter.Presenter;

public class View {
    private final Presenter presenter;

    public View(Presenter presenter) {
        this.presenter = presenter;
    }

    public void addPerson(String name, int age) {
        presenter.addPerson(name, age);
    }

    public void displayPersonsInfo() {
        String personsInfo = presenter.getPersonsInfo();
        // Выводим информацию о людях на экран
        System.out.println(personsInfo);
    }

    public void displaySortedByAge() {
        presenter.sortByAge();
        displayPersonsInfo();
    }

    public void displaySortedByName() {
        presenter.sortByName();
        displayPersonsInfo();
    }
}

    

    

