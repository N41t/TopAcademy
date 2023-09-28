package Lesson_27;

//Тема Интерфейсы
//Главный вопрос: Отличие интерфейсов от абстрактного класса
//Ответ: Интерфейс позволяет делать то же самое что абстрактный класс, но по возможности, а не по принадлежности.
//class Transport -> воздушный, сухопутный, водный -> Будет интерфейсом
//class Animal -> хищник, травоядный -> Будет абстрактным классом


//От абстрактного класса может наследоваться только одна раса, а от интерфейса могут наследоваться разные расы, потому что это группировка по одной какой-то общей возможности
//Яркий пример - игра ГТА - Если начался дождь, погода не летная и всем объектам с интерфейсом flyable - запрещаем летать (самолет, вертолет, птицы) -> относятся к разным расам



//Наследование позволяет наследоваться только от одного класса
//Интерфейс - это какая либо возможность! (кушать, плавательный, гуляющий)
public class CW_27 {
    public static void main(String[] args) {

        //Группировка
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
        System.out.println("Самолет разгоняется и взлетает");
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
        System.out.println("Раскрывает крылья и летит");
    }
}
