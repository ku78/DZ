package ru.geekbrains.java.leve1.lesson6.override;

public abstract class Animal implements Run, Jump {

    String name;

    public Animal(String name) {
        this.name = name;
    }
}
