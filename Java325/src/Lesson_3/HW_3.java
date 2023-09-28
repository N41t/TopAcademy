package Lesson_3;

public class HW_3 {

    public static void main(String[] args) {
        int x = 5;
        int y = 2;

        //First method:
        int z = x;
        x = y;
        y = z;

        //Second method:
        x = x + y;
        y = x - y;
        x = x - y;

        //Third method:
        y = x * y;
        x = y / x;
        y = y / x;

        //Fourth method:
        x = x + y - (y = x);

        double xfdf = 0/.0f;
        System.out.println(xfdf);

        // операторы % и ^

        //      //comment

        // false, true, true

        // унарные операторы - ~, +, -

        // бинарные !=

        System.out.println(0*1+2L);

        //строгая и статическая типизация

        // Размерность boolean зависит от реализации JVM

        // - 128 (нет картинки)

        System.out.println(0.0/0.0+10);

        /** This is a valid comment in java. ****/
        /* This is a valid comment in java //
        ///* This is a valid comment in java */
        // This is a valid //comment in java

        /* /* This is a valid comment in java. */
        /* This is a valid comment in java /

         */

        final double abc = 5.19e-4;
        int h = 0xAB;
        System.out.println(0/.0 == 0/.0);

    }

}
