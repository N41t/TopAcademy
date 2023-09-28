package Lesson_16;

public class HW_16_rework {

    public static void main(String[] args) {
        System.out.println(toLowerCase("ПрИВЕт"));
        System.out.println(toUpperCase("PrIvET"));

    }


    //возвращает string все символы в нижнем регистре
    public static String toLowerCase(String str) {
        char[] arrStr = str.toCharArray();
        for(int i = 0; i < arrStr.length; i++) {

            if (arrStr[i] > 64 && arrStr[i] < 91) {
                arrStr[i] = (char) (arrStr[i] + 32);
            }

            if (arrStr[i] > 193 && arrStr[i] < 224) { //Для кириллицы
                arrStr[i] = (char) (arrStr[i] + 32);
            }
        }

        String answer = new String(arrStr);
        return answer;
    }

    //возвращает string все символы в верхнем регистре
    public static String toUpperCase(String str) {
        char[] arrStr = str.toCharArray();
        for(int i = 0; i < arrStr.length; i++) {

            if (arrStr[i] > 96 && arrStr[i] < 123) {
                arrStr[i] = (char) (arrStr[i] - 32);
            }

        }

        String answer = new String(arrStr);
        return answer;
    }
}
