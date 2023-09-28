package Lesson_9_10;

public class HW_9 {
    public static void main(String[] args) {
        int count = 10;

        //Квадрат
        //do - делай что то {
        // сделал
        // } проверка while (?)

        int i = 0;

        int j = 0;

        do {
            System.out.print("+");
            i++;

            if (i == count && j < count - 1) {
                System.out.println();
                i = 0;
                j++;
            }
        } while (i < count);
        System.out.println("\n");

        //Пустой квадрат
        i = 0;
        j = 0;

        do {
            if (i == 0 || i == count - 1 || j == 0 || j == count - 1) {
                System.out.print("+");
            } else {
                System.out.print(" ");
            }

            i++;


            if (i == count && j < count - 1) {
                System.out.println();
                i = 0;
                j++;
            }
        } while (i < count);
        System.out.println("\n");

        //Прямоугольный треугольник
        i = 0;
        j = 0;

        do {
            i++;

            while (j < i) {

                System.out.print("+");

                j++;

            }

            j = 0;


            System.out.println();
        } while (i < count);
        System.out.println("\n");

        //Прямоугольный треугольник (пустой)
        i = 0;
        j = 0;
        do {
            i++;


            do {
                if (j == 0 || j == i - 1 || i == count) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }

                j++;
            } while (j < i);

            j = 0;


            System.out.println();

        } while (i < count);
        System.out.println("\n");


        //Обратный прямоугольный треугольник
        i = 0;
        j = 0;

        do {
            i++;

            do {
                System.out.print("+");
                j++;
            } while (j < count);

            j = i;

            System.out.println();
        } while (i < count);
        System.out.println("\n");

        //Обратный прямоугольный треугольник (пустой)
        i = 0;
        j = 0;

        do {
            i++;

            do {
                if (i==1 || j==i-1 || j==count-1) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }

                j++;
            } while (j < count);

            j = i;
            System.out.println();
        } while (i < count);
        System.out.println("\n");

        //Наклонная влево
        i = 0;

        do {
            j = 0;

            do {
                System.out.print(" ");
                j++;
            } while (j < i);


            System.out.println("+");
            i++;
        } while (i < count);
        System.out.println("\n");

        //Наклонная вправо
        i = count;
        do {
            j = 0;

            do {
                System.out.print(" ");
                j++;
            } while (j < i);

            System.out.println("+");
            i--;
        } while (i > 0);
        System.out.println("\n");

        //Равнобедренный треугольник
        j = 0;
        int k = 0;
        i = 1;

        do {
            j = 1;

            do {
                System.out.print(" ");
                j++;
            } while (j <= count-i);
            k = 1;
            do {
                System.out.print("+");
                k++;
            } while (k <= (i*2) - 1);
            System.out.println();
            i++;
        } while (i <= count);
        System.out.println("\n");

        //Равнобедренный треугольник (пустой)
        j = 0;
        k = 0;
        i = 0;

        do {
            j = 0;
            do {
                System.out.print(" ");
                if (j == count - i - 1) {
                    k = 0;
                    do {
                        if (k == 0 || k == i * 2 || i == count - 1) {
                            System.out.print("+");
                            k++;
                        } else {
                            System.out.print(" ");
                            k++;
                        }
                    } while (k < 2 * i + 1);
                }
                j++;
            } while (j < count);

            System.out.println();
            i++;
        } while (i < count);
    }
}
