package Lesson_25;

import org.xml.sax.helpers.AttributesImpl;

public class CW_25 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //INNER CLASS
        //Motherboard.Bios bios = new Motherboard().Bios //просто так этот класс не создать, только через метод
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

    //inner(создаем только в том случае если без внешнего класса внутренний не существует)

    class Bios {

    }
}

//nasledovanie
class Person {
    //Модификатор доступа protected - позволяет видеть поля внутри класса и в классах наследниках + нахождение в одном пакете
    //модификатор доступа default - работает только в package. Внутри package - как public
    protected String name;
    protected String lastname;
    protected int age;
}

class Student extends Person {
    double stipendia;
    public void test(){
        //Когда есть похожие методы или переменные в классе-родителе и наследнике
        super.name = "1"; //super -> обращение к базовому классу(от которого наследуемся)
        this.name = "2"; //this -> обращение к своему классу (то есть к Student)
    }
}

class Teacher extends Person {
    double salary;
}

//Множественного наследования нет из-за ромбовидного наследования. Если два класса наследуются от одного, то они приобретают все их поля.
// И если другой класс будет наследоваться от двух тех выше наследованных, то из-за одинаковой структуры, класс не будет понимать про какое поле вы имеете ввиду


class Animal {
    protected int year;
    protected  double weight;

    public Animal(int year, double weight) {
        this.year = year;
        this.weight = weight;
    }
}

class Dog extends Animal {
    public Dog() {  //Просит либо создания конструктора по умолчанию в супер-классе, либо конструктор в классе наследнике через super
        super(1, 2);
    }
}

final class Cat extends Dog { //final - означает что наследоваться от этого класса нельзя. Метод тоже может быть final, тогда его нельзя будет перееопределить
    /*
    FINAL:
    1) переменные нельзя изменять значение
    2) методы нельзя переопределять
    3) классы нельзя наследоваться
     */

}


//Полиморфизм
//Animal[] animals = new Animal[10]; -> С учетом, что все классы наследники Animal
//animals[0] = new Dog();
//animals[1] = new Cat();
//animals[2] = new Bird();

//Также если в классе-родителе указать неинициализированный метод. И переопределить потом каждый метод по-разному в каждом классе.
//Потому что наименование метода одно, но разные реализации

//Метод toString() переопределяем для того, чтобы при вызове или обращении к экземпляру класса был вывод того, что в классе toString()
//
