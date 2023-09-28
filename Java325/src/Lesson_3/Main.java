package Lesson_3;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // type name;
        long l = 20000000000000L;

        double x = (float) 0.3 + 0.3 + 0.3;
        System.out.println(x);

        //Точное значение
        BigDecimal b = new BigDecimal("0.3").add(new BigDecimal("0.3")).add(new BigDecimal("0.3"));
        System.out.println(b);

        int a = 10;
        int c = 20;
        System.out.printf("a = %d, c = %d", a, c); //%d - представление целого числа (%f - дробные значения, %s - string, %c - char)

        double d = 2.0;
        double d0 = 0.0;

        System.out.println(d/d0);
    }
}
