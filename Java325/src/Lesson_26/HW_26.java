package Lesson_26;

//ToDo: ѕример с абстрактным классом + наследование
public class HW_26 {
    public static void main(String[] args) {

    }
}

abstract class Vehicle {
    String type;
    String model;
    int yearOfIssue;
    String countryOfIssue;
    int mileage;

    public abstract void startEngine();

    public abstract void turnOffEngine();


}

class Car extends Vehicle {

    boolean presenceOfHeatedSeats;

    @Override
    public void startEngine() {
        System.out.println(type + " starting engine!");
    }

    @Override
    public void turnOffEngine() {
        System.out.println(type + " turn off engine!");
    }
}

class Airplane extends Vehicle {

    int wingspan;

    @Override
    public void startEngine() {
        System.out.println();
    }

    @Override
    public void turnOffEngine() {

    }
}
