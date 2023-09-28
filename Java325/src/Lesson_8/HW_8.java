package Lesson_8;

public class HW_8 {
    public static void main(String[] args) {
        int count = 10;

        //Квадрат
        int i = 0;

        int j = 0;

        while (i < count) {


            System.out.print("+");
            i++;

            if (i == count && j < count - 1) {
                System.out.println();
                i = 0;
                j++;
            }
        }
        System.out.println("\n");

//        //Квадрат с пустотой
        i = 0;
        j = 0;

        while (i < count) {


            //if (i == 0 || j == 0 || j == counter - 1 || i == j+1) {
            if (i==0 || i==count-1 || j==0 || j==count-1) {
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

        }
        System.out.println("\n");
//
//
//
//        //Прямоугольный треугольник
        i = 0;
        j = 0;

        while (i < count) {

            i++;

            while (j < i) {

                System.out.print("+");

                j++;

            }

            j = 0;


            System.out.println();

        }
        System.out.println("\n");

//        //Прямоугольный треугольник (пустой)
        i = 0;
        j = 0;

        while (i < count) {

            i++;

            while (j < i) {
                if (j==0 || j==i-1 || i == count) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }

                j++;
            }

            j = 0;


            System.out.println();

        }
        System.out.println("\n");


//        //Перевернутый прямоугольный треугольник
        i = 0;
        j = 0;

        while (i < count) {

            i++;

            while (j < count) {
                System.out.print("+");
                j++;
            }

            j = i;


            System.out.println();

        }
        System.out.println("\n");


//        //Перевернутый прямоугольный треугольник (пустой)
        i = 0;
        j = 0;

        while (i < count) {
            i++;

            while (j < count) {

                if (i==1 || j==i-1 || j==count-1) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }

                j++;
            }

            j = i;


            System.out.println();

        }
        System.out.println("\n");

//        //Наклонная влево

        i = 0;

        while (i < count) {

            j = 0;

            while (j < i) {
                System.out.print(" ");
                j++;
            }
            System.out.println("+");
            i++;
        }
        System.out.println("\n");

//
//        //Наклонная вправо
        i = count;

        while (i > 0) {

            j = 0;
            while (j < i) {
                System.out.print(" ");
                j++;
            }
            System.out.println("+");
            i--;
        }
        System.out.println("\n");
//
//        //Равнобедренный треугольник

        i = 0;
        j = 0;
        int k = 0;
        i = 1;
        while(i <= count) {
            j = 1;
            while(j <= count-i){
                System.out.print(" ");
                j++;
            }
            k = 1;
            while (k <= (i*2) - 1) {
                System.out.print("+");
                k++;
            }
            System.out.println();
            i++;
        }

        System.out.println("\n");

        count = 10;
        //Равнобедренный треугольник(пустой)

        j = 0;
        k = 0;
        i = 0;
        while(i < count) {
            j = 0;
            while(j < count) {
                System.out.print(" ");
                if (j == count - i - 1) {
                    k = 0;
                    while (k < 2 * i + 1) {
                        if (k == 0 || k == i * 2 || i == count - 1) {
                            System.out.print("+");
                            k++;
                        } else {
                            System.out.print(" ");
                            k++;
                        }

                    }
                }
                j++;
            }

            System.out.println();
            i++;
        }




    }
}
