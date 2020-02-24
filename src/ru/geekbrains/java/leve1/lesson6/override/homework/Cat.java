package ru.geekbrains.java.leve1.lesson6.override.homework;


class Cat extends Animal {
@Override
    void run(int length) {
            boolean result = length <= 200;
            if (result) _length = length;
            showResult(this,result);
            }
@Override
    void jump(double height) {
            boolean result = height <= 2;
            if (result) _height = height;
            showResult(this,result);
            }

            }