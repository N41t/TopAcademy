package Lesson_20;


import org.w3c.dom.html.HTMLIsIndexElement;

//Lesson OOP
//���������� �� ������� ��� �� �����

// � ������� ��������� ����� this(), ����� ������� ����������� � ������������. ��� ���������� ������������� �������������
// (this."��� ����" - ��������� � ����, this() - ��������� � ������������)

//���� �������������:
/*
{
    lastname = "no";
    surname = "no";
    age = 0;
}

//!! Init ���� ���������� ������ ������������
//� ����� �������������� �������������� ����, � � ������������...
public Person() {

}
 */
public class CW_20 {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.marka = "BMW";
        bmw.model = "M5";
        bmw.year = 2023;
        bmw.fuel = 50;
        bmw.engine = 3;

        bmw.move();
        bmw.move();
        bmw.move();
        bmw.move();

        Car tida = new Car();
        tida.marka = "Nissa";
        tida.model = "Tiida";
        tida.year = 2005;
        tida.fuel = 70;
        tida.engine = 1;

        tida.move();
        tida.move();
        tida.move();
        tida.move();
    }
}

class Car {
    public String model;
    public String marka;
    public int year;
    public int fuel;
    public int engine;

    public void move() {

        if (fuel>=10) {
            fuel -= 3 * engine;
            System.out.println("Kataemsya na " + marka + " " + model + " ("+year+") : toplivo ("+fuel+")");
        } else {
            System.out.println("Nado zapravitsa");
        }
    }

    public void zapravitsa(int top) {
        fuel +=top;

        if(fuel > 100) {
            fuel = 100;
        }
        System.out.println("Ya zapravilsya na " + top + " y i : topliva ("+fuel+")");
    }
}

