package Lesson_16;

import java.util.Arrays;

public class HW_16 {
   public static char[] arr = new char[]{};


    public static void main(String[] args) {
        System.out.println(charAt("Привет как дела", 5));

        System.out.println(equals("Привет", "Привет"));
        System.out.println(equals("Привет", "Привет мир"));

        System.out.println(toLowerCase("PrIvET"));
//        System.out.println(toLowerCase("ПРИвет"));

        System.out.println(toUpperCase("prIvET"));

        System.out.print("IndexOf");
        System.out.println(indexOf("Goodbye", 'o'));

        System.out.println(indexOf("Goodbye", "d"));

        System.out.println(indexOfChar("Goodbye", 'o', 0)); //1
        System.out.println(indexOfChar("Goodbye", 'o',2)); //2
        System.out.println("\n");

        System.out.print("IndexOf");
        System.out.println(lastIndexOf("Goodbye", 'o')); //2
        System.out.println(lastIndexOf("Goodbye", "o")); //2

        System.out.println();

        System.out.println(trim("  Привет  "));

        System.out.println();

        System.out.println(startsWith("Привет", "При"));
        System.out.println(startsWith("Привет", "Про"));

        System.out.println();

        System.out.println(endsWith("Привет", "вет"));
        System.out.println(endsWith("Привет", "всет"));

        System.out.println();

        System.out.println(equalsIgnoreCase("PrIVet", "Privet"));







    }


//возвращает символ строки по указанному index-у
    public static char charAt(String str, int index) {
        char[] arrChar = str.toCharArray();
        char value = 0;
        for (int i = 0; i < arrChar.length; i++) {
            if (i == index) {
                value = arrChar[i];
            }
        }
        return value;
    }


//возвращает true если str == arr по значению
    public static boolean equals(String str1, String str2) {
        char[] arrStr1 = str1.toCharArray();
        char[] arrStr2 = str2.toCharArray();
        int count = 0;
        boolean answer = false;

        if (arrStr1.length == arrStr2.length) {
            for (int i = 0; i < arrStr1.length; i++) {
                if (arrStr1[i] == arrStr2[i]) {
                    count++;
                } else {
                    answer = false;
                    break;
                }
            }

            if (count == arrStr1.length) {
                answer = true;
            } else {
                answer = false;
            }
        } else {
            answer = false;
        }

        return answer;
    }

    //возвращает string все символы в нижнем регистре
    public static String toLowerCase(String str) {
        char[] arrStr = str.toCharArray();
        for(int i = 0; i < arrStr.length; i++) {

            if (arrStr[i] > 64 && arrStr[i] < 91) {
                arrStr[i] = (char) (arrStr[i] + 32);
            }

//            if (arrStr[i] > 193 && arrStr[i] < 224) { //Для кириллицы
//                arrStr[i] = (char) (arrStr[i] + 32);
//            }
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

    //возвращает index первого вхождения в противном случаи -1
    public static int indexOf(String str, char c) {
        int index = 0;
        char[] arrStr = str.toCharArray();

        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i] == c) {
                index = i;
                break;
            }
            if (index == 0) {
                index = -1;
            }
        }
        return index;

    }

    public static int indexOf(String str, String c) {
        int index = 0;
        char[] arrStr = str.toCharArray();
        char[] arrC = c.toCharArray();

        for (int i = 0, j = 0; i < arrStr.length; i++) {
            if (arrStr[i] == arrC[j]) {
                index = i;
                break;
            }
            if (index == 0) {
                index = -1;
            }
        }
        return index;
    }

    //возвращает index первого вхождения начиная с fromIndex в противном случае -1
    public static int indexOfChar(String str, char c, int fromIndex) {
        int index = 0;
        char[] arrStr = str.toCharArray();

        for (int i = fromIndex; i < arrStr.length; i++) {
            if (arrStr[i] == c) {
                index = i;
                break;
            }
            if (index == 0) {
                index = -1;
            }
        }
        return index;
    }


    //возвращает index первого вхождения c конца в противном случаи -1
    public static int lastIndexOf(String str, char c) {
        int index = 0;
        char[] arrStr = str.toCharArray();

        for (int i = arrStr.length - 1; i > 0; i--) {
            if (arrStr[i] == c) {
                index = i;
                break;
            }
            if (index == 0) {
                index = -1;
            }
        }
        return index;
    }

    public static int lastIndexOf(String str, String c) {
        int index = 0;
        char[] arrStr = str.toCharArray();
        char[] arrC = c.toCharArray();

        for (int i = arrStr.length - 1, j = 0; i > 0; i--) {
            if (arrStr[i] == arrC[j]) {
                index = i;
                break;
            }
            if (index == 0) {
                index = -1;
            }
        }
        return index;
    }

    //возвращает string удалив пробелы слева и справа
    public static String trim(String str) {
        int countRight = 0;
        int countLeft = 0;
        char[] arrStr = str.toCharArray();

        //Провеяем кол-во пробелов слева
        for (int i = arrStr.length-1; i > 0; i--) {
            if (arrStr[i] == ' ') {
                countRight++;
            } else if (arrStr[i] != ' ') {
                break;
            }
        }


        //Проверем кол-во пробелов справа
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i] == ' ') {
                countLeft++;
            } else if (arrStr[i] != ' '){
                break;
            }
        }

        char[] newArr = new char[arrStr.length-(countRight+countLeft)];

        for (int i = 0; i < newArr.length; i++) {
            if (i == arrStr.length-1-countRight) {
                break;
            } else {
                newArr[i] = arrStr[i+countLeft];
            }

        }

        arrStr = newArr;



        return Arrays.toString(arrStr);
    }

   // возвращает true если строка начинаеться на str в противном случаи false
    public static boolean startsWith(String str, String c) {
        boolean answer = false;
        char[] arrStr = str.toCharArray();
        char[] arrC = c.toCharArray();

        for (int i = 0; i < arrC.length; i++) {
            if (arrStr[i] == arrC[i]) {
                answer = true;
            } else {
                answer = false;
                break;
            }
        }

        return answer;
    }

    //возвращает true если строка заканчиваеться на str в противном случаи false
    public static boolean endsWith(String str, String c) {
        boolean answer = false;
        char[] arrStr = str.toCharArray();
        char[] arrC = c.toCharArray();

        for (int i = arrC.length-1, j = arrStr.length-1; i >= 0; i--, j--) {
            if (arrStr[j] == arrC[i]) {
                answer = true;
            } else {
                answer = false;
                break;
            }
        }

        return answer;
    }

    //возвращает true если строка равна str не учитывая регистр
    public static boolean equalsIgnoreCase(String str1, String str2) {
        char[] arrStr1 = str1.toCharArray();
        char[] arrStr2 = str2.toCharArray();
        int count = 0;
        boolean answer = false;


        for(int i = 0; i < arrStr1.length; i++) {

            if (arrStr1[i] > 64 && arrStr1[i] < 91) {
                arrStr1[i] = (char) (arrStr1[i] + 32);
            }

        }

        for(int i = 0; i < arrStr2.length; i++) {

            if (arrStr2[i] > 64 && arrStr2[i] < 91) {
                arrStr2[i] = (char) (arrStr2[i] + 32);
            }

        }

        if (arrStr1.length == arrStr2.length) {
            for (int i = 0; i < arrStr1.length; i++) {
                if (arrStr1[i] == arrStr2[i]) {
                    count++;
                } else {
                    answer = false;
                    break;
                }
            }

            if (count == arrStr1.length) {
                answer = true;
            } else {
                answer = false;
            }
        } else {
            answer = false;
        }

        return answer;

    }

    


}




