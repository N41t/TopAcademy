package Lesson_32;

import java.time.LocalTime;


//Потоки не могут быть использованы одновременно. Выполнение потоков выполняется последовательно друг за другом, хоть и выглядит это параллельно
public class MainThread {

    public static void Foo(String tmp) {
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {

            }
        }
        System.out.println(tmp);
    }

    public static void main(String[] args) {
        Long start = System.nanoTime();
        System.out.println("Start : " + start / 1_000_000);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Foo("Hello");
            }
        });

        thread1.run();

        Long end = System.nanoTime();
        System.out.println("End : " + end / 1_000_000);
        System.out.println("Raznica : " + (end - start) / 1_000_000 / 1000); //для того чтобы исчислялось в миллисекундах
    }
}
