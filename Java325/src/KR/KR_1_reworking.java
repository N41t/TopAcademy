package KR;

public class KR_1_reworking {
    public static void main(String[] args) {
        int count = 10;


        //Обратный Прямоугольный треугольник
        for (int i = 0; i < count; i++) {
            for (int j = i; j < count; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
        System.out.println("\n");


        //Прямоугольный треугольник
        for (int i = 0; i <= count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
        System.out.println("\n");


        //Квадрат
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
        System.out.println("\n");


        //Пустой квадрат
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i==0 || i==count-1 || j==0 || j==count-1) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println("\n");


        //Наклонная
        for (int i = 0; i < count; i++) {

            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println("+");
        }
        System.out.println("\n");


        //Обратная наклонная
        for (int i = count; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("+");
        }
        System.out.println("\n");


        //Прямоугольный треугольник (пустой)

        count = 10;

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                if (i==0 || i == count - 1 || j==0 || j==i-1) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }
        System.out.println("\n");

        //Обратный прямоугольный треугольник (пустой)
        for (int i = 0; i < count; i++) {
            for (int j = i; j < count; j++) {
                if (i==0 || j==i || j==count-1) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("\n");

        //Равнобедренный треугольник
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i*2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("\n");

        //Равнобедренный треугольник (пустой) (Не разобрался)



    }
}
