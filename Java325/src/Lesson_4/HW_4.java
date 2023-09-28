package Lesson_4;

import java.math.BigDecimal;
import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args) {

        // Task 1:
        System.out.print("Введите имя пользователя: ");
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next();
        System.out.println("Привет, " + inputName);

        // Task 2:
        final int THIS_YEAR = 2023;

        System.out.print("Введите год рождения: ");
        int yearOfBirth = scanner.nextInt();
        yearOfBirth = THIS_YEAR - yearOfBirth;
        System.out.println("Пользователю " + yearOfBirth + " лет");

        // Task 3:
        System.out.print("Введите длину стороны квадрата: ");
        int sideLength = scanner.nextInt();
        int perimeter = sideLength * 4;
        System.out.println("Пеример квадрата равен " + perimeter);

        // Task 4:
        final double PI = Math.PI;

        System.out.print("Введите радиус окружности: ");
        int circleRadius = scanner.nextInt();
        double squareCircle = PI * (circleRadius * circleRadius);
        System.out.println("Площадь окружности равна: " + squareCircle);

        //Task 5:
        System.out.print("Введите расстояние в км между двумя городами: ");
        int distance = scanner.nextInt();
        System.out.print("Введите время в часах, за которое хотие добраться: ");
        int time = scanner.nextInt();
        int speed = distance / time;
        System.out.println("Вам необходимо двигаться со скоростью: " + speed + " км/ч");

        //Task 6:
        final double COURSE_OF_EURO = 1.08;

        System.out.print("Введите сумму в долларах: ");
        double inputDollars = scanner.nextDouble();
        double convert = inputDollars * COURSE_OF_EURO;
        System.out.println(inputDollars + " долларов будет равняться " + convert + " евро");

        //Task 7:
        final float SIZE_FILE = 0.82F; //820Мб в Гб

        System.out.print("Укажите объем флешки в Гб: ");
        float flashDriveVol = scanner.nextFloat(); // 16 гб
        float numOfFiles = flashDriveVol / SIZE_FILE; // использовать BigDecimal, чтобы было без округления + указать кол-во файлов
        int numOfFilesInt = (int) numOfFiles;
        System.out.println(numOfFilesInt + " файлов размером 820Мб поместится на флешку объемом " + flashDriveVol + " Гб");

        //Task 8:
        System.out.print("Введите свое имя: ");
        String name = scanner.next();
        System.out.print("Введите фамилию: ");
        String surname = scanner.next();
        System.out.print("Введите дату рождения: ");
        String date = scanner.next();
        System.out.print("Введите пол: ");
        String gender = scanner.next();
        System.out.print("Введите номер телефона: ");
        String phoneNum = scanner.next();

        System.out.println(surname + " " + name + "\n" + date + " года рождения" + "\n" + "пол " + gender +"\n" + "телефон: " + phoneNum);
    }

    //Task 9 -> Выполнен в task 2

}
