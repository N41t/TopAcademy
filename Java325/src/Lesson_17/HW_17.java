package Lesson_17;

import java.util.Arrays;

public class HW_17 {
   public static char[] arr = new char[]{};



    public static void main(String[] args) throws Exception {

        //1. ���������� ������ ������ �� ���������� �������
        System.out.println("1) CharAt: ");
        System.out.println(charAt("������", 5));
        //Test Exception:
        //System.out.println(charAt("", 100));
        System.out.println();


        //2. ���������� true ���� str == arr �� ��������
        System.out.println("2) Equals: ");
        System.out.println(equals("������", "������"));
        System.out.println(equals("������", "������ ���"));
        System.out.println();

        //3. ���������� string ��� ������� � ������ ��������
        //Exception �� �����
        System.out.println("3) ToLowerCase: ");
        System.out.println(toLowerCase("PrIvET"));
//        System.out.println(toLowerCase("������"));
        System.out.println();

        //4. ���������� string ��� ������� � ������� ��������
        //Exception �� �����
        System.out.println("4) ToUpperCase: ");
        System.out.println(toUpperCase("prIvET"));
        System.out.println();


        //5. ���������� index ������� ��������� � ��������� ������ -1
        //Exception �� �����
        System.out.println("5) IndexOf: ");
        System.out.println(indexOf("Goodbye", 'o'));
        System.out.println(indexOf("Goodbye", "d"));
        //�������� Exception
        //System.out.println(indexOf("goodbye", "u"));
        System.out.println();

        //6. ���������� index ������� ��������� ������� � fromIndex � ��������� ������ -1
        System.out.println("6) IndexOfChar: ");
        System.out.println(indexOfChar("Goodbye", 'o', 0)); //1
        System.out.println(indexOfChar("Goodbye", 'o',2)); //2
        //Exception test:
        //System.out.println(indexOfChar("Goodbye", 'o', 100));
        System.out.println();

        //7. ���������� index ������� ��������� c ����� � ��������� ������ -1
        System.out.println("7) LastIndexOf: ");
        System.out.println(lastIndexOf("Goodbye", 'o')); //2
        System.out.println(lastIndexOf("Goodbye", "o")); //2
        System.out.println();

        //8. ���������� string, ������ ������� ����� � ������
        System.out.println("8) Trim: ");
        System.out.println(trim("  ������  "));
        //�������� exception
        //System.out.println(trim(""));
        System.out.println();

        //9. ���������� true ���� ������ ���������� �� str � 12) ��������� ������ false
        System.out.println("9) StartsWith: ");
        System.out.println(startsWith("������", "���"));
        System.out.println(startsWith("������", "���"));
        System.out.println();

        //10. ���������� true ���� ������ ������������� �� str � ��������� ������ false
        System.out.println("10) EndsWith: ");
        System.out.println(endsWith("������", "���"));
        System.out.println(endsWith("������", "����"));
        System.out.println();

        //11. ���������� ������ ��������
        System.out.println("11) EqualsIgnoreCase: ");
        System.out.println(equalsIgnoreCase("PrIVet", "Privet"));
        System.out.println();

    }


//���������� ������ ������ �� ���������� index-�
    public static char charAt(String str, int index) throws Exception{

        char[] arrChar = str.toCharArray();

        if (str == "") {
            throw new NullPointerException("����������� ������ �����!");
        }

        if (str == null) {
            throw new ClassCastException("�� ����� �� ������");
        }

        if (index > arrChar.length-1) {
            throw new ArrayIndexOutOfBoundsException("������ ������, ������� ������� �� ������� ������");
        }


        char value = 0;
        for (int i = 0; i < arrChar.length; i++) {
            if (i == index) {
                value = arrChar[i];
            }
        }
        return value;
    }


//���������� true ���� str == arr �� ��������
//Exception �� �����
    public static boolean equals(String str1, String str2) {

        if (str1 == "" || str2 == "") {
            throw new NullPointerException("����������� ������ �����");
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

    //���������� string ��� ������� � ������ ��������
    //Exception �� ���������
    public static String toLowerCase(String str) {


        if (str == "") {
            throw new NullPointerException("����������� ������ �����");
        }

        char[] arrStr = str.toCharArray();
        for(int i = 0; i < arrStr.length; i++) {

            if (arrStr[i] > 64 && arrStr[i] < 91) {
                arrStr[i] = (char) (arrStr[i] + 32);
            }

//            if (arrStr[i] > 193 && arrStr[i] < 224) { //��� ���������
//                arrStr[i] = (char) (arrStr[i] + 32);
//            }
        }

        String answer = new String(arrStr);
        return answer;
    }

    //���������� string ��� ������� � ������� ��������
    //Exception �� ���������
    public static String toUpperCase(String str) {

        if (str == "") {
            throw new NullPointerException("����������� ������ �����");
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

    //���������� index ������� ��������� � ��������� ������ -1
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
            throw new Exception("������ ��� �� ������");
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
            throw new Exception("������ ��� �� ������");
        }
        return index;
    }

    //���������� index ������� ��������� ������� � fromIndex � ��������� ������ -1
    public static int indexOfChar(String str, char c, int fromIndex) throws Exception {
        int index = 0;
        char[] arrStr = str.toCharArray();

        if (fromIndex > arrStr.length-1) {
            throw new ArrayIndexOutOfBoundsException("������ ������, ������� ������� �� ������� ������");
        }

        for (int i = fromIndex; i < arrStr.length; i++) {
            if (arrStr[i] == c) {
                index = i;
                break;
            }
        }

        if (index == 0) {
            throw new Exception("������ ��� �� ������");
        }

        return index;
    }


    //���������� index ������� ��������� c ����� � ��������� ������ -1
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
            throw new Exception("������ ��� �� ������");
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
            throw new Exception("������ ��� �� ������");
        }

        return index;
    }

    //���������� string ������ ������� ����� � ������
    public static String trim(String str) {
        int countRight = 0;
        int countLeft = 0;
        char[] arrStr = str.toCharArray();

        if (str.isEmpty()) {
            throw new NullPointerException("����������� ������ �����");
        }

        //�������� ���-�� �������� �����
        for (int i = arrStr.length-1; i > 0; i--) {
            if (arrStr[i] == ' ') {
                countRight++;
            } else if (arrStr[i] != ' ') {
                break;
            }
        }


        //�������� ���-�� �������� ������
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

   // ���������� true ���� ������ ����������� �� str � ��������� ������ false
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

    //���������� true ���� ������ �������������� �� str � ��������� ������ false
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

    //���������� true ���� ������ ����� str �� �������� �������
    public static boolean equalsIgnoreCase(String str1, String str2) {

        if (str1 == "" || str2 == "") {
            throw new NullPointerException("������� ������ ������");
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




