package ru.geekbrains.java.leve1.lesson6;

class Dog extends Animal {
    private int lengthSwim,maxLength;
    public static int quantityDog;



    Dog() {
        maxLength = Math.random() > 0.5 ?  400 : 600;
        quantityDog ++;
    }

    int getMAxLengtx() {
        return maxLength;
    }

    void swim(int length) {
        boolean result = length <= 10;
        if (result) {lengthSwim = length;
        showResult("Собака","swim",result,length);}
    }
    @Override
    void run(int length) {
        boolean result = length <= maxLength;
        if (result) {this.length = length;
        showResult("Собака","run",result,length);}
    }
    @Override
    void jump(double height) {
        boolean result = height <= 0.5;
        if (result) {this.height = height;
        showResult("Собака","jump",result,height);}
    }
}