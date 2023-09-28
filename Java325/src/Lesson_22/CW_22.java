package Lesson_22;


//Инкапсуляция (парадигма ООП)
//int min = 2
//int max = 10
//Random random = new Random()
//int limit = random.nextInt(max - min + 1) - формула диапазона. Чтобы рандом был не от 0 - 10, а от 2 - 10 например

//return можно использовать в void методе в качестве break
public class CW_22 {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 27;
        person.name = "Paul";
        person.getName();

        Person person2 = new Person(30, "Jake");
    }
}

class Person {
    String name;
    int age;
    private String phone;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Person() {

    }

    public String getName() {
        return this.name;
    }
}
