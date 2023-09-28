package Lesson_5_6;

public class ClassWork5_6 {
    public static void main(String[] args) {
        //new
//        int day = 3;
//        String number = switch (day) {
//            case 1 -> "Понедельник";
//            case 2 -> "Вторник";
//            case 3 -> "Среда";
//        };

        // Циклы: for, while,l do while
        for (int i = 0; i < 10; i++) {
            //System.out.println(i);
        }

        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0)
                continue; // помогает для выдергивания значения из цикла
            System.out.println(i);
        }
    }
}
