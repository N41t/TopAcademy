package Lesson_9_10;

public class CW_9 {
    public static void main(String[] args) {
        int count = 10;
        int z = 9;
        for (int a = 0; a < count; a++) {
            for (int i = 0; i < count; i++) {
                System.out.print(" ");
                if (i==z) {
                    for (int j = 0; j < 3; j++) {
                        System.out.println("*");
                    }
                    System.out.println();
                    break;
                }
            }
            z--;
        }
    }
}
