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

        list1.removeIf(x->x%2==0); //удалит число если оно четное из листа. Predicate - это просто условие дл€ выполнени€ метода
        for (int i = 0; i < list1.size(); i++){
            System.out.print(list1.get(i) + ", ");
        }

        //For с л€мбдой
        list1.forEach(x->{
            System.out.println(x);
        });

        for(int val : list1){
            System.out.println(val);
        }

        List<String> list = new ArrayList<>();

        //Ћист класса
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

        System.out.println(deque.offer("Farid")); //добавление. true - если успешно добавлено. ѕосмотреть отличи€ add от offer
        System.out.println(deque.offer("Oleg"));
        System.out.println(deque.offer("Sawa"));

        deque.forEach(x->{
            System.out.println(x);
        });

        deque.push("Nacalo");//добавление в начало

        System.out.println("\n-----------------------SET---------------------");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Farid");
        hashSet.add("Farid"); //не даст дублировать(но нигде это не отобразитс€), но возвращает boolean
        System.out.println("Ќельз€ повтор€ть элементы : " + hashSet.add("Farid")); //так можно увидеть

        System.out.println("–азмер hashSet : " + hashSet.size());

        SortedSet<String> sortedSet = new TreeSet<>();

        System.out.println("\n-----------------------MAP---------------------");
        Map<String, String> map = new TreeMap<>();
        map.put("one", "odin");
        map.put("two", "dva");
        map.put("three", "tri");

        System.out.println("«начение под ключом one : " + map.get("one"));
        System.out.println(map.containsKey("one")); //проверка есть ли ключ
        System.out.println(map.containsValue("dva")); //проверка есть ли значение
        //map.clear();
        map.size();

        //—ловарь
        Map<String, Map<String,String>> slovar = new TreeMap<>();
        slovar.put("en", new TreeMap<>());
        slovar.get("en").put("one", "один");
        slovar.get("en").put("two", "два");

        slovar.put("ru", new TreeMap<>());
        slovar.get("ru").put("один", "one");
        slovar.get("ru").put("два", "two");

        String lang = "ru";
        String word = "два";

        System.out.println(slovar.get(lang).get(word));

        //”честь что слово может не быть
        //≈сли написал какую то ерунду, то тоже должна быть организована проверка
        //¬ыводим список раскладок, а пользователь вводит слово и выбирает раскладку на каком €зыке

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
