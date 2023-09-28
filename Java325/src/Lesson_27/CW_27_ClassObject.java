package Lesson_27;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Это " + this.name + " " + this.age;
    }
}

public class CW_27_ClassObject {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Person p = new Person("Farid", 27);
        Person p2 = new Person("Farid", 27);
        Person p3 = new Person("Oleg", 30);
        System.out.println(p);

        System.out.println("Хэш 1 объекта " + p.hashCode());
        System.out.println("Хэш 2 объекта " + p2.hashCode());
        System.out.println("Хэш 3 объекта " + p3.hashCode());

        //Чтобы сверял не ссылки а по значению, нужно переопределить equals() и hashcode()
        if (p==p2) {
            System.out.println("Ravni");
        } else {
            System.out.println("Raznie");
        }

        if (p.equals(p2)) {
            System.out.println("Ravni");
        } else {
            System.out.println("Raznie");
        }

    }
}
