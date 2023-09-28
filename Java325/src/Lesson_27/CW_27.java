package Lesson_27;

//���� ����������
//������� ������: ������� ����������� �� ������������ ������
//�����: ��������� ��������� ������ �� �� ����� ��� ����������� �����, �� �� �����������, � �� �� ��������������.
//class Transport -> ���������, ����������, ������ -> ����� �����������
//class Animal -> ������, ���������� -> ����� ����������� �������


//�� ������������ ������ ����� ������������� ������ ���� ����, � �� ���������� ����� ������������� ������ ����, ������ ��� ��� ����������� �� ����� �����-�� ����� �����������
//����� ������ - ���� ��� - ���� ������� �����, ������ �� ������ � ���� �������� � ����������� flyable - ��������� ������ (�������, ��������, �����) -> ��������� � ������ �����



//������������ ��������� ������������� ������ �� ������ ������
//��������� - ��� ����� ���� �����������! (������, ������������, ��������)
public class CW_27 {
    public static void main(String[] args) {

        //�����������
        Transport[] transports = new Transport[2];
        transports[0] = new Airplane();
        transports[1] = new Ship();

        Animal[] animals = new Animal[2];
        animals[0] = new Owl();
        animals[1] = new Dog();

        Flyable[] flyables = new Flyable[2];
        flyables[0] = new Airplane();
        flyables[1] = new Owl();

        for (int i = 0; i < flyables.length; i++) {
            flyables[i].fly();
        }

    }
}

abstract class Animal {
    String name;
    int age;
}

class Transport {
    float weight;
    int year;
}

class Ship extends Transport {

}

class Airplane extends Transport implements Flyable {

    @Override
    public void fly() {
        System.out.println("������� ����������� � ��������");
    }
}

interface Flyable {
    void fly();
}

class Dog extends Animal{



}

class Owl extends Animal implements Flyable{


    @Override
    public void fly() {
        System.out.println("���������� ������ � �����");
    }
}
