package ru.geekbrains.java.leve1.lesson6.override.overload;

import ru.geekbrains.java.leve1.lesson6.override.A;
import ru.geekbrains.java.leve1.lesson6.override.B;
import ru.geekbrains.java.leve1.lesson6.override.C;

import java.util.ArrayList;

public class Test extends A {
     static void foo(int arg){
        System.out.println("int: "+arg);

    }//end foo(int)
      public Test(int a){
         super(a);
      }
    static void foo(float arg){
        System.out.println("float: "+arg);


    }//end foo(float)

    static  void foo(double  arg){
        System.out.println("double: "+arg);

    }//end foo(double)

    static  void foo(long  arg){
        System.out.println("long: "+arg);

    }//end foo(double)

    public static void main(String[] args) {
         C c = new C(2,5);
         B b = new C(2,5);
         A a = new C(2,5);
    }
}
