package KR;

public class KR_1 {
    public static void main(String[] args) {
        int a = 10;
        //равнобедренный треугольник

        String str3 = "";
        for (int i = a; i >= 0; i--) {
            int count = i;

            while (count > 0) {
                str3 = str3 + "-";
                --count;
            }

            String str12 = "";
            for (int j = 0; j < a; j++) {
                str12 = str12 + "*";
            }
            System.out.println(str3 + str12);
            str3 = "";


        }


        System.out.println("\n----------------------------------------------------------");

        //треугольник прямоугольный
        String str1 = "";
        for (int i = 0; i < a; i++) {
            str1 = str1 + "*";
            System.out.println(str1);
        }

        System.out.println("\n----------------------------------------------------------");

        //треугольник прямоугольный обратный
        String str2 = "";
        for (int i = a; i >= 0; i--) {
            int count = i;

            while (count > 0) {
                str2 = str2 + "*";
                --count;
            }
            System.out.println(str2);
            str2 = "";
        }

        System.out.println("\n----------------------------------------------------------");
        //наклон влево
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a - 1; j++){
                if (j>0) {
                    System.out.print("");
                    System.out.print("*");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

        System.out.println("\n----------------------------------------------------------");
        //квадрат
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - 1; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}
