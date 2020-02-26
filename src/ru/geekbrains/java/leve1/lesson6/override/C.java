package ru.geekbrains.java.leve1.lesson6.override;

public class C extends B {
    public  C(int a, int b){
        super(a, b);
        System.out.println("C created!"+this  );

    }
    void foo(){
        System.out.println(a + b);
    }

}
