package Lesson_33;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


//в stream имеются все методы String
public class CW_33_StreamAPI {
    public static void main(String[] args) {


        ///////////////////////////////////////////////////////////////////////////////////////
        //Конвертация в stream
        ///////////////////////////////////////////////////////////////////////////////////////

        //1 Создание стрима из значения
//        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3", "a4", "a5", "a6");
//        System.out.println(streamFromValues.collect(Collectors.toList()));
//
//        //2 Создание стрима из массива
//        String[] array = {"1", "2", "3", "4"};
//        Stream<String> streamFromArray = Arrays.stream(array); //stream должен быть ссылочного типа
//        System.out.println(streamFromArray.collect(Collectors.toList()));
//
//        //3 Создание стрима из листа
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        Stream<String> streamFromList = list.stream();
//        System.out.println(streamFromList.collect(Collectors.toList()));

        //4 Создание стрима из file
//        File file = new File("data.txt");
//        file.deleteOnExit();
//
//            try {
//                PrintWriter writer = new PrintWriter(file);
//                writer.println("1");
//                writer.println("2");
//                writer.println("3");
//                writer.println("4");
//                writer.close();
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//
//        try {
//            Stream<String> streamFromFile = Files.lines(Paths.get(file.getAbsolutePath()));
//            System.out.println(streamFromFile.collect(Collectors.toList()));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        //5 Создание стрима из строки
//        IntStream streamFromString = "123abc".chars(); //вернуть символы
//        streamFromString.forEach(e -> System.out.print(e + " ")); //представит каждый символ в виде числа (его номера)

        //6 Создание стрима из builder
//        Stream.Builder<String> builder = Stream.builder();
//        Stream<String> streamFromBuilder = builder.add("1").add("2").add("3").add("4").build();
//        System.out.println(streamFromBuilder.collect(Collectors.toList()));

        //7 Бесконечный стрим
//        Stream<Integer> streamFromIterate = Stream.iterate(10, n -> n * 2);
//        System.out.println(streamFromIterate.limit(20).collect(Collectors.toList()));

        ///////////////////////////////////////////////////////////////////////////////////////
        //Конвейерные методы (возвращают сам stream)
        ///////////////////////////////////////////////////////////////////////////////////////

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        //filter
//        List<Integer> results = list.stream().filter(n->n>3).collect(Collectors.toList()); //будет печатать только то, что больше 3
//        //List<Integer> results = list.stream().filter(n->n%2==0).collect(Collectors.toList()); //только четные числа
//        System.out.println(results);

//        List<String> list = new ArrayList<>();
//        list.add("1Farid");
//        list.add("2Oleg");
//        list.add("3Masha");
//        list.add("4Dasha");
//        list.add("5Lena");
//
//        List<String> results = list.stream().filter(n -> n.endsWith("sha") & n.contains("a")).collect(Collectors.toList()); //слова заканчивающие на sha и слово должно содержать букву a
//        System.out.println(results);

//        List<Person> list = new ArrayList<>();
//        list.add(new Person("Farid", "123123312"));
//        list.add(new Person("Masha", "123123"));
//        list.add(new Person("Dasha", "1231231231323"));
//        list.add(new Person("Gosha", "123123"));
//
//
//        List<Person> results = list.stream().filter(n -> n.phone.length()>9 && !n.phone.contains("33")).collect(Collectors.toList()); //больше 9 символов и не содержит 33
//        //List<Person> results = list.stream().filter(n->n.name.toLowerCase().startsWith("d")).collect(Collectors.toList()); //имя начинается на d
//        System.out.println(results);


        List<Person> list = new ArrayList<>();
        list.add(new Person("Farid", "8956748391"));
        list.add(new Person("Masha", "7894578621"));
        list.add(new Person("Dasha", "98334578291"));
        list.add(new Person("Gosha", "4809890102"));
        list.add(new Person("Masha", "7894578621"));
        list.add(new Person("Dasha", "98334578291"));

//        List<Person> results = list.stream().skip(2).collect(Collectors.toList()); //skip пропускает значения
//        List<Person> results = list.stream().distinct().collect(Collectors.toList());//удалить повторяющиеся (работает дял строк, для объектов нужно переопределить equals)
//        List<Person> results = list.stream().map(s->s+"+7").collect(Collectors.toList());//если ко всем телефонам нужно что то добавить однотипное (например +7) (подойдет к string, а не классу)

        //map - требует возврата, peek - то же самое, но не требует возврата
//        list.stream().peek(s-> System.out.println(s)).collect(Collectors.toList());

//        System.out.println(results);

        // System.out.println(Stream.of(1,7,2,3,4,5,6).sorted().collect(Collectors.toList())); //сортировка определенных значений
//         System.out.println(Stream.of(1,7,2,3,4,5,6).sorted((n1,n2)-> n2.compareTo(n1)).collect(Collectors.toList())); //сортировка определенных значений. !Не путать сортировку и фильтрацию

        //Принцип записи StreamAPI
//        list.stream()
//                .sorted((x,y)->y.name.compareTo(x.name))
//                .skip(1)
//                .limit(5)
//                .distinct()
//                .peek(x-> System.out.println(x));

        //mapToInt, mapToDouble, mapToLong
//        Stream<String> stream = Stream.of("a1","a2","a3","a4");
//        int[] resulted = stream.mapToInt(s->Integer.parseInt(s.substring(1))).toArray(); //парсинг - превращение из одного типа в другой. substring - берет элемент по индексу 1 из строки и убирает
//        System.out.println(Arrays.toString(resulted));

        //flatMap, flatMapInt, flatMapDouble, flatMapLong
//        List<String> list1 = Stream.of("a,b,c,d","Farid", "Sawa")
//                .flatMap(s->Arrays.stream(s.split(",")))
//                .collect(Collectors.toList()); //парсинг на каждый элемент, через запятую
//
//        list1.forEach(s-> System.out.println(s));
//        System.out.println("Size : " + list.size());

        //Разбивка элементов без StreamAPI v
        String str = "Farid, Oleg, Sawa";
        String[] arr = str.split(",");
        List<String> result = Arrays.asList(arr);
        System.out.println(result.get(1));


        ///////////////////////////////////////////////////////////////////////////////////////
        //Терминальные методы
        ///////////////////////////////////////////////////////////////////////////////////////

        System.out.println("-------------Терминальный методы-------------------");
//        List<Person> list2 = new ArrayList<>();
//        list2.add(new Person("Farid", "8956748391"));
//        list2.add(new Person("Masha", "7894578621"));
//        list2.add(new Person("Dasha", "98334578291"));
//        list2.add(new Person("Gosha", "4809890102"));
//        list2.add(new Person("Masha", "7894578621"));
//        list2.add(new Person("Dasha", "98334578291"));
//        list2.add(new Person("Marid", "98334578291"));
//        list2.add(new Person("Firit", "98334578291"));
//

//
//        //findFirst
//        Optional<Person> result1 = list.stream().skip(3).findFirst();
//
//        if (result1.isPresent()) {
//            System.out.println(result1.get());
//        } else {
//            System.out.println("not");
//        }

//        int result1 = Stream.of(1,2,3,4,5,6).filter(x->x%2==0).findFirst().orElse(-1);
//        System.out.println(result1);

        //findAny
//        int result1 = Stream.of(1,2,3,4,5,6).filter(x->x%2==0).findAny().orElse(-1); //по дефолту первый элемент, но он нужен для того, например когда используется несколько потоков

        //collect
//        System.out.println(Stream.of("a1","a2","a3").collect(Collectors.toList()));

        //count
//        System.out.println(Stream.of(1,2,3,4,5,6).filter(x->x%2==0).count()); //подсчитывает сколько чисел подходит под заданное условие

        //anyMatch, noneMatch, allMatch -> true/false
//        System.out.println(list.stream().anyMatch(x->x.name.contains("ri"))); //Подходит ли хоть один элемент под "ri"?
//        System.out.println(list.stream().noneMatch(x->x.name.contains("ri"))); //Никто не подходит под "ri"
//        System.out.println(list.stream().allMatch(x->x.name.contains("ri"))); //Все подходят под "ri"

        //MAX, MIN
//        System.out.println(list.stream().max((x,y)->x.date.getYear()-y.date.getYear())); //покажет самого старшего
//        System.out.println(list.stream().min((x,y)->x.date.getYear()-y.date.getYear())); //покажет самого младшего
//        System.out.println("Max : " + Stream.of(1,2,3,4,5,6,7,8,9).max(Integer::compareTo).get()); //.get - потому что возвращает optional
//        System.out.println("Min : " + Stream.of(1,2,3,4,5,6,7,8,9).min(Integer::compareTo).get()); //.get - потому что возвращает optional
//          System.out.println("Max : " + Stream.of("a1","a2","a3","a4","a5","a6").max(String::compareTo).get()); //Со строками max/min тоже работает
//          System.out.println("Max: " + Stream.of("Привет как дела", "Что сегодня делаешь вечером", "как упоительны в России вечера")
//                  .max((x,y)->x.split(" ").length-y.split(" ").length).get()); //если нужно разделить по количеству символов в строке

        //forEach, forEachOrdered
//        Stream<Integer> stream = Stream.iterate(1, n->n+1); //c 1 каждое увелич. на 1
////        stream.limit(10).forEach(System.out::println);
//        stream.limit(10).parallel().forEach(System.out::println); //будет отдавать первое что попадет в руки. Выполнение будет быстрее. Выполнение происходит сразу, как готово(для многопоточки)
//        stream.limit(10).parallel().forEachOrdered(System.out::println); //тоже самое, что предыдущее, но все равно отсортирует

        //toArray
//        Object[] arr1 = Stream.of("a1", "a2", "a3").toArray();
//        System.out.println(Arrays.toString(arr1));

        //reduce
//        System.out.println(Stream.of(1,2,3,4,5,6,7,8,9).reduce((n1,n2)->n1+n2).get()); //складывает последовательно каждое значение. Reduce - выполняет в цикле конкретную указанную задачу


        //(Методы для числового stream)
        //sum
        List<String> newList = new ArrayList<>();
        newList.add("1");
        newList.add("2");
        newList.add("3");
        newList.add("4");
        newList.add("5");
        System.out.println("Sum : " + newList.stream().mapToInt(Integer::parseInt).sum());

        //avg(среднее значение)
        System.out.println("Avg : " + newList.stream().mapToInt(Integer::parseInt).average().getAsDouble());

        /*
              1) Дана коллекция строк {"a1","a2","a3","a2","a2","a5","a1"} вернуть кол-во вхождений объекта "a1" с помощью streamApi
              2) Найти элемент в коллекции равный "a3" или вывести "ошибка"
              3) Вернуть последний элемент коллекции или "empty" если коллекция пуста
              4) Вернуть два элемента начиная со второго элемента коллекции
              5) Из коллекции имен убрать все повторения и найти среднюю длину имен
              6) Отсортировать коллекцию строк по убыванию и убрать дубликаты
              7) Вернуть сумму нечетных чисел или 0
         */


    }
}

class Person {
    String name;
    String phone;
    LocalDate date; //если нужна дата, то через localtime (фарид рассказывает после перерыва). Дату посмотреть у Фарида


    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(phone, person.phone) && Objects.equals(date, person.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, date);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
