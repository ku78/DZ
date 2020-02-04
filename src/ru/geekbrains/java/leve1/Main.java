package ru.geekbrains.java.leve1;



import java.util.Scanner;

public class Main {

    byte a = 127;//ааа
    short b =-32656;
    int c = 2000000000,x1,x2,posNeg,lY;
    long d = -34;
    float e = -123.0007f,k,n,m;
    double f = 77.000000001d;
    char g = 'a';
    boolean h = true;

    public static void main(String[] args) {//Задание 1
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        System.out.println("Задание 2");
        System.out.println("a = "+main.a+", "+"b = "+main.b+", "+"c = "+main.c+", "+"d = "+main.d+", "+"e = "+main.e+", "+"f = "+main.f+", "+"g = "+main.g+", "+"h = "+main.h);

        System.out.println("____________________________________");
        System.out.println("Задание 3");
        System.out.println("Введите значение a,b,c,d");
        System.out.println("Введите значение a");
        main.n = in.nextFloat();
        System.out.println("Введите значение b: ");
        main.e = in.nextFloat();
        System.out.println("Введите значение c: ");
        main.k = in.nextFloat();
        System.out.println("Введите значение d: ");
        main.m = in.nextFloat();
        System.out.println(main.n+" * (" + main.e+" + ("+main.k+" / "+ main.m+")) = " + calculate(main.e, main.k,main.n,main.m ));

        System.out.println("_____________________________________");
        System.out.println("Задание 4");
        System.out.println("Введите значение x1");
          main.x1 = in.nextInt();
        System.out.println("Введите значение x2");
          main.x2 = in.nextInt();
        System.out.println(task10and20(main.x1,main.x2));

        System.out.println("_____________________________________");
        System.out.println("Задание 5");
        System.out.println("Введите значение для проверки: ");
          main.posNeg = in.nextInt();
        isPositiveOrNegative(main.posNeg);

        System.out.println("_____________________________________");
        System.out.println("Задание 6");
        System.out.println(isNegative(main.posNeg));


        System.out.println("_____________________________________");
        System.out.println("Задание 7");
        System.out.println("Как Вас зовут?");
        String name = in.next();
        greetings(name);

        System.out.println("_____________________________________");
        System.out.println("Задание 8");
        System.out.println("Введите год для проверки: ");
        main.lY = in.nextInt();
        leapYear(main.lY);
        
    }

      public static void greetings(String name) {
        /*
        Написать метод, которому в качестве параметра передается строка,
        обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
         */
         System.out.println("Привет "+name+"!");
      }


     public static void isPositiveOrNegative(int x) {
        /*Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
        положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
         */
        if(x >= 0) {
           System.out.println("Введено положительное число");
        } else {
           System.out.println("Введено отрицательное число");
        }
     }

     public static boolean isNegative(int x) {
        /*Написать метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное. */
        if(x<0) {
           return true;
        }
        return false;
     }
    public static void leapYear(int x) {
        /*Написать метод, который определяет, является ли год високосным,
         и выводит сообщение в консоль. Каждый 4-й год является високосным,
         кроме каждого 100-го, при этом каждый 400-й – високосный.
         */
        float t = (float) (x%100)/100;

        if (t==0.00){
            float y = (float) (x%400)/400;
            if(y>0.00){
            System.out.println("Год не висакосный");}
            else {
            System.out.println("Весокосный");
            }}
        else{ t = (float) (x%4)/4;
                if (t>0.00){

                        System.out.println("Год не висакосный");}
                    else {
                        System.out.println("Весокосный");
                    }

        }

    }


    public static float calculate(float a , float b, float c, float d) {
       /* Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
                где a, b, c, d – аргументы этого метода, имеющие тип float.*/

        float j= a * (b + (c / d));
        return j;
     }

     public static boolean task10and20(int x1, int x2) {
        /*Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма
        лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
         */
        int suma = x1 + x2;

        return (10<=suma && suma<=20) ? true : false;

     }
        
}    
