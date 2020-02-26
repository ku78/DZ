package ru.geekbrains.java.leve1.lesson6.override;

public class B extends A {
    protected int b;
    public  B(int a, int b){
        super(a);
        System.out.println("B created!"+this);

    }
}
