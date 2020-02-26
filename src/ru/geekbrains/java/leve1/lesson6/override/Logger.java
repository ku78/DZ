package ru.geekbrains.java.leve1.lesson6.override;

public abstract class Logger {
    public static void main(String[] args) {
        System.out.println(new Logger(){}.getClass().getName());
    }
}
