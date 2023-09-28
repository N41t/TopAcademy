package Lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {

        /**
         * Задание 1:
         Пользователь вводит с клавиатуры три цифры. Необходимо создать число, содержащее эти цифры. Например,
         если с клавиатуры введено 7, 3, 8, тогда нужно сформировать число 738.
         */
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите первое число: ");
//        int a = scanner.nextInt();
//        System.out.println("Введите второе число: ");
//        int b = scanner.nextInt();
//        System.out.println("Введите третье число: ");
//        int c = scanner.nextInt();
//        System.out.printf("Итоговое число: %s%s%s", a,b,c);

        /***************************************************************************************************************** */


        /**
         * Задание 2:
         Пользователь вводит с клавиатуры число, состоящее
         из четырех цифр. Требуется найти произведение цифр.
         Например, если с клавиатуры введено 1324, тогда результат произведения 1*3*2*4 = 24.
         */
//        System.out.println("Введите число: ");
//        String number = scanner.next();
//        int[] nums = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray();
//        int result = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (i != 0) {
//                result = result * nums[i];
//            } else {
//                result = nums[i];
//            }
//        }
//
//        System.out.printf("Результат произведения: %d", result);


        /***************************************************************************************************************** */

        /**
         * Задание 5:
         * Пользователь с клавиатуры вводит четырёхзначное число. Необходимо перевернуть число и отобразить
         * результат. Например, если введено 4512, результат 2154
         */

        System.out.println("Введите четырехзначное число: ");
        int number = Integer.parseInt(scanner.next());
        int answer = 0;

        for (; number != 0; number /= 10){
            int digit = number % 10;
            answer = answer * 10 + digit;
        }
        System.out.println(answer);






    }
}
