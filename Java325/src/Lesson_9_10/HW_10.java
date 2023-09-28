package Lesson_9_10;

import java.sql.SQLOutput;

public class HW_10 {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 2, 233, 4, 185, -435, -5, 3990, -400, 5, 5397, 523, 5, -6, 7, 8, 9, -11};


//1) Вывести кол-во четных
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Кол-во четных чисел: " + count);

//2) Вывести кол-во нечетных
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }

        System.out.println("Кол-во нечетных чисел: " + count);

//3) Вывести кол-во положительных чисел
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        System.out.println("Кол-во положительных чисел: " + count);

//4) Вывести кол-во отрицательных чисел
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        System.out.println("Кол-во отрицательных чисел: " + count);


//5)Вывести сумму всех чисел
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = count + arr[i];
        }
        System.out.println("Сумма всех чисел: " + count);

//6)Вывести сумму всех четных чисел
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count = count + arr[i];
            }
        }
        System.out.println("Сумма всех четных чисел: " + count);

//7)Вывести сумму всех нечетных чисел
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count = count + arr[i];
            }
        }
        System.out.println("Сумма всех четных чисел: " + count);

//8-9)Вывести минимальное и максимальное значение
//10-11)Вывести индекс минимального и максимального значения
        int min = 0;

//скопируем элементы в отдельный массив для нахождения индекса
        int[] arrCopy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
        }

//Отсортируем массив для удобства нахождения мин. и макс. чисел
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int num = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = num;
                }
            }
        }

// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + ", ");
// }
        System.out.println("Минимальное значение: " + arr[0]);
        System.out.println("Максимальное значение: " + arr[arr.length - 1]);

        for (int i = 0; i < arrCopy.length; i++) {
            if (arrCopy[i] == arr[0]) {
                System.out.println("Индекс минимального значения: " + i);
            } else if (arrCopy[i] == arr[arr.length - 1]) {
                System.out.println("Индекс максимального значения: " + i);
            }
        }

//12)Вывести среднеарифметическое число
        double sum = 0;
        for (int i = 0; i < arrCopy.length; i++) {
            sum = sum + arrCopy[i];
        }

        System.out.println("Среднеарифметическое число: " + sum / arrCopy.length);

//13)Вывести кол-во двухзначных чисел
//17)Вывести сумму двухзначных четных чисел
        count = 0;
        sum = 0;
        for (int i = 0; i < arrCopy.length; i++) {
            if ((arrCopy[i] >= 10 && arrCopy[i] < 100) || (arrCopy[i] <= -10 && arrCopy[i] > -100)) {
                count++;
                if (arrCopy[i] % 2 == 0) {
                    sum = sum + arrCopy[i];
                }
            }
        }
        System.out.println("Кол-во двухзначных чисел: " + count);
        System.out.println("Сумма двухзначных чисел: " + sum);

//14) Вывести кол-во трехзначных чисел
        count = 0;
        for (int i = 0; i < arrCopy.length; i++) {
            if ((arrCopy[i] >= 100 && arrCopy[i] < 1000) || (arrCopy[i] <= -100 && arrCopy[i] > -1000)) {
                count++;
            }
        }
        System.out.println("Кол-во трехзначных чисел: " + count);

//15) Вывести кол-во однозначных чисел:
//16) Вывести сумму всех однозначных четных чисел:
        count = 0;
        sum = 0;
        for (int i = 0; i < arrCopy.length; i++) {
            if ((arrCopy[i] >= 0 && arrCopy[i] < 10) || (arrCopy[i] <= 0 && arrCopy[i] > -10)) {
                count++;
                if (arrCopy[i] % 2 == 0) {
                    sum = sum + arrCopy[i];
                }
            }
        }
        System.out.println("Кол-во однозначных чисел: " + count);
        System.out.println("Сумма всех однозначных четных чисел: " + sum);
    }



}
