package Lesson_26;

//ToDO: ���������� � ������ �� ������ ������� ���������

public class CW_26 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Owl owl = new Owl();
        owl.sound();
    }

}

//����������� �����, �.�. �������� - ��� ������� �������� �������� (�� ������ ������ ��������� ������ ����� ������)
abstract class Animal {
    protected String nickname;
    protected int year;

    public abstract void sound(); //����������� ����� ������ ������������ ��� ���� �����������


}

class Dog extends Animal {
    String tail;

    @Override
    public void sound() {
        System.out.println("qaw qaw");
    }
}

class Owl extends Animal {
    String wings;

    @Override
    public void sound() {
        System.out.println("u u u");
    }
}
