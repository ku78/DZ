package ru.geekbrains.java.leve1.lesson6;

class Cat extends Animal {
    public static int quantityCat;
    Cat(){
        quantityCat++;

    }
    @Override
    void run(int length) {
        boolean result = length <= 200;
        if (result) {this.length = length;
        showResult("Кошка","run",result,length);}
    }
    @Override
    void jump(double height) {
        boolean result = height <= 2;
        if (result) {this.height = height;
        showResult("Кошка","jump",result,height);}
    }

}
