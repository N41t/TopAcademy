package Lesson_18;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Реализовать игру крестики нолики
//1) Режим ЧЕЛОВЕК - ЧЕЛОВЕК
//Пользователь X делает ввод , пользователь Y делает ввод
//
//*2) Режим ЧЕЛОВЕК - Компьютера
//Пользователь X делает ввод , компьютер Y делает ввод
public class HW_18 {
    private static Scanner scanner = new Scanner(System.in);
    private static int crossOrZero; //0 - ноль, 1 - крест

    private static int enter;
    private static int enter2;

    private static ArrayList mass = new ArrayList();//массив чисел которые уже были выбраны

    private static char[] arr = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
//    private static String[] arr = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};


    public static void main(String[] args) {

        startGame();
        printBoard(arr);

        while (true) {

            if (winCrossOrZero() == 1) {
                System.out.println("\nПобеда крестиков");
                break;
            } else if (winCrossOrZero() == 0) {
                System.out.println("\nПобеда ноликов");
                break;
            } else if (winCrossOrZero() == 2) {
                System.out.println("\nНичья");
                break;
            }

            hod1();

            if (winCrossOrZero() == 1) {
                System.out.println("\nПобеда крестиков");
                break;
            } else if (winCrossOrZero() == 0) {
                System.out.println("\nПобеда ноликов");
                break;
            } else if (winCrossOrZero() == 2) {
                System.out.println("\nНичья");
                break;
            }
            
            hod2();
        }

        System.out.println("Конец игры!");


    }

    public static void printBoard(char[] arr) {


        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            System.out.print(" " + arr[i]);
            if (i == 2 || i == 5 || i == 8) System.out.print(" ");
            else System.out.print(" | ");

            if (j%3==0 && j<7) {
                System.out.println("\n-------------");
            }
        }
    }


    public static void hod1() {
        System.out.println("\n\nПервый игрок, введите номер позиции: ");


        while (true) {
            enter = scanner.nextInt();

            while (true) {

                if(mass.contains(enter)) {
                    System.out.println("Вы ввели позицию, которая уже занята, введите другую");
                } else {
                    break;
                }
                enter = scanner.nextInt();
            }

            if (enter > 0 && enter < 10 && crossOrZero == 1){
                arr[enter-1] = 'X';
                mass.add(enter);
                break;
            } else if (enter > 0 && enter < 10 && crossOrZero == 0) {
                arr[enter-1] = 'O';
                mass.add(enter);
                break;
            }
            System.out.println("Вы ввели неверное число, введите другое");

        }

        printBoard(arr);
    }

    public static void hod2() {
        System.out.println("\n\nВторой игрок, введите номер позиции: ");

        while (true) {
            enter2 = scanner.nextInt();

            while (true) {
                if(mass.contains(enter2)) {
                    System.out.println("Вы ввели позицию, которая уже занята, введите другую");
                } else {
                    break;
                }
                enter2 = scanner.nextInt();
            }

            if (enter2 > 0 && enter2 < 10 && crossOrZero == 1){
                arr[enter2-1] = 'O';
                mass.add(enter2);
                break;
            } else if (enter2 > 0 && enter2 < 10 && crossOrZero == 0) {
                arr[enter2-1] = 'X';
                mass.add(enter2);
                break;
            }
            System.out.println("Вы ввели неверное число, введите другое");


        }

        printBoard(arr);
    }

    public static void startGame() {
        //Начало игры
        System.out.println("Добро пожаловать в игру крестики-нолики!");
        System.out.println("Правила игры: игроки поочередно ставят крестики или нолики в клетки обозначенные цифрой.\nЦель - 3 крестика или 3 нолика по горизонтали, вертикали или диагонали. У кого получилось - тот и выйграл.");
        System.out.println("Выберите ответ: \n1) Начать игру\n2) Выйти из игры");
        System.out.print("Ввод: ");

        while (true) {
            int enter = scanner.nextInt();
            if (enter == 1) {
                System.out.println("Вы начали игру");
                break;
            } else if (enter == 2) {
                System.exit(1);
            }
            System.out.println("Вы ввели неверное число, введите другое");
        }

        System.out.println("Выберите что будет ставить первый игрок: \n1)Крестики\n2)Нолики");

        while(true) {
            int enter = scanner.nextInt();
            if (enter == 1) {
                //переменная будет крестиком
                crossOrZero = 1;
                System.out.println("Первый игрок ставит крестики, Второй игрок ставит нолики");
                break;
            } else if (enter == 2) {
                //переменная будет ноликом
                crossOrZero = 0;
                System.out.println("Первый игрок ставит нолики, Второй игрок ставит крестики");
                break;
            }
            System.out.println("Вы ввели неверное число, введите другое");
        }

        System.out.println("\nИгра началась!\n");

    }

    public static int winCrossOrZero() {

        if((arr[0] == 'X' && arr[4] == 'X' && arr[8] == 'X')
               || (arr[6] == 'X' && arr[4] == 'X' && arr[2] == 'X')
               || (arr[0] == 'X' && arr[3] == 'X' && arr[6] == 'X')
               || (arr[0] == 'X' && arr[1] == 'X' && arr[2] == 'X')
               || (arr[2] == 'X' && arr[5] == 'X' && arr[8] == 'X')
               || (arr[6] == 'X' && arr[7] == 'X' && arr[8] == 'X')
               || (arr[3] == 'X' && arr[4] == 'X' && arr[5] == 'X')
               || (arr[1] == 'X' && arr[4] == 'X' && arr[7] == 'X')){
            return 1; //Победа крестиков
            } else if ((arr[0] == 'O' && arr[4] == 'O' && arr[8] == 'O')
                || (arr[6] == 'O' && arr[4] == 'O' && arr[2] == 'O')
                || (arr[0] == 'O' && arr[3] == 'O' && arr[6] == 'O')
                || (arr[0] == 'O' && arr[1] == 'O' && arr[2] == 'O')
                || (arr[2] == 'O' && arr[5] == 'O' && arr[8] == 'O')
                || (arr[6] == 'O' && arr[7] == 'O' && arr[8] == 'O')
                || (arr[3] == 'O' && arr[4] == 'O' && arr[5] == 'O')
                || (arr[1] == 'O' && arr[4] == 'O' && arr[7] == 'O')){
            return 0; //Победа ноликов
        } else if (mass.size() == 9){
            return 2;
        } else {
            return 3;
        }
    }




}
