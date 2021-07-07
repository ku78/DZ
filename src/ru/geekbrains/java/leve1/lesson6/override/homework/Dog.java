package ru.geekbrains.java.leve1.lesson6.override.homework;

class Dog extends Animal {
    private int _lengthSwim;
    private int maxLength;

    Dog() {
        maxLength = Math.random() > 0.5 ?  400 : 600;
    }

    int getMAxLengtx() {
        return maxLength;
    }

    void swim(int length) {
        boolean result = length <= 10;
        if (result) _lengthSwim = length;
        showResult(this,result);
    }
    @Override
    void run(int length) {
        boolean result = length <= maxLength;
        if (result) _length = length;
        showResult(this,result);
    }
    @Override
    void jump(double height) {
        boolean result = height <= 0.5;
        if (result) _height = height;
        showResult(this,result);
    }
}