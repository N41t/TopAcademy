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


//� stream ������� ��� ������ String
public class CW_33_StreamAPI {
    public static void main(String[] args) {


        ///////////////////////////////////////////////////////////////////////////////////////
        //����������� � stream
        ///////////////////////////////////////////////////////////////////////////////////////

        //1 �������� ������ �� ��������
//        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3", "a4", "a5", "a6");
//        System.out.println(streamFromValues.collect(Collectors.toList()));
//
//        //2 �������� ������ �� �������
//        String[] array = {"1", "2", "3", "4"};
//        Stream<String> streamFromArray = Arrays.stream(array); //stream ������ ���� ���������� ����
//        System.out.println(streamFromArray.collect(Collectors.toList()));
//
//        //3 �������� ������ �� �����
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        Stream<String> streamFromList = list.stream();
//        System.out.println(streamFromList.collect(Collectors.toList()));

        //4 �������� ������ �� file
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

//        //5 �������� ������ �� ������
//        IntStream streamFromString = "123abc".chars(); //������� �������
//        streamFromString.forEach(e -> System.out.print(e + " ")); //���������� ������ ������ � ���� ����� (��� ������)

        //6 �������� ������ �� builder
//        Stream.Builder<String> builder = Stream.builder();
//        Stream<String> streamFromBuilder = builder.add("1").add("2").add("3").add("4").build();
//        System.out.println(streamFromBuilder.collect(Collectors.toList()));

        //7 ����������� �����
//        Stream<Integer> streamFromIterate = Stream.iterate(10, n -> n * 2);
//        System.out.println(streamFromIterate.limit(20).collect(Collectors.toList()));

        ///////////////////////////////////////////////////////////////////////////////////////
        //����������� ������ (���������� ��� stream)
        ///////////////////////////////////////////////////////////////////////////////////////

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        //filter
//        List<Integer> results = list.stream().filter(n->n>3).collect(Collectors.toList()); //����� �������� ������ ��, ��� ������ 3
//        //List<Integer> results = list.stream().filter(n->n%2==0).collect(Collectors.toList()); //������ ������ �����
//        System.out.println(results);

//        List<String> list = new ArrayList<>();
//        list.add("1Farid");
//        list.add("2Oleg");
//        list.add("3Masha");
//        list.add("4Dasha");
//        list.add("5Lena");
//
//        List<String> results = list.stream().filter(n -> n.endsWith("sha") & n.contains("a")).collect(Collectors.toList()); //����� ������������� �� sha � ����� ������ ��������� ����� a
//        System.out.println(results);

//        List<Person> list = new ArrayList<>();
//        list.add(new Person("Farid", "123123312"));
//        list.add(new Person("Masha", "123123"));
//        list.add(new Person("Dasha", "1231231231323"));
//        list.add(new Person("Gosha", "123123"));
//
//
//        List<Person> results = list.stream().filter(n -> n.phone.length()>9 && !n.phone.contains("33")).collect(Collectors.toList()); //������ 9 �������� � �� �������� 33
//        //List<Person> results = list.stream().filter(n->n.name.toLowerCase().startsWith("d")).collect(Collectors.toList()); //��� ���������� �� d
//        System.out.println(results);


        List<Person> list = new ArrayList<>();
        list.add(new Person("Farid", "8956748391"));
        list.add(new Person("Masha", "7894578621"));
        list.add(new Person("Dasha", "98334578291"));
        list.add(new Person("Gosha", "4809890102"));
        list.add(new Person("Masha", "7894578621"));
        list.add(new Person("Dasha", "98334578291"));

//        List<Person> results = list.stream().skip(2).collect(Collectors.toList()); //skip ���������� ��������
//        List<Person> results = list.stream().distinct().collect(Collectors.toList());//������� ������������� (�������� ��� �����, ��� �������� ����� �������������� equals)
//        List<Person> results = list.stream().map(s->s+"+7").collect(Collectors.toList());//���� �� ���� ��������� ����� ��� �� �������� ���������� (�������� +7) (�������� � string, � �� ������)

        //map - ������� ��������, peek - �� �� �����, �� �� ������� ��������
//        list.stream().peek(s-> System.out.println(s)).collect(Collectors.toList());

//        System.out.println(results);

        // System.out.println(Stream.of(1,7,2,3,4,5,6).sorted().collect(Collectors.toList())); //���������� ������������ ��������
//         System.out.println(Stream.of(1,7,2,3,4,5,6).sorted((n1,n2)-> n2.compareTo(n1)).collect(Collectors.toList())); //���������� ������������ ��������. !�� ������ ���������� � ����������

        //������� ������ StreamAPI
//        list.stream()
//                .sorted((x,y)->y.name.compareTo(x.name))
//                .skip(1)
//                .limit(5)
//                .distinct()
//                .peek(x-> System.out.println(x));

        //mapToInt, mapToDouble, mapToLong
//        Stream<String> stream = Stream.of("a1","a2","a3","a4");
//        int[] resulted = stream.mapToInt(s->Integer.parseInt(s.substring(1))).toArray(); //������� - ����������� �� ������ ���� � ������. substring - ����� ������� �� ������� 1 �� ������ � �������
//        System.out.println(Arrays.toString(resulted));

        //flatMap, flatMapInt, flatMapDouble, flatMapLong
//        List<String> list1 = Stream.of("a,b,c,d","Farid", "Sawa")
//                .flatMap(s->Arrays.stream(s.split(",")))
//                .collect(Collectors.toList()); //������� �� ������ �������, ����� �������
//
//        list1.forEach(s-> System.out.println(s));
//        System.out.println("Size : " + list.size());

        //�������� ��������� ��� StreamAPI v
        String str = "Farid, Oleg, Sawa";
        String[] arr = str.split(",");
        List<String> result = Arrays.asList(arr);
        System.out.println(result.get(1));


        ///////////////////////////////////////////////////////////////////////////////////////
        //������������ ������
        ///////////////////////////////////////////////////////////////////////////////////////

        System.out.println("-------------������������ ������-------------------");
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
//        int result1 = Stream.of(1,2,3,4,5,6).filter(x->x%2==0).findAny().orElse(-1); //�� ������� ������ �������, �� �� ����� ��� ����, �������� ����� ������������ ��������� �������

        //collect
//        System.out.println(Stream.of("a1","a2","a3").collect(Collectors.toList()));

        //count
//        System.out.println(Stream.of(1,2,3,4,5,6).filter(x->x%2==0).count()); //������������ ������� ����� �������� ��� �������� �������

        //anyMatch, noneMatch, allMatch -> true/false
//        System.out.println(list.stream().anyMatch(x->x.name.contains("ri"))); //�������� �� ���� ���� ������� ��� "ri"?
//        System.out.println(list.stream().noneMatch(x->x.name.contains("ri"))); //����� �� �������� ��� "ri"
//        System.out.println(list.stream().allMatch(x->x.name.contains("ri"))); //��� �������� ��� "ri"

        //MAX, MIN
//        System.out.println(list.stream().max((x,y)->x.date.getYear()-y.date.getYear())); //������� ������ ��������
//        System.out.println(list.stream().min((x,y)->x.date.getYear()-y.date.getYear())); //������� ������ ��������
//        System.out.println("Max : " + Stream.of(1,2,3,4,5,6,7,8,9).max(Integer::compareTo).get()); //.get - ������ ��� ���������� optional
//        System.out.println("Min : " + Stream.of(1,2,3,4,5,6,7,8,9).min(Integer::compareTo).get()); //.get - ������ ��� ���������� optional
//          System.out.println("Max : " + Stream.of("a1","a2","a3","a4","a5","a6").max(String::compareTo).get()); //�� �������� max/min ���� ��������
//          System.out.println("Max: " + Stream.of("������ ��� ����", "��� ������� ������� �������", "��� ���������� � ������ ������")
//                  .max((x,y)->x.split(" ").length-y.split(" ").length).get()); //���� ����� ��������� �� ���������� �������� � ������

        //forEach, forEachOrdered
//        Stream<Integer> stream = Stream.iterate(1, n->n+1); //c 1 ������ ������. �� 1
////        stream.limit(10).forEach(System.out::println);
//        stream.limit(10).parallel().forEach(System.out::println); //����� �������� ������ ��� ������� � ����. ���������� ����� �������. ���������� ���������� �����, ��� ������(��� ������������)
//        stream.limit(10).parallel().forEachOrdered(System.out::println); //���� �����, ��� ����������, �� ��� ����� �����������

        //toArray
//        Object[] arr1 = Stream.of("a1", "a2", "a3").toArray();
//        System.out.println(Arrays.toString(arr1));

        //reduce
//        System.out.println(Stream.of(1,2,3,4,5,6,7,8,9).reduce((n1,n2)->n1+n2).get()); //���������� ��������������� ������ ��������. Reduce - ��������� � ����� ���������� ��������� ������


        //(������ ��� ��������� stream)
        //sum
        List<String> newList = new ArrayList<>();
        newList.add("1");
        newList.add("2");
        newList.add("3");
        newList.add("4");
        newList.add("5");
        System.out.println("Sum : " + newList.stream().mapToInt(Integer::parseInt).sum());

        //avg(������� ��������)
        System.out.println("Avg : " + newList.stream().mapToInt(Integer::parseInt).average().getAsDouble());

        /*
              1) ���� ��������� ����� {"a1","a2","a3","a2","a2","a5","a1"} ������� ���-�� ��������� ������� "a1" � ������� streamApi
              2) ����� ������� � ��������� ������ "a3" ��� ������� "������"
              3) ������� ��������� ������� ��������� ��� "empty" ���� ��������� �����
              4) ������� ��� �������� ������� �� ������� �������� ���������
              5) �� ��������� ���� ������ ��� ���������� � ����� ������� ����� ����
              6) ������������� ��������� ����� �� �������� � ������ ���������
              7) ������� ����� �������� ����� ��� 0
         */


    }
}

class Person {
    String name;
    String phone;
    LocalDate date; //���� ����� ����, �� ����� localtime (����� ������������ ����� ��������). ���� ���������� � ������


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
