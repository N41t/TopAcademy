package Lesson_31;

import java.io.*;

public class CW_32_File {

    //метод показывает все папки по прописанному пути
    public static void printTom(String path, int count) {
        File file = new File(path);

        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();

            if (file!=null) {
                for (File f:files) {
                    if (f.isDirectory() && !f.isHidden()) {
                        for (int i = 0; i < count; i++) {
                            System.out.print("-");
                        }
                        System.out.println(f.getName() + " ( " + f.listFiles().length + " )" + f.getUsableSpace()/1024);
                        printTom(f.getAbsolutePath(), count+2);
                    }

                }
            }
        }
    }

    public static void main(String[] args) throws IOException {


//        try {
//            File folder = new File("NewPapka");
//            if (!folder.exists()) {
//                folder.mkdir();
//            }
//
//            if (folder.isDirectory()) {
//                File file = new File(folder.getAbsolutePath() + "/NewFile.txt");
//
//                if (!file.exists())
//                    file.createNewFile();
//
//
//                //получение всех файлов из папки
//                File[] files = folder.listFiles();
//
//                for (File f:files) {
//                    if (f.isDirectory()) {
//                        System.out.println(f.getName() + " is folder");
//                    } else if (f.isFile()) {
//                        System.out.println(f.getName() + " is file");
//                    }
//                }
//
//            }
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        // -----------------------------------------------------------------------------------------------

        //printTom("D:\\", 0);

        // -----------------------------------------------------------------------------------------------

//        File file = new File("test.txt");
//        file.createNewFile();
//
//        FileWriter fileWriter = new FileWriter(file); //file - куда идет запись
//        fileWriter.write("Text1\n");
//        fileWriter.write("Text2\n");
//        fileWriter.write("Text3\n");
//        fileWriter.flush(); // очистка буфера (чтобы не било по памяти и скорости)
//        fileWriter.close(); // закрыть поток
//
//        FileReader fileReader = new FileReader(file);
//        char[] text = new char[50];
//
//        while (fileReader.read(text)!=-1) {
//            String str = new String(text);
//            System.out.println(str);
//            text = new char[40];
//        }
//
//        fileReader.close();

        // -----------------------------------------------------------------------------------------------
        //парсинг из xml

        //загрузка и добавление данных из бинарного файла
        try {
            File file = new File("save.sv"); //бинарный файл, человек его не прочитает
            file.createNewFile();

            Student student = new Student("Mikhail", "Belozerov", 25), restore;

            FileOutputStream fileOutputStream = new FileOutputStream(file);

            try (ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) { //сам закроет
                outputStream.writeObject(student);
                outputStream.flush();
            }

            FileInputStream fileInputStream = new FileInputStream(file);
            try (ObjectInputStream inputStream = new ObjectInputStream(fileInputStream)) {
                restore = (Student) inputStream.readObject();
            }

            System.out.println(student);
            System.out.println(restore);
        } catch (Exception e) {
            e.getMessage();
        }



    }
}

class Student implements Serializable{
    private String firstname;
    private String lastname;
    private int age;

    public Student() {

    }

    public Student(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
