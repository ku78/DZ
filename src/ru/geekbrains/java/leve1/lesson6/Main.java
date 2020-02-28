package ru.geekbrains.java.leve1.lesson6;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal cat = new Cat();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        dog.run(150);
        cat.run(5000);
        cat1.run(200);
        dog.jump(10);
        cat.jump(11);
        dog.swim(3);
        System.out.println("Создано животных: "+Animal.quantityAnimal);
        System.out.println("Создоно собак: "+Dog.quantityDog);
        System.out.println("Создано кошак: "+Cat.quantityCat);
    }
}
