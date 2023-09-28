package Lesson_5_6;

import java.util.Arrays;
import java.util.Scanner;

public class HW_5 {
    public static void main(String[] args) {
        // Task 1:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите порядковый номер пальца руки: ");
        int finger = scanner.nextInt();
        switch (finger) {
            case 1:
                System.out.println("Большой");
                break;
            case 2:
                System.out.println("Указательный");
                break;
            case 3:
                System.out.println("Средний");
                break;
            case 4:
                System.out.println("Безымянный");
                break;
            case 5:
                System.out.println("Мизинец");
                break;
        }

        // Task 2:
        System.out.println("************************************************************");
        System.out.println("Введите два целых однозначных числа:");
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите результат умножения первого числа на второе: ");
        int userAnswer = scanner.nextInt();

        if (userAnswer == (num1 * num2)) {
            System.out.println("Вы правильно ответили!");
        } else {
            System.out.println("Вы ответили неверно! Правильный ответ: " + num1 * num2);
        }

        // Task 3:
        System.out.println("************************************************************");
        System.out.println("Введите три числа: ");
        System.out.print("Введите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int thirdNum = scanner.nextInt();

        if (firstNum > secondNum) {
            if (firstNum > thirdNum) {
                System.out.println(firstNum + " является максимальным из трех чисел");
            } else {
                System.out.println(thirdNum + " является максимальным из трех чисел");
            }
        } else {
            if (secondNum > thirdNum) {
                System.out.println(secondNum + " является наибольшим из трех чисел");
            } else {
                System.out.println(thirdNum + " является наибольшим из трех чисел");
            }
        }

        //Task 4:

        System.out.println("*****************************************************************");

        //Высокоуровневый вариант:
//        System.out.println("Введите три числа: ");
//        System.out.print("Введите первое число: ");
//        int nums1 = scanner.nextInt();
//        System.out.print("Введите второе число: ");
//        int nums2 = scanner.nextInt();
//        System.out.print("Введите третье число: ");
//        int nums3 = scanner.nextInt();
//        int[] nums = new int[] {nums1, nums2, nums3};
//        Arrays.sort(nums);
//        System.out.println("Средним числом из трёх является " + nums[1]);

        //Низкоуровневый (Если еще не знаем про сортировки и массивы)
        System.out.println("Введите три числа: ");
        System.out.println("Введите первое число: ");
        int nums1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int nums2 = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int nums3 = scanner.nextInt();

        if (nums1 > nums2 && nums1 < nums3) {
            System.out.println(nums1 + " является средним числом");
        } else if (nums2 > nums1 && nums2 < nums3) {
            System.out.println(nums2 + " является средним числом");
        } else {
            System.out.println(nums3 + " является средним числом");
        }



    }
}
