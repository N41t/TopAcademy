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
        return "��� " + this.name + " " + this.age;
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

        System.out.println("��� 1 ������� " + p.hashCode());
        System.out.println("��� 2 ������� " + p2.hashCode());
        System.out.println("��� 3 ������� " + p3.hashCode());

        //����� ������ �� ������ � �� ��������, ����� �������������� equals() � hashcode()
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
