package ru.geekbrains.java.leve1.lesson4;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //задаем размер массива
    final int SIZE_FIELD = 5;// Х
    final int DOTS_TO_WIN = 4;
    //________________________________
    //задаем значение ходов и пустого поля
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    //___________________________________
    //создаем массив игрового поля
    char[][] playingField;
    // создаем переменую типа рандом
    Random random;
    //создаем переменую типа сканер
    Scanner in;
    Main() {//создаем конструктор класса
        //выделяем место в памяти, инициализируем переменые
        random = new Random();
        in = new Scanner(System.in);
        playingField = new char[SIZE_FIELD][SIZE_FIELD];
    }

    public static void main(String[] args) {
        Main main = new Main();//создаем объект класса
        main.ticTacToe();//выполняем главный метод игры
    }
    void ticTacToe() {
        initPlayingField();// инициализация таблицы
        while(true){
            printPlayingField();//выводим игровое поле
            turnHuman();//делаем ход
            if(checkWin(SIGN_X)){//проверить выигрышную комбинацию
                System.out.println("Вы побудили!");
                break;//завершаем цикл
            }
            if(isplayingFieldFull()){//проверяем поле на нечью
                System.out.println("Ничья");
                break;//завершаем цикл
            }
            turnAI();//ход компьютера
            if(checkWin(SIGN_O)){//проверить выигрышную комбинацию
                System.out.println("Вы побудили!");
                break;//завершаем цикл
            }
            if(isplayingFieldFull()){//проверяем поле на нечью
                System.out.println("Ничья");
                break;//завершаем цикл
            }
        }//end while
        printPlayingField();//выводим игровое поле
        System.out.println("Конец игры!");
    }//end TicTacToe
    void initPlayingField() {//обеспечивает начальную инициализацию игровой таблицы, заполняя её ячейки «пустыми» символами.
        for (int row = 0; row < SIZE_FIELD; row++){//цикл для строк
            for (int column = 0; column < SIZE_FIELD; column++){//цикл для столбцов
                playingField[row][column] = SIGN_EMPTY;//заполняем массив пустыми значениями "."
            }//end for column
        }//end for row
    }//end initPlayingField
    void printPlayingField() { //создаем метод для показа массива
        for (int i = 0; i <= SIZE_FIELD; i++) {//создаем цикл для ленейки координат
            System.out.printf("%-4d",i);

        }
        System.out.println();
        for (int i = 0; i < SIZE_FIELD; i++) {//создаем цикл для массива
            System.out.printf("%-2d%s",(i + 1),"|");//бдля более красивого вывода используем printf
            for (int j = 0; j < SIZE_FIELD; j++) {
                System.out.printf("%2c",playingField[i][j]);
                if (i<SIZE_FIELD) System.out.printf("%2s","|");// если это не конец массива выводим разделитель
            }
            System.out.println();//"\u203E"
        }
        System.out.println();

    }//end printPlayingField
    void turnHuman() {//создаем метод для хода пользователя
        int cellСoordinatesX, cellСoordinatesY;//создаем переменые для координат
        do {
            System.out.println("Введите координаты клетки(в формате \"x y\" (1...3)):");
            cellСoordinatesX = in.nextInt()-1;//читаем координату X
            cellСoordinatesY = in.nextInt()-1;//читаем координату Y
        }while(!isCellValid(cellСoordinatesX, cellСoordinatesY));//end do ... while//
        playingField[cellСoordinatesX][cellСoordinatesY] = SIGN_X;//фиксируем ход пользователя
    }//end turnHuman
    boolean isCellValid(int x, int y) {//создаем метод для проверки что клетка пуста
        if(x>=SIZE_FIELD || x<0 || y>=SIZE_FIELD ||y<0){ return false;}//end if
        return playingField[x][y] == SIGN_EMPTY;
    }//end isCellValid
    //4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
    void turnAI(){//создаем метод для хода компьютера
        //Ищим выигрышный ход компьютера
        for (int i = 0; i < DOTS_TO_WIN ; i++)
            for (int j = 0; j < SIZE_FIELD; j++) {
                if (isCellValid(i, j)) {//проверяем что клетка пуста
                    playingField[i][j]= SIGN_O;//если пуста присваеваем ей значение "0"
                    if (checkWin(SIGN_O)) return;// проверяем выигрыш если наден выигрыш завершаем
                    playingField[i][j]=  SIGN_EMPTY;//иначе стираем ход

                }
            }
        //Проверим игрока а нет ли у него будующего выигрошного хода
        for (int i = 0; i < DOTS_TO_WIN ; i++)
            for (int j = 0; j < SIZE_FIELD; j++) {
                if (isCellValid(i, j)) {//проверяем что клетка пуста
                    playingField[i][j]= SIGN_X;//если пуста присваеваем ей значение "X"
                    if (checkWin(SIGN_X)) {//проверяем выигрыш
                        playingField[i][j]=SIGN_O;//если выигрыш найден предотвращаем его "0"-ком
                        return;//завершаем цикл
                    }
                    playingField[i][j]=SIGN_EMPTY;//иначе стираем ход
                }
            }
        //Если выигрыша нет делаем рандом координат
        int x;
        int y;
        do {
            x = random.nextInt(SIZE_FIELD);
            y = random.nextInt(SIZE_FIELD);
        } while (!isCellValid(y, x));
        playingField[y][x]= SIGN_O;// ход компьютера
    }//end turnAI
    //    2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
    //    3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.
    //     Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
    // проверка на победу
    boolean checkWin(char sym) {//создаем метод проверки победы
        for (int i = 0; i < SIZE_FIELD; i++) {
            for (int j = 0; j < SIZE_FIELD; j++) {
                if (checkLine(i, j, 0, 1,  sym)) return true;   // проверим линию по х
                if (checkLine(i, j, 1, 1,  sym)) return true;   // проверим по диагонали х у
                if (checkLine(i, j, 1, 0,  sym)) return true;   // проверим линию по у
                if (checkLine(i, j, -1, 1, sym)) return true;  // проверим по диагонали х -у
            }
        }
        return false; //если победы нет завершаем false
    }
    boolean checkLine(int y, int x, int vy, int vx, char sym) { //метод для проверки линии
        int wayX = x + (DOTS_TO_WIN  - 1) * vx;
        int wayY = y + (DOTS_TO_WIN  - 1) * vy;
        if (wayX < 0 || wayY < 0 || wayX > SIZE_FIELD - 1 || wayY > DOTS_TO_WIN - 1) return false;
        for (int i = 0; i < DOTS_TO_WIN ; i++) {
            int itemY = y + i * vy;
            int itemX = x + i * vx;
            if (playingField[itemY][itemX] != sym) return false;
        }
        return true;
    }
    boolean isplayingFieldFull() {//метод проверки не занито ли все поле
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (playingField[row][column] == SIGN_EMPTY) {//если найден сивол "."
                    return false;//завершить цикл и возратить false
                }//end if
            }//end for column
        }//end for row
        return true;//если все поле проверино и пустых клеток нет возратить true
    } //isplayingFieldFull

}//end Main






