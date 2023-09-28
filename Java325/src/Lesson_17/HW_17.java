package Lesson_17;

import java.util.Arrays;

public class HW_17 {
   public static char[] arr = new char[]{};



    public static void main(String[] args) throws Exception {

        //1. Возвращает символ строки по указанному индексу
        System.out.println("1) CharAt: ");
        System.out.println(charAt("Привет", 5));
        //Test Exception:
        //System.out.println(charAt("", 100));
        System.out.println();


        //2. возвращает true если str == arr по значению
        System.out.println("2) Equals: ");
        System.out.println(equals("Привет", "Привет"));
        System.out.println(equals("Привет", "Привет мир"));
        System.out.println();

        //3. возвращает string все символы в нижнем регистре
        //Exception не нужен
        System.out.println("3) ToLowerCase: ");
        System.out.println(toLowerCase("PrIvET"));
//        System.out.println(toLowerCase("ПРИвет"));
        System.out.println();

        //4. возвращает string все символы в верхнем регистре
        //Exception не нужен
        System.out.println("4) ToUpperCase: ");
        System.out.println(toUpperCase("prIvET"));
        System.out.println();


        //5. возвращает index первого вхождения в противном случае -1
        //Exception не нужен
        System.out.println("5) IndexOf: ");
        System.out.println(indexOf("Goodbye", 'o'));
        System.out.println(indexOf("Goodbye", "d"));
        //Проверка Exception
        //System.out.println(indexOf("goodbye", "u"));
        System.out.println();

        //6. возвращает index первого вхождения начиная с fromIndex в противном случаи -1
        System.out.println("6) IndexOfChar: ");
        System.out.println(indexOfChar("Goodbye", 'o', 0)); //1
        System.out.println(indexOfChar("Goodbye", 'o',2)); //2
        //Exception test:
        //System.out.println(indexOfChar("Goodbye", 'o', 100));
        System.out.println();

        //7. возвращает index первого вхождения c конца в противном случаи -1
        System.out.println("7) LastIndexOf: ");
        System.out.println(lastIndexOf("Goodbye", 'o')); //2
        System.out.println(lastIndexOf("Goodbye", "o")); //2
        System.out.println();

        //8. возвращает string, удалив пробелы слева и справа
        System.out.println("8) Trim: ");
        System.out.println(trim("  Привет  "));
        //Проверка exception
        //System.out.println(trim(""));
        System.out.println();

        //9. возвращает true если строка начинается на str в 12) противном случаи false
        System.out.println("9) StartsWith: ");
        System.out.println(startsWith("Привет", "При"));
        System.out.println(startsWith("Привет", "Про"));
        System.out.println();

        //10. возвращает true если строка заканчивается на str в противном случаи false
        System.out.println("10) EndsWith: ");
        System.out.println(endsWith("Привет", "вет"));
        System.out.println(endsWith("Привет", "всет"));
        System.out.println();

        //11. возвращает массив символов
        System.out.println("11) EqualsIgnoreCase: ");
        System.out.println(equalsIgnoreCase("PrIVet", "Privet"));
        System.out.println();

    }


//возвращает символ строки по указанному index-у
    public static char charAt(String str, int index) throws Exception{

        char[] arrChar = str.toCharArray();

        if (str == "") {
            throw new NullPointerException("Проверяемая строка пуста!");
        }

        if (str == null) {
            throw new ClassCastException("Вы ввели не строку");
        }

        if (index > arrChar.length-1) {
            throw new ArrayIndexOutOfBoundsException("Указан индекс, который выходит за пределы строки");
        }


        char value = 0;
        for (int i = 0; i < arrChar.length; i++) {
            if (i == index) {
                value = arrChar[i];
            }
        }
        return value;
    }


//возвращает true если str == arr по значению
//Exception не нужен
    public static boolean equals(String str1, String str2) {

        if (str1 == "" || str2 == "") {
            throw new NullPointerException("Проверяемая строка пуста");
        }

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
    //Exception не требуется
    public static String toLowerCase(String str) {


        if (str == "") {
            throw new NullPointerException("Проверяемая строка пуста");
        }

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
    //Exception не требуется
    public static String toUpperCase(String str) {

        if (str == "") {
            throw new NullPointerException("Проверяемая строка пуста");
        }

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
    public static int indexOf(String str, char c) throws Exception{
        int index = 0;
        char[] arrStr = str.toCharArray();

        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i] == c) {
                index = i;
                break;
            }
        }

        if (index == 0) {
            throw new Exception("Индекс был не найден");
        }

        return index;

    }

    public static int indexOf(String str, String c) throws Exception{
        int index = 0;
        char[] arrStr = str.toCharArray();
        char[] arrC = c.toCharArray();

        for (int i = 0, j = 0; i < arrStr.length; i++) {
            if (arrStr[i] == arrC[j]) {
                index = i;
                break;
            }
        }

        if (index == 0) {
            throw new Exception("Индекс был не найден");
        }
        return index;
    }

    //возвращает index первого вхождения начиная с fromIndex в противном случае -1
    public static int indexOfChar(String str, char c, int fromIndex) throws Exception {
        int index = 0;
        char[] arrStr = str.toCharArray();

        if (fromIndex > arrStr.length-1) {
            throw new ArrayIndexOutOfBoundsException("Указан индекс, который выходит за пределы строки");
        }

        for (int i = fromIndex; i < arrStr.length; i++) {
            if (arrStr[i] == c) {
                index = i;
                break;
            }
        }

        if (index == 0) {
            throw new Exception("Индекс был не найден");
        }

        return index;
    }


    //возвращает index первого вхождения c конца в противном случаи -1
    public static int lastIndexOf(String str, char c) throws Exception{
        int index = 0;
        char[] arrStr = str.toCharArray();

        for (int i = arrStr.length - 1; i > 0; i--) {
            if (arrStr[i] == c) {
                index = i;
                break;
            }
        }

        if (index == 0) {
            throw new Exception("Индекс был не найден");
        }

        return index;
    }

    public static int lastIndexOf(String str, String c) throws Exception {
        int index = 0;
        char[] arrStr = str.toCharArray();
        char[] arrC = c.toCharArray();

        for (int i = arrStr.length - 1, j = 0; i > 0; i--) {
            if (arrStr[i] == arrC[j]) {
                index = i;
                break;
            }
        }

        if (index == 0) {
            throw new Exception("Индекс был не найден");
        }

        return index;
    }

    //возвращает string удалив пробелы слева и справа
    public static String trim(String str) {
        int countRight = 0;
        int countLeft = 0;
        char[] arrStr = str.toCharArray();

        if (str.isEmpty()) {
            throw new NullPointerException("Проверяемая строка пуста");
        }

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

        if (str1 == "" || str2 == "") {
            throw new NullPointerException("Введена пустая строка");
        }

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




