package ru.geekbrains.java.leve1.lesson6.override.homework;

import com.sun.javafx.scene.paint.GradientUtils;//1. Создать классы Собака и Кот с наследованием от класса Животное.

//2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
// В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания),
// или высоту (для прыжков).

//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
// прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).

//4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в
// консоль. (Например, dog1.run(150); -> результат: run: true)

//5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение
// на бег может быть 400 м., у другой 600 м.
abstract class Animal {
    protected int _length;
    protected double _height;

    abstract void run(int length);

    abstract void jump(double height);
    static void showResult(Object obj, boolean result) {
        System.out.println(obj.getClass().getName() + " : " + result);
    }
}



//    static void showResult(String name, int length) {
//
//        switch (name){
//            case "DogR":System.out.println("Собака пробежала " + length+" м.");break;
//            case "CatR": System.out.println("Кошка пробежала "+ length+" м.");break;
//            case "DogS": System.out.println("Собака проплыла "+length+" м.");break;
//            case "DogT": System.out.println("Собака устала, и легла спать");break;
//            case "CatT": System.out.println("Кошка устала, и легла спать");break;
//
//        }
//
//    }
//    static void showResult(String name, double height) {
//        switch (name) {
//            case "CatJ": System.out.println("Кошка прыгнула " + height+" м."); break;
//            case "DogJ": System.out.println("Собака проплыла "+height+" м.");break;
//            case "CatT": System.out.println("Кошки ленива прыгать."); break;
//            case "DogT": System.out.println("Собаки не посибе, она решила поспать");break;
//        }
//    }