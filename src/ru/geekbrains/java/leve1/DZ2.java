package ru.geekbrains.java.leve1;

import java.util.Arrays;

public class DZ2{
    int[] modiArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    int[] fillArray = new int[8];
    int[] multiArray ={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    int[][] diagElemArray = {{5,7,3,7}, {7,0,2,8}, {8,9,2,9},{8,4,5,6}};
    public static void main(String[] args) {
        DZ2 dz2 = new DZ2();
        System.out.println("Задание 1");
        dz2.initialArray(dz2.modiArray);
        System.out.println();
        dz2.modifiedArray(dz2.modiArray);

        System.out.println("___________________________________");
        System.out.println("Задание 2");
        dz2.fillingArray(dz2.fillArray);

        System.out.println("___________________________________");
        System.out.println("Задание 3");
        dz2.initialArray(dz2.multiArray);
        dz2.multiplyArray(dz2.multiArray);

        System.out.println("___________________________________");
        System.out.println("Задание 4");
        System.out.print("Было:  ");
        initialMultiArray(dz2.diagElemArray);
        System.out.print("Стало:  ");
        dz2.diagonalElements(dz2.diagElemArray);

        System.out.println("___________________________________");
        System.out.println("Задание 5**");
        System.out.println("Массив:");
        dz2.initialArray(dz2.multiArray);
        dz2.minMaxArray(dz2.multiArray);

        System.out.println("___________________________________");
        System.out.println("Задание 6**");
        System.out.print("Массив:  ");
        dz2.initialArray(dz2.multiArray);
        System.out.println();
        System.out.println(dz2.sumleftrightEqually(dz2.multiArray));

        System.out.println("___________________________________");
        System.out.println("Задание 7***");
        System.out.print("Массив:  ");
        dz2.initialArray(dz2.multiArray);
        System.out.println();
        dz2.shiftArray(dz2.multiArray,5);
        System.out.println();
        dz2.shiftArray(dz2.multiArray,-5);

    }//end main

    public  void initialArray(int[] initArray){

        for(int i=0;i<initArray.length;i++){
            System.out.print(" "+initArray[i]);
        }//for

    }//end initialArray

    public static void initialMultiArray(int[][] initMultArray){
        System.out.println();
        for (int i = 0; i < initMultArray.length; i++) {
            for (int j = 0; j < initMultArray[0].length; j++) {
                System.out.print(" " + initMultArray[i][j] + " ");
            }
            System.out.println();
        }
    }//end initialMultiArray

    public void modifiedArray(int[] modiArray){
    /*Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

        System.out.print("Стало: ");
        for(int i=0;i<modiArray.length;i++){
            switch (modiArray[i]) {
                case 0:modiArray[i]=1; System.out.print(" "+modiArray[i]); break;
                case 1:modiArray[i]=0; System.out.print(" "+modiArray[i]); break;
            }//end switch
        }//end for
        System.out.println();
    }//end modifiedArray



    public void fillingArray(int[] fillArray) {
    /*Задать пустой целочисленный массив размером 8.
     С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */ int j=0;
        System.out.print("Массив: ");
        for (int i = 0; i < fillArray.length; i++) {
            if (j==0){fillArray[i]=j; System.out.print(" " +fillArray[i]);j =+3;}//end if
            else{
                fillArray[i]=j;
                System.out.print(" "+fillArray[i]);
                j =j+3;}//end else
        }//for
        System.out.println();
    }//filingArray

    public void multiplyArray(int[] multiArray) {
     /*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
        System.out.println();
        System.out.print("Массив:");
        for (int i = 0; i < multiArray.length; i++) {
            if (multiArray[i]<=6){
                multiArray[i]=multiArray[i]*2;
                System.out.print(" "+multiArray[i]);
            }else {
                System.out.print(" "+multiArray[i]);
            }

        }//for
        System.out.println();
    }//multiplyArray


    public void diagonalElements(int[][] diagElemArray) {
     /*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
      и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
        System.out.println();
        //int a = diagElemArray.length;
        for (int i = 0; i < diagElemArray.length; i++) {
            for(int j=0, a = diagElemArray[i].length; j < diagElemArray[i].length; j++,a--) {
                if (  i==j||i==(a - 1) ) diagElemArray[i][j] = 1;
            }//end for
            //System.out.print("\r\n");
        }//for
        initialMultiArray(diagElemArray);
    }//diagonalElements


    public  void minMaxArray(int[] minMaxArr){
        /* Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
         */
        int max = minMaxArr[0];
        int min = minMaxArr[0];
        for(int i=0;i<minMaxArr.length;i++){
            if (minMaxArr[i]>max){max = minMaxArr[i]; }//end if
            if (minMaxArr[i]<min){min = minMaxArr[i]; }//end if
        }//end for

        System.out.println();
        System.out.println("Максимум: "+max);
        System.out.println("Минимум: "+min);
    }//end initialArray


    public  boolean sumleftrightEqually(int[] leftRightArr){
        /*Написать метод, в который передается не пустой одномерный целочисленный массив,
           метод должен вернуть true, если в массиве есть место, в котором сумма левой и
          правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
          checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
         */
        int rSuma, lSuma;
        for(int i = 0; i < leftRightArr.length; i++){
            rSuma= 0;  lSuma= 0;
            for (int j = 0; j < i; j++) { lSuma += leftRightArr[j]; }//end for
            for (int j = i; j < leftRightArr.length; j++) {rSuma += leftRightArr[j];}//end for
            if (lSuma == rSuma) return true;//end if
        }//end for
        return false;
    }//end sumleftrightEqually

    public  void shiftArray(int[] shiftArr, int n){
        /***** Написать метод, которому на вход подается одномерный массив и число n
         * (может быть положительным, или отрицательным), при этом метод должен сместить
         * все элементы массива на n позиций. Для усложнения задачи нельзя пользоваться
         * вспомогательными массивами.
         */

        if (n > 0) {
            for (int x = 0; x < n; x++) {
                int buf = shiftArr[shiftArr.length - 1];
                if (shiftArr.length - 1 >= 0)
                    System.arraycopy(shiftArr, 0, shiftArr, 1, shiftArr.length - 1);
                shiftArr[0] = buf;
            }//end for
        }//end if
        if (n < 0) {
            for (int x = 0; x > n; x--) {
                int buf = shiftArr[0];
                System.arraycopy(shiftArr, 1, shiftArr, 0, shiftArr.length - 1);
                shiftArr[shiftArr.length - 1] = buf;

            }//end for
        }//end if
        for (int i : shiftArr) System.out.print(i + " ");
        System.out.println("\r\n");


    }//end shiftArray



}//end DZ2
