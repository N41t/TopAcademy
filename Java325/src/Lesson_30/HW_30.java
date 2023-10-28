package Lesson_30;

import java.util.*;

public class HW_30 {

    //Dictionary
    public static Map<String, Map<String,String>> dictionary = new TreeMap<>();


    public static void main(String[] args) {

        dictionary.put("en", new TreeMap<>());
        dictionary.get("en").put("сar", "машина");
        dictionary.get("en").put("house", "дом");
        dictionary.get("en").put("cat", "кошка");
        dictionary.get("en").put("dog", "собака");
        dictionary.get("en").put("earth", "Земля");
        dictionary.get("en").put("ground", "земля");


        dictionary.put("ru", new TreeMap<>());
        dictionary.get("ru").put("машина", "car");
        dictionary.get("ru").put("дом", "house");
        dictionary.get("ru").put("кошка", "cat");
        dictionary.get("ru").put("собака", "dog");
        dictionary.get("ru").put("Земля", "earth");
        dictionary.get("ru").put("земля", "ground");


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
                searchWord(word, lang, dictionary);//метод для поиска

            } else {
                System.out.println("Mismatch. Input only 1 or 2");
            }
        }



    }

    //Method for searching word into dictionary
    public static void searchWord(String word, String lang, Map<String, Map<String,String>> dictionary) {
        //Необходимо найти по ключу есть ли такое слово в зависимости от того какой язык выбран

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
