package Lesson_9_10;

import java.util.Random;

public class CW_10 {
    public static void main(String[] args) {
        int [] arr;
        arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        //arr[5] - ошибка компиляции (или ошибка инициализации?)
        System.out.println(arr); //визуальный обман на ячейку в памяти
        //arr = new int[]{1,2,3,4,5}; или arr = new int[5]; или int[] arr = {1,2,3,4,5};
        System.out.println(arr.length); //общее кол-во элементов в массиве
        //System.out.println(arr[5]); // будет 0, т.к. default значение
        System.out.println(arr[arr.length-1]);

        //чтобы вывести все элементы поочередно используем for
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //вывод всех индексов вместо элементов
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //массив наоборот
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //массив наоборот второй способ
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[arr.length-i-1] + " ");
        }

        //умножение массива и сложение
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  i * 10 + 9;
            System.out.println(arr[i] + " ");
        }
        System.out.println();


        //выведем все значения и укажем какие из них четные, а какие не четные
        int arr1[] = new int[]{1,2,3,4,5,6,7,8,9,10,11};


        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 2==0) {
                System.out.println("arr["+i+"]"+" = " + arr1[i] + " + ");
            } else {
                System.out.println("arr["+i+"]"+" = " + arr1[i] + " - ");
            }
        }
        System.out.println();

        //счетчики для четных и не четных (Even - четные, Odd - нечетные)
        int countEven = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]%2==0) countEven++;
//            System.out.println(arr1[i]%2==0? countEven++ : countOdd++);
        }

        System.out.println("Even " + countEven+"\nOdd " + (arr1.length-countEven));

        System.out.println("\n");

        //ДЗ
        /*
        Дан массив int arr[] = new int[]{10,2,233,4,185,-435,-5,3990,-400,5,5397,523,5,-6,7,8,9,-11};
        1) Вывести кол-во четных
        2) Вывести кол-во нечетных
        3) Вывести кол-во положительных
        4) Вывести кол-во отрицательных
        5) Вывести сумму всех чисел
        6) Вывести сумму всех четных чисел
        7) Вывести сумму всех нечетных чисел
        8) Вывести минимальное значение
        9) Вывести максимальное значение
        10) Вывести индекс минимального значения
        11) Вывести индекс максимального значения
        12) Вывести среднеарифметическое число
        13) Вывести кол-во двузначных чисел
        14) Вывести кол-во трехзначных чисел
        15) Вывести кол-во однозначных чисел
        16) Вывести сумму всех однозначных четных чисел
        17) Вывести сумму всех двузначных четных чисел
        18*) Написать мини-игру, где пользователь находит рандомное число (компьютер сам генерит число, а компьютер говорит больше или меньше)
        19*) Написать мини-игру где компьютер находит сам (он говорит 32 - вы говорите да или нет)
         */

        int arr2[] = new int[]{10,2,233,4,185,-435,-5,3990,-400,5,5397,523,5,-6,7,8,9,-11};
        //Среднее арифметическое 10, 20, 30 (cложить все числа и разделить на кол-во чисел)

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("1)Sum = " + sum);
        //чтобы при делении не терялось точность (каждый из делимых имел тип double)
        double avg = sum/arr2.length;
        System.out.println("2)Avg = " + avg);



        Random random = new Random();
        System.out.println(random.nextInt(100)); //0 - 100. Bound - верхний лимит. 100 не входит

        /*
        do {
              sout("1-Start");
              sout("2-Break\n");


              }while (select==1) {
                sout (welcome game);
                do {
                break;
                } while (true);

              }

              //Добавить кол-во попыток
              //Очистка консоли для игры: System.out.flush();

         */

        //Способ с урока нахождения минимального числа
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; //т.к.если не минимум значит можно присвоить
                System.out.println(min);
            }

        }

    }


}
