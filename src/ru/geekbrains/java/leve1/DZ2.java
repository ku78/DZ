package ru.geekbrains.java.leve1;

public class DZ2 {
    int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    int[] fillArray = new int[8];
    public static void main(String[] args) {
        DZ2 dz2 = new DZ2();
        System.out.println("Задание 1");
        dz2.modifiedArray(dz2.arr);
        System.out.println("___________________________________");
        System.out.println("Задание 2");
        dz2.fillingArray(dz2.fillArray);
    }//end main
    public void modifiedArray(int[] modiArray){
    /*Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    System.out.print("Было:  ");
    for(int i=0;i<modiArray.length;i++){
        System.out.print(modiArray[i]);
    }//for
    System.out.println();
    System.out.print("Стало: ");
    for(int i=0;i<modiArray.length;i++){
        switch (modiArray[i]) {
            case 0:modiArray[i]=1; System.out.print(modiArray[i]); break;
            case 1:modiArray[i]=0; System.out.print(modiArray[i]); break;
        }//end switch
    }//end for
     System.out.println();
    }//end modifiedArray

    public void fillingArray(int[] fillArray) {
    /*Задать пустой целочисленный массив размером 8.
     С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */ int j=0;
        System.out.print("Массив:  ");
        for (int i = 0; i < fillArray.length; i++) {
             if (j==0){fillArray[i]=j; System.out.print(" " +fillArray[i]);j =+3;}//end if
             else{
                fillArray[i]=j;
                System.out.print(" "+fillArray[i]);
                j =j+3;}//end else
        }//for
    }//filingArray
    public void multiplyArray(int[] multiArray) {
     /*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
     int j=0;
        System.out.print("Массив:  ");
        for (int i = 0; i < multiArray.length; i++) {

        }//for
    }//filingArray
}//end DZ2


