package com.example.myproject.model;


public class Service {
    private FamilyTree<Person> familyTree;

    public Service() {
        this.familyTree = new FamilyTree<>();
    }

    public void addPerson(Person person) {
        familyTree.addPerson(person);
    }

    public String getPersonsInfo() {
        StringBuilder sb = new StringBuilder();
        for (Person person : familyTree.getPeople()) {
            sb.append(person).append("\n");
        }
        return sb.toString();
    }

    public void sortByAge() {
        familyTree.sortByBirthDate();
    }

    public void sortByName() {
        familyTree.sortByName();
    }
}
