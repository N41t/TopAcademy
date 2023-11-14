package Lesson_31;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


//ToDo: должен создать 10 раз и удалить 10 раз. Разобраться с удалением
public class CW_31_FileWork {
    public static void main(String[] args) {


        //создание папки
//        try {
//            File file = new File("papka/papka2");
////            file.mkdir(); //проверка на сущ. папки внутри осуществляется
////        } catch (Exception e) {
////            System.out.println("Папка не создана");
////        }
//
//        //проверка существования папки
////        if (file.exists()) {
////            System.out.println("Est'");
////        } else {
////            file.mkdir();
////            System.out.println("papka bila sozadana");
////        }
//
//        //Проверка на папку или файл
//        if (file.isDirectory()) System.out.println("This is directory");
//        else System.out.println("This is file");


//        try {
//            File folder = new File("papka");
//
//            if (!folder.exists()) {
//                System.out.println("papka est");
//                System.out.println(folder.getAbsolutePath());
//            } else {
//                folder.mkdir();
//            }
//
//            File file = new File(folder.getAbsolutePath() + "/file.txt");
//
//            if (file.exists()) System.out.println("Takoy file est");
//            else {
//                file.createNewFile();
//                System.out.println("File uspesno bil dobavlen");
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter folder name: ");
        String folderName = scanner.nextLine();
        System.out.println("Enter file name: ");
        String fileName = scanner.nextLine();
        System.out.println("Enter count: ");
        Integer count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            addMethod(folderName+i, fileName+i);
            deleteMethod(folderName+i, fileName + i + ".txt");
        }


    }

    public static void addMethod(String folder, String file) {
        try {
            File folder1 = new File(folder);

            if (folder1.exists()) {
                System.out.println("papka est");
                System.out.println(folder1.getAbsolutePath());
            } else {
                folder1.mkdir();
            }

            File file1 = new File(folder1.getAbsolutePath() + "/"+file);

            if (file1.exists()) System.out.println("Takoy file est");
            else {
                file1.createNewFile();
                System.out.println("File uspesno bil dobavlen");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteMethod(String folderName, String fileName) {

        try {
            File folder = new File(folderName); //ссылка на путь
            if (folder.isDirectory()) {
                File file = new File(folder.getAbsolutePath() + "/" + fileName); //folder.getAbsolutePath(),fileName - можно так прописывать

                if (file.isFile()) {
                    System.out.println("Delete file : " + file.delete());
                }

                System.out.println("Delete folder : " + folder.delete());
            } else {
                System.out.println("Not deleted");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}


