package ru.geekbrains.java.leve1;

public class DZ2 {
    int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    public static void main(String[] args) {
        DZ2 dz2 = new DZ2();
        System.out.println("Задание 1");
        dz2.modifiedArray(dz2.arr);
        System.out.println("___________________________________");
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


}//end DZ2

