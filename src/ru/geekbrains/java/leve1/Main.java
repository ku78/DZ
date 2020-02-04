package ru.geekbrains.java.leve1;


import java.util.Scanner;

public class Main{
    byte a = 127;
    short b = -32655;
    int c = 2000000000, k, n, m, x1, x2, posNeg, leapyear;
    long d = -34;
    float e = -123.0007f;
    double f = 77.000000001d;
    char g = 'a';
    boolean h = true;

    /*
     * Реализуйте методы данного класса
     * */
    public static void main(String[] args) {//Задание 1

        Main main = new Main();
        Scanner in = new Scanner(System.in);
        System.out.println("Задание 2");
        System.out.println("a = " + main.a + ", " + "b = " + main.b + ", " + "c = " + main.c + ", " + "d = " + main.d + ", " + "e = " + main.e + ", " + "f = " + main.f + ", " + "g = " + main.g + ", " + "h = " + main.h);
        System.out.println("____________________________________");
        System.out.println("Задание 3");
        System.out.println("Введите значение a,b,c,d");
        System.out.println("Введите значение a");
        main.n = in.nextInt();
        System.out.println("Введите значение b: ");
        main.c = in.nextInt();
        System.out.println("Введите значение c: ");
        main.k = in.nextInt();
        System.out.println("Введите значение d: ");
        main.m = in.nextInt();
        System.out.println(main.n + " * (" + main.c + " + (" + main.k + " / " + main.m + ")) = " + main.calculate(main.c, main.k, main.n, main.m));

        System.out.println("_____________________________________");
        System.out.println("Задание 4");
        System.out.println("Введите значение x1");
        main.x1 = in.nextInt();
        System.out.println("Введите значение x2");
        main.x2 = in.nextInt();
        System.out.println(main.task10and20(main.x1, main.x2));

        System.out.println("_____________________________________");
        System.out.println("Задание 5");
        System.out.println("Введите значение для проверки: ");
        main.posNeg = in.nextInt();
        main.isPositiveOrNegative(main.posNeg);

        System.out.println("_____________________________________");
        System.out.println("Задание 6");
        System.out.println(main.isNegative(main.posNeg));

        System.out.println("_____________________________________");
        System.out.println("Задание 7");
        System.out.println("Как Вас зовут?");
        String name = in.next();
        main.greetings(name);

        System.out.println("_____________________________________");
        System.out.println("Задание 8");
        System.out.println("Введите год для проверки: ");
        main.leapyear = in.nextInt();
        main.leapYear(main.leapyear);


    }

    public int calculate(int a, int b, int c, int d) {
       /* Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
       где a, b, c, d – входные параметры этого метода;*/

        return a * (b + (c / d));
    }

    public boolean task10and20(int x1, int x2) {
        /* Написать метод, принимающий на вход два числа,
        и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
        если да – вернуть true, в противном случае – false;
         */
        int suma = x1 + x2;

        return 10 <= suma && suma <= 20;

    }

    public void isPositiveOrNegative(int x) {
        /*Написать метод, которому в качестве параметра передается целое число,
        метод должен напечатать в консоль положительное ли число передали, или отрицательное;
         Замечание: ноль считаем положительным числом.
         */
        if (x >= 0) {
            System.out.println("Введено положительное число");
        } else {
            System.out.println("Введено отрицательное число");
        }
    }

    public boolean isNegative(int x) {
        /*Написать метод, которому в качестве параметра передается целое число,
         метод должен вернуть true, если число отрицательное;*/

        return x < 0;

    }

    public void greetings(String name) {
        /*
        Написать метод, которому в качестве параметра передается строка,
         обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
         */
        System.out.println("Привет " + name + "!");
    }

    public void leapYear(int x) {
        /* Написать метод, который определяет является ли год високосным,
        и выводит сообщение в консоль. Каждый 4-й год является високосным,
        кроме каждого 100-го, при этом каждый 400-й – високосный.
         */
        float t = (float) (x % 100) / 100;

        if (t == 0.00) {
            float y = (float) (x % 400) / 400;
            if (y > 0.00) {
                System.out.println("Год не висакосный");
            } else {
                System.out.println("Весокосный");
            }
        } else {
            t = (float) (x % 4) / 4;
            if (t > 0.00) {

                System.out.println("Год не висакосный");
            } else {
                System.out.println("Весокосный");
            }

        }

    }


}

