package ru.geekbrains.java.leve1.lesson3;

import java.util.Random;
import java.util.Scanner;


public class DZ3 {
    public static void main(String[] args) {
        DZ3 dz3 = new DZ3();
        dz3.guessTheNumber();
        dz3.guessTheWord();
    }//end main
    public void guessTheNumber(){
        /**Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
         * При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
         * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
         */
        //int a=0,b=9;
        Scanner in = new Scanner(System.in);
        while (true) {
            //int  guessedNumber = a + (int) (Math.random() * b);
            int  guessedNumber = new Random().nextInt(10); // [0...9]
            for (int i = 0; i < 3; i++) {
                System.out.println("Введите число: ");
                int guess = in.nextInt();
                if (guess == guessedNumber) {
                    System.out.println("Вы отгадали " + guessedNumber);
                    i=4;
                }//end if
                else if (guess > guessedNumber) {
                    System.out.println("Вы ввели слишком большое число");
                }//end else if
                else {
                    System.out.println("Вы ввели слишком маленькое число");
                }//end else
            }//end for
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int end = in.nextInt();
            if(end!=1) break;
        }// while
    }//end guessTheNumber Задание 1
    public  void guessTheWord(){
        /*** Создать массив из слов
         String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
         "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
         "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
         При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с
         загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы,
         которые стоят на своих местах.
         apple – загаданное
         apricot - ответ игрока
         ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
         Для сравнения двух слов посимвольно можно пользоваться:
         String str = "apple";
         char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
         Играем до тех пор, пока игрок не отгадает слово.
         Используем только маленькие буквы.

         *
         */
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner in = new Scanner(System.in);

        // int  guessedNumber =  (int) (Math.random() * words.length);
        int  guessedNumber = new Random().nextInt(words.length); // [0...9]
        String enigma = words[guessedNumber];
        System.out.println(enigma);
        while (true){
            System.out.println("Слово загадано отгадай");
            String guess = in.next();

            int y[]=new int [enigma.length()];
            if (enigma.length() == guess.length()) {
                for (int i = 0; i < enigma.length(); i++) {
                    if (enigma.charAt(i) == guess.charAt(i)){
                        y[i]=1;
                    }else{ y[i]=0;}//end else
                }//end for
            }else if(enigma.length() > guess.length()){
                for (int i = 0; i < guess.length(); i++) {
                    if (enigma.charAt(i) == guess.charAt(i)){
                        y[i]=1;
                    }else{ y[i]=0;}
                }//end for

            }else if(enigma.length() < guess.length()){
                for (int i = 0; i < enigma.length(); i++) {
                    if (enigma.charAt(i) == guess.charAt(i)){ y[i]=1;}else{ y[i]=0;}
                }//end for
            }//end else if

            int b =0;
            for (int i = 0; i < enigma.length();i++) {
                if (y[i]==1){
                    System.out.print( guess.charAt(i));
                }else{//end if
                    System.out.print("\ud83d\ude3e ");b++;
                }//end else
            }//end for

            if (b <15 && b!=0) {
                for (int i = 0; i <15-b ; i++) {
                    System.out.print("\ud83d\ude3e ");
                }

            }else if(b==0 && enigma.length() == guess.length()){
                System.out.println();
                System.out.println("Вы отгадали!!!");
                break;

            }
            System.out.println();
        }//end while


    }//guessTheWord
}// end DZ3
