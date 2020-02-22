package ru.geekbrains.java.leve1.lesson6.override;

import java.util.*;

public class Cat implements Run {

    @Override
    public void run() {
        System.out.println("I'm run");
    }

    @Override
    public void fastRun() {

    }

    public static void main(String[] args) {

    }
}