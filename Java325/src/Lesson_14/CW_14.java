package Lesson_14;

import java.util.Arrays;

//Работа с debug
public class CW_14 {
    public static void main(String[] args) {
        int[] mas = new int[] {1, 4, 5, 7, 8, 12, 14, 15, 15, 15, 15, 15, 15, 900};
        int[] mas2 = new int[] {-1 , 0, 9, 10, 16, 921, 921};
        System.out.println(Arrays.toString(newMassive(mas, mas2)));
    }

    public static int[] newMassive(int[] mas, int[] mas2) {
        int[] mas3 = new int[mas.length + mas2.length];
        for(int i = 0, j = 0, k = 0; i < mas.length || j < mas2.length; ) {
           // System.out.println(count++ + ") => j = " + );
            if (i < mas.length && mas[i] < mas2[j]) {
                mas3[k] = mas[i];
                k++;
                i++;
            } else {
                mas3[k] = mas2[j];
                if (j == mas2.length - 1) {
                    for (int l = k + 1; l < mas3.length; l++) {
                        mas3[l] = mas[i];
                        i++;
                    }
                    break;
                }
                j++;
                k++;
            }
        }
        return mas3;
    }
}
