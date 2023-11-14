package Lesson_31.Terminal;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String absolutePath = "D:\\Program Files\\JAVA\\LearnJava\\ClassWork\\Java325\\Java325\\src\\Lesson_31\\Terminal\\";
    public static void main(String[] args) throws IOException {

        while (true) {
           // System.out.println("Absolute path now: " + absolutePath);
            System.out.println("1 - Create folder\n" +
                               "2 - Create file\n" +
                               "3 - Update folder\n" +
                               "4 - Update file\n" +
                               "5 - Delete folder\n" +
                               "6 - Delete file\n" +
                               "7 - Create xml\n" +
                               "8 - Exit");

            while (true) {

                System.out.print("Input: ");
                int input = scanner.nextInt();
                if (input == 1) {
                    createFolder();
                    break;
                } else if (input == 2){
                    createFile();
                    break;
                } else if (input == 3){
                    updateFolder();
                    break;
                } else if (input == 4){
                    updateFile();
                    break;
                } else if (input == 5){
                    deleteFolder();
                    break;
                } else if (input == 6){
                    deleteFile();
                    break;
                } else if (input == 7){
                    createXml();
                    break;
                } else if (input == 8){
                    System.exit(1);
                } else {
                    System.out.println("Invalid input, try again");
                }
            }
        }



    }

    //ћетод дл€ создани€ папки
    public static void createFolder() {
        System.out.print("Input name folder: ");
        String nameFolder = scanner.next();


        File folder = new File(absolutePath + nameFolder);

        if (folder.exists() && folder.isDirectory()) {
            System.out.println("Folder has been created " + folder.getAbsolutePath() + "\n");
        } else {
            folder.mkdirs();
            System.out.println("Folder was created successfully\n");
        }

    }

    //ћетод дл€ создани€ файла
    public static void createFile() throws IOException {

        System.out.print("Input name file: ");
        String nameFile = scanner.next();

        File file = new File(absolutePath + "/" + nameFile);

        if (file.exists() && file.isFile()) {
            System.out.println("File has been created " + file.getAbsolutePath() + "\n");
        } else {
            file.createNewFile();
            System.out.println("File was created successfully\n");
        }
    }


    public static void printTom(String path, int count) {
        File file = new File(path);

        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();

            if (file!=null) {
                for (File f:files) {
                    if (f.isDirectory() && !f.isHidden()) {
                        for (int i = 0; i < count; i++) {
                            System.out.print("--------");
                        }
                        System.out.println(f.getName());
                        printTom(f.getAbsolutePath(), count+1);
                    }

                }
            }
        }
    }



    public static void updateFolder() {
        //показываютс€ имена всех папок по пути Terminal и их дочерние папки
        System.out.println("\nFolders: ");
        printTom(absolutePath, 0);
        System.out.println("\n");

        System.out.print("Input path to folder you want to change: ");
        String pathFolder = scanner.next();

        File folder = new File(absolutePath + pathFolder);

        if (!folder.exists() && folder.isDirectory()) {
            System.out.println("Folder does not exist " + folder.getAbsolutePath() + "\n");
        } else {
            System.out.print("Input new path folder name: ");
            String newPathFolder = scanner.next();
            File newFolder =  new File(absolutePath + newPathFolder);
            folder.renameTo(newFolder);
            System.out.println("Folder was updated\n");
        }
    }

    public static void updateFile() {
        System.out.println("\nFiles: ");
        printTom(absolutePath, 0);
        System.out.println("\n");

        System.out.print("Input path to file you want to change: ");
        String pathFile = scanner.next();

        File file = new File(absolutePath + pathFile);

        if (!file.exists() && file.isFile()) {
            System.out.println("File does not exist " + file.getAbsolutePath() + "\n");
        } else {
            System.out.print("Input new path file name: ");
            String newPathFile = scanner.next();
            File newFile = new File(absolutePath + newPathFile);
            file.renameTo(newFile);
            System.out.println("File was updated\n");
        }
    }

    public static void deleteFolder() {
        //показываютс€ имена всех папок по пути Terminal и их дочерние папки
        System.out.println("\nFolders: ");
        printTom(absolutePath, 0);
        System.out.println("\n");

        System.out.print("Input path to folder: ");
        String pathFolder = scanner.next();

        File folder = new File(absolutePath + pathFolder);

        if (!folder.exists() && folder.isDirectory()) {
            System.out.println("Folder does not exist " + folder.getAbsolutePath() + "\n");
        } else {
            folder.delete();
            System.out.println("Folder was deleted\n");
        }
    }

    public static void deleteFile() {
        System.out.println("\nFiles: ");
        printTom(absolutePath, 0);
        System.out.println("\n");

        System.out.print("Input path to file: ");
        String pathFile = scanner.next();

        File file = new File(absolutePath + pathFile);

        if (!file.exists() && file.isFile()) {
            System.out.println("File does not exist " + file.getAbsolutePath() + "\n");
        } else {
            file.delete();
            System.out.println("File was deleted\n");
        }

    }

    public static void createXml() {


            while (true) {
                System.out.print("¬ведите название xml-файла: ");
                String nameXml = scanner.next();

                File file = new File(nameXml + ".xml");

                if (file.exists()) {
                    System.out.println("—мените им€. ‘айл с таким именем уже был создан");
                } else {
                    try {
                    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder builder = factory.newDocumentBuilder();
                    Document document = builder.newDocument();

                    System.out.print("¬ведите название root элемента: ");
                    String nameRoot = scanner.next();
                    Element rootElement = document.createElement(nameRoot);
                    document.appendChild(rootElement);

                    System.out.print("¬ведите название списка: ");
                    String nameElement = scanner.next();
                    Element staff = document.createElement(nameElement);
                    rootElement.appendChild(staff);

                    Attr attr = document.createAttribute("id");
                    attr.setValue("1");
                    staff.setAttributeNode(attr);

                    Element firstname = document.createElement("firstname");
                    System.out.print("¬ведите им€: ");
                    String nameEmpl = scanner.next();
                    firstname.appendChild(document.createTextNode(nameEmpl));
                    staff.appendChild(firstname);

                    Element lastname = document.createElement("lastname");
                    System.out.print("¬ведите фамилию: ");
                    String lastnameEmpl = scanner.next();
                    lastname.appendChild(document.createTextNode(lastnameEmpl));
                    staff.appendChild(lastname);

                    Element salary = document.createElement("salary");


                    System.out.print("¬ведите зарплату: ");
                    String salaryEmpl = scanner.next();

                    salary.appendChild(document.createTextNode(salaryEmpl));
                    staff.appendChild(salary);



                    //ƒл€ генерации объекта
                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    DOMSource domSource = new DOMSource(document);

                    StreamResult streamResult = new StreamResult(file);

                    transformer.transform(domSource, streamResult); //наш файл генерирует в streamResult

                    System.out.println("‘айл xml успешно создан");
                    break;


                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                }
            }


    }

    public static void builderForXml() {

    }
}
