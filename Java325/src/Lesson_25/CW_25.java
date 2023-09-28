package Lesson_25;

import org.xml.sax.helpers.AttributesImpl;

public class CW_25 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //INNER CLASS
        //Motherboard.Bios bios = new Motherboard().Bios //������ ��� ���� ����� �� �������, ������ ����� �����
        Motherboard motherboard = new Motherboard();
        motherboard.bios = motherboard.createBios();

        //NASLEDOVANIE

        Student[] students = new Student[]{
                new Student(),
                new Student(),
                new Student()
        };

    }
}

//outer
class Motherboard {

    public Bios bios;

    public Bios createBios(){
        return new Bios();
    }

    //inner(������� ������ � ��� ������ ���� ��� �������� ������ ���������� �� ����������)

    class Bios {

    }
}

//nasledovanie
class Person {
    //����������� ������� protected - ��������� ������ ���� ������ ������ � � ������� ����������� + ���������� � ����� ������
    //����������� ������� default - �������� ������ � package. ������ package - ��� public
    protected String name;
    protected String lastname;
    protected int age;
}

class Student extends Person {
    double stipendia;
    public void test(){
        //����� ���� ������� ������ ��� ���������� � ������-�������� � ����������
        super.name = "1"; //super -> ��������� � �������� ������(�� �������� �����������)
        this.name = "2"; //this -> ��������� � ������ ������ (�� ���� � Student)
    }
}

class Teacher extends Person {
    double salary;
}

//�������������� ������������ ��� ��-�� ������������ ������������. ���� ��� ������ ����������� �� ������, �� ��� ����������� ��� �� ����.
// � ���� ������ ����� ����� ������������� �� ���� ��� ���� �������������, �� ��-�� ���������� ���������, ����� �� ����� �������� ��� ����� ���� �� ������ �����


class Animal {
    protected int year;
    protected  double weight;

    public Animal(int year, double weight) {
        this.year = year;
        this.weight = weight;
    }
}

class Dog extends Animal {
    public Dog() {  //������ ���� �������� ������������ �� ��������� � �����-������, ���� ����������� � ������ ���������� ����� super
        super(1, 2);
    }
}

final class Cat extends Dog { //final - �������� ��� ������������� �� ����� ������ ������. ����� ���� ����� ���� final, ����� ��� ������ ����� ���������������
    /*
    FINAL:
    1) ���������� ������ �������� ��������
    2) ������ ������ ��������������
    3) ������ ������ �������������
     */

}


//�����������
//Animal[] animals = new Animal[10]; -> � ������, ��� ��� ������ ���������� Animal
//animals[0] = new Dog();
//animals[1] = new Cat();
//animals[2] = new Bird();

//����� ���� � ������-�������� ������� �������������������� �����. � �������������� ����� ������ ����� ��-������� � ������ ������.
//������ ��� ������������ ������ ����, �� ������ ����������

//����� toString() �������������� ��� ����, ����� ��� ������ ��� ��������� � ���������� ������ ��� ����� ����, ��� � ������ toString()
//
