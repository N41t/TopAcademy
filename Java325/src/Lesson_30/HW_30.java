package Lesson_30;

import java.util.*;

public class HW_30 {

    //Dictionary
    public static Map<String, Map<String,String>> dictionary = new TreeMap<>();


    public static void main(String[] args) {

        dictionary.put("en", new TreeMap<>());
        dictionary.get("en").put("�ar", "������");
        dictionary.get("en").put("house", "���");
        dictionary.get("en").put("cat", "�����");
        dictionary.get("en").put("dog", "������");
        dictionary.get("en").put("earth", "�����");
        dictionary.get("en").put("ground", "�����");


        dictionary.put("ru", new TreeMap<>());
        dictionary.get("ru").put("������", "car");
        dictionary.get("ru").put("���", "house");
        dictionary.get("ru").put("�����", "cat");
        dictionary.get("ru").put("������", "dog");
        dictionary.get("ru").put("�����", "earth");
        dictionary.get("ru").put("�����", "ground");


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n------------------Dictionary------------------");
            System.out.println("Select input language: 1)En, 2)Ru");
            System.out.print("Input: ");

            String lang = scanner.nextLine();
            if (lang.equals("1") || lang.equals("2")){
                System.out.println("Input searching word");
                System.out.print("Input: ");
                String word = scanner.nextLine().toLowerCase();
                searchWord(word, lang, dictionary);//����� ��� ������

            } else {
                System.out.println("Mismatch. Input only 1 or 2");
            }
        }



    }

    //Method for searching word into dictionary
    public static void searchWord(String word, String lang, Map<String, Map<String,String>> dictionary) {
        //���������� ����� �� ����� ���� �� ����� ����� � ����������� �� ���� ����� ���� ������

        if (lang.equals("1")) {
            if (dictionary.get("en").containsKey(word)) {
                System.out.println("English: " + word + " -> Russian: " + dictionary.get("en").get(word));
            } else {
                System.out.println("Word was not found in the dictionary");
            }
        } else if (lang.equals("2")) {
            if (dictionary.get("ru").containsKey(word)) {
                System.out.println("Russian: " + word + " -> English: " + dictionary.get("ru").get(word));
            } else {
                System.out.println("Word was not found in the dictionary");
            }
        } else {
            System.out.println("Mismatch. Input only 1 or 2");
        }
    }
}
