package Lesson_15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HW_15_pt2 {
    public static int arr[] = {1, 2, 3, 4, 5, 6, 2};

    public static void main(String[] args) {
        //replaceAll
//        System.out.println("ReplaceAll: ");
//        System.out.println(Arrays.toString(arr));
//        replaceAll(2, 9);
//        System.out.println(Arrays.toString(arr)+"\n");

        //replace
//        System.out.println("Replace: ");
//        System.out.println(Arrays.toString(arr));
//        replace(2, 9);
//        System.out.println(Arrays.toString(arr)+"\n");

        //removeAll
//        System.out.println("RemoveAll: ");
//        System.out.println(Arrays.toString(arr));
//        removeAll(2);
//        System.out.println(Arrays.toString(arr));

        //reverse
//        System.out.println("Reverse: ");
//        System.out.println(Arrays.toString(arr));
//        reverse();
//        System.out.println(Arrays.toString(arr));

//       //addStart
//        System.out.println("AddStart: ");
//        System.out.println(Arrays.toString(arr));
//        addStart(15);
//        System.out.println(Arrays.toString(arr));

        //addEnd
        System.out.println("AddEnd: ");
        System.out.println(Arrays.toString(arr));
        addEnd(30);
        System.out.println(Arrays.toString(arr));




    }

    public static void replaceAll(int oldElement, int newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement) {
                arr[i] = newElement;
            }
        }
    }

    public static void replace(int oldElement, int newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement) {
                arr[i] = newElement;
                break;
            }
        }
    }

    public static void removeAll(int element) {
        int count = 0;
        for (int i =0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        int[] newArr = new int[arr.length - count];

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i>newArr.length || j>newArr.length) break;

            if (arr[i] == element && i != arr.length-1) {

                newArr[i] = arr[i + 1];
                j++;
            } else {
                newArr[i] = arr[j];
            }
        }
        arr = newArr;
    }

    public static void reverse() {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }
        arr = newArr;
    }

    public static void addStart(int element) {
        int[] newArr = new int[arr.length+1];
        newArr[0] = element;
        for (int i = 1; i <= arr.length; i++) {
            newArr[i] = arr[i-1];
        }
        arr = newArr;
    }

    public static void addEnd(int element) {
        int[] newArr = new int[arr.length+1];
        newArr[newArr.length-1] = element;
        for (int i = 0; i <= arr.length-1; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }


}
