package ru.geekbrains.java.leve1.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fed;

    public Cat(String name,int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public int getAppetite() {
        return appetite;
    }
    public void eat(Plate plate) {
        System.out.println("Cat " + name + " eat...");
        plate.decreaseFood(appetite);
    }

    public String getName() {
        return name;
    }
    public void info() {
        System.out.println(name + " " + (fed ? " сыт " : " голоден "));
    }
    public void fear(Dog dog){
        System.out.println("Cat "+name+ " fear dog "+ dog.getName());
    }
}
