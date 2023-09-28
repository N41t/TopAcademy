package Lesson_16;


//Новая тема String
public class CW_16 {

    //из домашки. Через массив символов. Лучше все делать через for (кроме length)
    public static char[] arr1 = new char[0];

    public static void main(String[] args) {
//        String name = "Michael";
//        String name2 = new String(new char[]{'M', 'i', 'c', 'h', 'a', 'e', 'l'}); //String - массив символов
//        System.out.println(name);
//        System.out.println(name2);

        String name = "Michael"; //String - это уже объект, который внутри себя имеет ряд методов. String является неизменяемым

        //String является не изменяемым(immutable), при изменении постоянно создается новая строка в StringPool
        System.out.println("String: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("toLowerCase: " + name.toLowerCase());
        System.out.println("toUpperCase: " + name.toUpperCase());
        System.out.print("toCharArray: ");
        char[] arr = name.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nCharAt: " + name.charAt(0)); //отображает символ String по индексу
        System.out.println("IndexOf: " + name.indexOf('h')); //если нет индекса вернет -1, если правильный то 0
        //name.toLowerCase().indexOf('f') - чтобы было удобнее искать по нижнему регистру. Паттерн Builder позволяет через точку вызывать методы
        //Паттерн Builder работает также, как и структура String со ссылками
        System.out.println("IndexOf+,: " + name.indexOf("ic", 1)); //Перегруженные методы (Overload)


        String name2 = "Fqriaada"; //lastIndexOf - поиск справа налево
        System.out.println("\nindexOf: " + name2.indexOf('a', name2.indexOf('a')+1)); //нужно чтобы пропустил одну 'a' и вернул вторую
        System.out.println("startsWith: " + name2.startsWith("Fq"));
        System.out.println("endsWith: " + name2.endsWith("la"));

        String name3 = "Aqssksksksarid";
        char i = (char) (name3.charAt(0) + 32); //ASCII table - табл. символов (Из большой А сделали, маленькую a путем прибавления)
        System.out.println("\n"+i);

        String name4 = "  Michael   ";
        System.out.println("trim: "+name4.trim()); //удаляет пробелы слева и справа

        //name4.equalsIgnoreCase() - !!!если нужно найти слово сам проверяет и игнорирует Большие и маленькие буквы(сам проверяет)

        System.out.println(name4.codePointAt(0)); //????? по ASCII таблица

        System.out.println(name4.replace("M", "Z")); //меняет существующий символ, если не находит то не меняет

        String name5 = "Michael Michael Michael";
        System.out.println(name5.split(" ").length); //split - делит строку по тому, что указали
        //Например:
        String date = "21.01.1996";
        String[] arr1 = date.split("\\.");
        String day = arr1[0];
        String month = arr1[1];
        String year = arr1[2];

        System.out.println("day: " + day);
        System.out.println("month: " + month);
        System.out.println("year: " + year);


        String name6 = "21.01";
        name6 = name6.concat(".1996"); //объединяет две строки (name+=".1996" - тоже самое). Но работает быстрее чем +=
        System.out.println("\nconcat: " + name6);

        //Что лучше String или StringBuilder

        String value = "";

        for(int i1 = 0; i1 < 20; i1++){ //каждый раз создается новая строка
            value+=i1;
        }

        System.out.println("Так нельзя: " + value);

        //Как нужно
        StringBuilder stringBuilder = new StringBuilder(); //StringBuilder нужен только тогда когда много склеиваний происходит (генерация пароля)
        //генерируется пароль исходя из имени, адреса, возраста и другое - из данных склеивает пароль

        for(int i1 = 0; i1 < 20; i1++){ //Метод склеивает все за один раз (где уместен StringBuilder, а где нет)
            stringBuilder.append(i1);
        }

        System.out.println("Так нужно: " + stringBuilder);


        System.out.println(arr1.length);
    }

    public static int length() {
        return arr1.length;
    }

}
