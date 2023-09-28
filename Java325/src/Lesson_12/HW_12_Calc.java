package Lesson_12;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW_12_Calc {

    public static void main(String[] args) {
        System.out.println(calcLogic());
    }


    

    public static String calcLogic() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double var1 = scanner.nextDouble();
        double var2;

        System.out.println("Выберите оператор: (+, -, *, /)");
        String operator;

        while(true) {
            operator = scanner.next();

            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                break;
            } else {
                System.out.println("Вы ввели некорректный оператор. Выберите один из представленных (+, -, *, /) и повторите попытку");
            }

        }

        System.out.print("Введите второе число: ");

        while (true) {
            var2 = scanner.nextDouble();
            if (operator.equals("/") && var2 == 0) {
                System.out.println("Деление на ноль запрещено. Выберите другое число: ");
            } else {
                break;
            }
        }

        String answer = "";

        if (operator.equals("+")) {
            answer = "Ответ: "+addition(var1, var2);
        } else if (operator.equals("-")) {
            answer = "Ответ: "+subtraction(var1, var2);
        } else if (operator.equals("*")) {
            answer = "Ответ: "+multiplication(var1, var2);
        } else if (operator.equals("/")) {
            answer = "Ответ: "+divide(var1, var2);
        }

        return answer;
    }


    public static double addition(double var1, double var2) {
        return var1 + var2;
    }

    public static double subtraction(double var1, double var2) {
        return var1 - var2;
    }

    public static double multiplication(double var1, double var2) {
        return var1 * var2;
    }

    public static double divide(double var1, double var2) {
        return var1 / var2;
    }

    //У нас должно быть 4 метода на каждый оператор. Один сканнер на 2 входящих переменных. Для выбора оператора использовать switch
}
