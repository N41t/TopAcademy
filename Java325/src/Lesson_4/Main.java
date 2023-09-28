package Lesson_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scr.nextInt();
        System.out.println("Enter y: ");
        int y = scr.nextInt();
        System.out.println("X => " + x);
        System.out.println("Y => " + y);


        //scanner.nextInt() -> для целых чисел
        //scanner.nextDouble() -> для дробных чисел
        //scanner.nextFloat() -> для дробных чисел float
        //scanner.next() -> для строк (какое бы число не ввели, будет выведен как строка). !!! Работает только до первого пробела
        //scanner.nextLine() -> для строк, но позволяет считывать вместе с пробелом

        ///////////////////////////////////////////////////////////////////////////////////////////////////
        // Операнд - переменная или какое то значение
        // Операция - символ, который обозначает какое либо действие
        int a = 10;
        int b = 30;

        // Унарные операции
        // +, -, ++, --, !(не)
        b = -30; // Унарная операция (над одним операндом)
        b = + 30;


        // Бинарные операции
        // /, *, &&, ||, ==, >, <, <=, >=, !=
        int c = a + b; // Бинарная операция (над двумя операндами)

        // Тернарные операции(выполняются над тремя операндами)
        // ?:;

        ////////////////////////////////////////

        // Постфиксный и префиксный
        int x1 = 10;
        int y1 = ++x1; //x1 = 11; y1 = 11
        int z1 = y1++; // z1 = 11; y1 = 11
        // след строчка y1 = 12
        x1 = z1--; // x1 = 11; z1 = 11
        //след строчка z1 = 10

        System.out.println("x1 = " + x1);
        System.out.println("z1 = " + z1);
        System.out.println("y1 = " + y1);


        // Ассоциативность - порядок выполнения операторов

        //Лево-ассоциативные операторы: (читаются слева  - направо)
        int m = 2 + 3 + 4;

        //Право-ассоциативные операторы: (читаются справа - налево)
        int p = a = b = m;

        //Определить последовательность
        int v = 2;
        int l = 5;
        int k = l * 3 + 20 / 2 * v--;

        //1) l * 3
        //2) 20/2
        //3) v--
        //4)







    }
}
