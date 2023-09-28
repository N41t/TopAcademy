package Lesson_9_10;

import java.util.Random;
import java.util.Scanner;

public class HW_10_game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру!");
        System.out.println("1 - Начать игру \n2 - Выход");
        int mainMenu;

        while (true) {
            System.out.print("Введите значение: ");
            mainMenu = scanner.nextInt();
            if (mainMenu == 1) {
                Random random = new Random();

                int findNum = random.nextInt(100);
                System.out.print("Число загадано! Отгадайте его!\nВведите число от 0 - 100: ");
                int inputNum;
                int numOfAttemps = 1;

                while (true) {
                    inputNum = scanner.nextInt();

                    if (inputNum == findNum) {
                        System.out.println("Вы угадали!");
                        break;
                    } else if (inputNum < findNum) {
                        numOfAttemps++;
                        System.out.println("Введенное число меньше загаданного");
                    } else if (inputNum > findNum) {
                        numOfAttemps++;
                        System.out.println("Введенное число больше загаданного");
                    } else if (inputNum < 0) {
                        numOfAttemps++;
                        System.out.println("Введенное число должно быть больше 0");
                    } else if (inputNum > 100) {
                        numOfAttemps++;
                        System.out.println("Введенное число должно быть меньше 100");
                    }
                    System.out.print("Вы ввели неверное число, введите другое: ");
                }

                System.out.print("Количество попыток: " + numOfAttemps);
                break;
            } else if (mainMenu == 2) {
                System.out.println("До новых встреч!");
                System.exit(0);
                break;
            } else {
                System.out.println("Вы ввели неверное значение! Введите значение 1 или 2");
            }
        }

    }
}
