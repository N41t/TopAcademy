package Lesson_15;

import java.util.Arrays;

public class HW_15 {

    public static int size = 0;

    public static int arr[] = new int[size];
    public static int index = 0; //элементы внутри


    public static int size() {
        //Чтобы вернуть размер массива необходимо просто вернуть его длину
        return arr.length;

    }

    public static int get(int index) {
        return arr[index];
    }

    public static int removeIndex(int index) {
        int[] newArr = new int[arr.length - 1];
        int remove = 0;
        int i = 0;
        for (int j = 0; i < arr.length; i++) {
            if (i == index) {
                System.out.println("Удаленный элемент = [" + arr[i] + "]");
                remove = arr[i];
                continue;
            }
            newArr[j++] = arr[i];
        }
        arr = newArr;
        return remove;

    }

    public static void add(int value) { //метод добавления нового значения в массив
        checkArray();
        arr[index] = value;
        index++;
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

    public static boolean containsElement(int value) {
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                result = true;
                break;
            }

            if (i == arr.length - 1) {
                result = false;
            }
        }

        return result;
    }

    public static void clear() {
        arr = new int[0];
    }

    public static void main(String[] args) {

    add(1);
    add(2);
    add(3);
    add(4);
    System.out.println(size());
    System.out.println(get(2));



    //До remove
    System.out.println(Arrays.toString(arr));

    removeIndex(2); //уберет 3

    //После remove
    System.out.println(Arrays.toString(arr));

        System.out.println(containsElement(5));
        System.out.println(containsElement(2));

    clear();

        System.out.println(Arrays.toString(arr));







    }

}
