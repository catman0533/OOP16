package com.example.myproject.model;

public class Person implements FamilyMember {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        // Возвращаем дату рождения в формате "дд-мм-гггг"
        return "N/A";
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
