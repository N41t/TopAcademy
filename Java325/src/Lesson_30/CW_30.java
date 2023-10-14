package Lesson_30;

import javax.crypto.spec.PSource;
import java.util.*;


//Colections
public class CW_30 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();


        System.out.println("-----------------------ARRAY LIST---------------------");

        boolean isAdd = list1.add(10);
        System.out.println("Is Add : " + isAdd);
        System.out.println("Size : " + list1.size());
        System.out.println("Get : " + list1.get(0));
        list1.clear();
        System.out.println("Clear : " + list1.size());
        list1.add(0);
        list1.add(10);
        list1.add(3);
        list1.add(45);
        System.out.println("Is empty : " + list1.isEmpty());
        System.out.println("Contains : " + list1.contains(10));

        list1.add(15);
        list1.add(18);
        list1.add(30);
        list1.addAll(list2);

        for (int i = 0; i < list1.size(); i++){
            System.out.print(list1.get(i) + ", ");
        }

        System.out.println();

        list1.removeAll(list1);
        System.out.println("RemoveAll : " + list1.isEmpty());

        list1.add(0, 2);
        list1.add(10);
        list1.add(13);
        list1.add(7);

        list1.removeIf(x->x%2==0); //������ ����� ���� ��� ������ �� �����. Predicate - ��� ������ ������� ��� ���������� ������
        for (int i = 0; i < list1.size(); i++){
            System.out.print(list1.get(i) + ", ");
        }

        //For � �������
        list1.forEach(x->{
            System.out.println(x);
        });

        for(int val : list1){
            System.out.println(val);
        }

        List<String> list = new ArrayList<>();

        //���� ������
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("Pavel", "Merkulov", 25);
        personList.add(person1);
        personList.add(new Person("Katya", "Vazhenina", 30));
        personList.forEach(x->{
            System.out.println(x.getName());
        });

        System.out.println("\n-----------------------QUEUE---------------------");
        //LIFO
        Deque<String> deque = new ArrayDeque<>();

        System.out.println(deque.offer("Farid")); //����������. true - ���� ������� ���������. ���������� ������� add �� offer
        System.out.println(deque.offer("Oleg"));
        System.out.println(deque.offer("Sawa"));

        deque.forEach(x->{
            System.out.println(x);
        });

        deque.push("Nacalo");//���������� � ������

        System.out.println("\n-----------------------SET---------------------");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Farid");
        hashSet.add("Farid"); //�� ���� �����������(�� ����� ��� �� �����������), �� ���������� boolean
        System.out.println("������ ��������� �������� : " + hashSet.add("Farid")); //��� ����� �������

        System.out.println("������ hashSet : " + hashSet.size());

        SortedSet<String> sortedSet = new TreeSet<>();

        System.out.println("\n-----------------------MAP---------------------");
        Map<String, String> map = new TreeMap<>();
        map.put("one", "odin");
        map.put("two", "dva");
        map.put("three", "tri");

        System.out.println("�������� ��� ������ one : " + map.get("one"));
        System.out.println(map.containsKey("one")); //�������� ���� �� ����
        System.out.println(map.containsValue("dva")); //�������� ���� �� ��������
        //map.clear();
        map.size();

        //�������
        Map<String, Map<String,String>> slovar = new TreeMap<>();
        slovar.put("en", new TreeMap<>());
        slovar.get("en").put("one", "����");
        slovar.get("en").put("two", "���");

        slovar.put("ru", new TreeMap<>());
        slovar.get("ru").put("����", "one");
        slovar.get("ru").put("���", "two");

        String lang = "ru";
        String word = "���";

        System.out.println(slovar.get(lang).get(word));

        //������ ��� ����� ����� �� ����
        //���� ������� ����� �� ������, �� ���� ������ ���� ������������ ��������
        //������� ������ ���������, � ������������ ������ ����� � �������� ��������� �� ����� �����

    }
}

class Person {
    String name;
    String lastname;
    int age;

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
