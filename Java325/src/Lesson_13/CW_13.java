package Lesson_13;

import javax.swing.*;

public class CW_13 {

    //метод с дженериками (обобщеннм типом) - методу все авно какой тип ему передаем
    public static <T> T searchMax(T[] arr) {
        T max = arr[0];

        for (int i = 0; i < arr.length; i++) {

        }
        return max;
    }

    public static <T> void Print(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
    public static void tablicaUmnozhenia(int start, int end) {
        // таблица умножения через for
        for (int x = start; x <= end; x++) {
            for (int y = 0; y <=10; y++) {
                System.out.println(x+"*"+y+"=" + (x*y));
            }
            System.out.println("\n---------------------------\n");
    }

    }

    //таблица умножения с помощью рекурсии
    public static void recurseTablica(int value) {
        for (int x = 0; x <= 10; x++) {
            System.out.println(x + "*" +value+"="+(x*value));
        }
        System.out.println("-------\n");

        // Разные способы условия

//        if (value < 10) {
//            recurseTablica(++value);
//        }

        if(value==10)return; //return в void просто останавливает
        recurseTablica(++value); //префиксный инкремент ,чтобы сразу произошлоприращение значения

    }

    //Метод подсчитывающий факториал
    public static void factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
    }

    //Рекурсивный факториал
    public static int recurseFactorial(int x) {
        System.out.println(x);
        if (x==0) {
            return 1;
        }
        return x * recurseFactorial(x-1); //собираетвсе в самом конце
    }

    //метод сортировки
    public static void sort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = j+1; i < arr.length-1; i++) {
                if (arr[i] > arr[j]) {
                    int value = arr[i];
                    arr[i] = arr[j];
                    arr[j] = value;
                }
            }
        }

        
    }


    public static void main(String[] args) {
        Integer[] arrI = {1,2,3,4,5};
        Double[] arrD = {1.1,2.2,3.3,4.4,5.5};
        Character[] arrC = {'D', 'Y', '5'};

        Print(arrI);
        Print(arrD);
        Print(arrC);

        tablicaUmnozhenia(1, 5);

        System.out.println("\nТаблица умножения рекурсивная");
        recurseTablica(1);

        System.out.println(recurseFactorial(5));


        //отсортированное значение
        int[] arr = {10, 2, -3, 40, 5, 77};





    }



}
