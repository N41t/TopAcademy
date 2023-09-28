package Lesson_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CW_15 {
    public static int size = 0;

    public static int arr[] = new int[size];
    public static int index = 0; //элементы внутри

//    public static  int capacity = 0;


    public static void add(int value) { //метод добавления нового значения в массив
        checkArray();
        arr[index] = value;
        index++;
    }

    public static void addIndex(int newIndex, int element) {
        int[] newArray = new int[arr.length+1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == newIndex) {
                newArray[i] = element;
            } else {
                newArray[i] = arr[j++];
            }

        }
        index++;
        arr = newArray;

    }

    public static void checkArray() { //проверяет емкость массива, предотвращает ошибку переполнения
        if (index>=arr.length) {
            int[] newArray = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
            }
            arr = newArray;
        }
    }

    public static void print(int[] arr) { //свой метод для печати массива (заместо toString())
        for (int i = 0; i < index; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {


// Обычный arrayList
        List<Integer> m = new ArrayList<>();
        m.add(10);
        m.add(10);
        System.out.println(Arrays.toString(m.toArray()));
        System.out.println(m.size());

        //m.add +
        //m.size()
        //m.get(index)
        //m.remove()
        //m.contains()
        //m.clear()

        System.out.println("\n==============================================");
//Свой ArrayList

        add(1);
        add(2);
        add(3);
        add(4);
        addIndex(2, 9);
        print(arr);







//        //ArrayList - для перебора массива, там быстрее полчать элементы из середины и быстрее добавлять.
//        List<Integer> arr = new ArrayList<>(); //мы не можем увеличить массив
//        int index = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//
//            System.out.println("Enter count person : ");
//            int count = scanner.nextInt();
//
//            arr.add(count);
//            System.out.println(Arrays.toString(arr));
        }
    }

