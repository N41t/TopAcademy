package Lesson_16;

import java.util.Arrays;

public class sdf {
    public static int[] arr = new int[] {1,2,3,4};

    public static void main(String[] args) {
        add(5);

        System.out.println(Arrays.toString(arr));

    }

    public static void add(int count) {
        int[] newArr = new int[arr.length+1];
        for (int i = 0;i < newArr.length; i++) {
            if (i == newArr.length-1) {
                newArr[i] = count;
            } else {
                newArr[i] = arr[i];
            }

        }

        arr = newArr;
    }
}
