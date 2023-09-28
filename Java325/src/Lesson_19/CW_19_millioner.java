package Lesson_19;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Игра кто хочет стать миллионером со всеми реализациями:
//50/50
//
//звонок другу
//
//помощь зала - рандомный ответ
//
//вопросов 5

//Можно прикрутить реиграбельность
public class CW_19_millioner {
    public static Scanner scanner = new Scanner(System.in);
    public static int count = 1;
    public static int cash = 0;

    private static ArrayList mass = new ArrayList(); //выбранные варианты помощи


    public static void main(String[] args) {

        startGame();

        while (true) {
            questions();

            answer();
        }


    }

    public static void startGame() {
        System.out.println("Приветствую вас в игре Кто хочет стать миллионером! " +
                "\nУ вас будет 5 вопросов. За каждый верный ответ вы будете получать 10.000. " +
                "\nПри ответе на все 5 вопросов вы получите 50.000.\n");

        System.out.println("1 - Начать игру \n2 - Выход");


        while (true) {
            System.out.print("Ввод: ");
            int enter = scanner.nextInt();
            if (enter == 1) {
                System.out.println("Вы начали игру");
                break;
            } else if (enter == 2) {
                System.exit(1);
            }
            System.out.println("Вы ввели неверное число, введите другое");
        }

    }

    public static void questions() {

        switch (count) {
            case 1:
                System.out.println("Какое растение существует на самом деле?");
                break;
            case 2:
                System.out.println("Какой город объявлен официальной родиной русского Деда Мороза?");
                break;
            case 3:
                System.out.println("Что проводит боксер, наносящий удар противнику снизу?");
                break;
            case 4:
                System.out.println("К кому первому обратились за помощью дед и бабка, не справившись с репкой?");
                break;
            case 5:
                System.out.println("Как называется ближайшая к Земле звезда");
                break;
        }
    }

    //не забыть добавлять count после ответа на вопрос
    public static void answer() {


        switch (count) {
            case 1:
                System.out.println("1)Лох чилийский\n2)Лох индийский\n3)Лох греческий\n4)Лох русский");
                break;
            case 2:
                System.out.println("1)Великий Устюг\n2)Малая Вишера\n3)Вышний Волочек\n4)Нижний Новгород");
                break;
            case 3:
                System.out.println("1)Свинг\n2)Хук\n3)Апперкот\n4)Джэб");
                break;
            case 4:
                System.out.println("1)К Жучке\n2)К дочке\n3)К внучке\n4)К залу");
                break;
            case 5:
                System.out.println("1)Проксиома Центавра\n2)Солнце\n3)Полярная\n4)Сириус");
                break;
        }


        while (true) {
            System.out.println("\nПеред выбором ответа, хотели бы воспользоваться подсказками: \n1)50/50\n2)Помощь зала\n3)Звонок другу\n4)Нет спасибо\n");
            System.out.print("Выберите подсказку: ");
            int answer = scanner.nextInt();

            if (answer < 1 || answer > 4) {
                while (answer < 1 || answer > 4) {
                    System.out.println("\nВы ввели неверное значение. Введите значение от 1 до 4\n");
                    System.out.print("Выберите подсказку: ");
                    answer = scanner.nextInt();
                }
            }

            if (mass.contains(answer)) {
                while (mass.contains(answer)) {
                    System.out.println("Вы уже использовали эту подсказку");
                    System.out.print("Выберите подсказку: ");
                    answer = scanner.nextInt();
                }

            }


            if (answer == 1) {


                mass.add(answer);
                fiftyFifty();


            } else if (answer == 2) {



                mass.add(answer);
                hallHelp();
                break;

            } else if (answer == 3) {


                mass.add(answer);
                callFriend();
                break;

            } else if (answer == 4) {
                break;
            }


        }



        while (true) {

            System.out.print("Выберите ответ: ");
            int answer = scanner.nextInt();


            if (answer < 1 || answer > 4) {
                System.out.println("\nВы ввели неверное значение. Введите значение от 1 до 4\n");
                break;
            }

            if (count == 1 && answer == 2) {
                System.out.println("\nВерный ответ на 1 вопрос\n");
                System.out.println("\n-----------------------------------------------------------------------------");

                count++;
                cash+=10000;
                break;
            } else if (count == 2 && answer == 1) {
                System.out.println("\nВерный ответ на 2 вопрос\n");
                System.out.println("\n-----------------------------------------------------------------------------");

                count++;
                cash+=10000;
                break;
            } else if (count == 3 && answer == 3) {
                System.out.println("\nВерный ответ на 3 вопрос\n");
                System.out.println("\n-----------------------------------------------------------------------------");

                count++;
                cash+=10000;
                break;
            } else if (count == 4 && answer == 3) {
                System.out.println("\nВерный ответ на 4 вопрос\n");
                System.out.println("\n-----------------------------------------------------------------------------");
                count++;
                cash+=10000;
                break;
            } else if (count == 5 && answer == 2) {
                System.out.println("\nВерный ответ на 5 вопрос\n");
                cash+=10000;
                System.out.println("Поздравляем! Вы ответили верно на все вопросы! Ваш выйгрыш составил "+cash+" руб. До новых встреч!");
                System.exit(1);
            } else {
                System.out.println("Вы ответили неверно. Ваш выйгрыш "+cash+" руб. До новых встреч!");
                System.exit(1);
            }
        }



    }

    public static void fiftyFifty() {

        switch (count) {
            case 1:
                System.out.println("2)Лох индийский\n3)Лох греческий");
                break;
            case 2:
                System.out.println("1)Великий Устюг\n4)Нижний Новгород");
                break;
            case 3:
                System.out.println("2)Хук\n3)Апперкот\n");
                break;
            case 4:
                System.out.println("2)К дочке\n3)К внучке\n");
                break;
            case 5:
                System.out.println("1)Проксиома Центавра\n2)Солнце");
                break;
        }
    }

    public static void callFriend() {
        Random random = new Random();
        int helpAnswer = random.nextInt(4);
        System.out.println("Дружище, правильный ответ " + helpAnswer);
    }

    public static void hallHelp() {
        Random random = new Random();
        int helpAnswer = random.nextInt(4);
        System.out.println("Правильный ответ " + helpAnswer);

    }


}


