package Lesson_26;

//ToDo: Пример с абстрактным классом + наследование
public class HW_26 {
    public static void main(String[] args) {
        Vehicle bmwCar = new Car("Car", "BMW", 2005, 100_000, true);
        Vehicle newAirplane = new Airplane("Airplane", "IL-32", 1948, 30_000, 35.8);
        Vehicle newShip = new Ship("Ship", "Titanic", 1912, 2000, 269.1);

        bmwCar.info();
        bmwCar.startEngine();
        bmwCar.turnOffEngine();

        newAirplane.info();
        newAirplane.startEngine();
        newAirplane.turnOffEngine();

        newShip.info();
        newShip.startEngine();
        newShip.turnOffEngine();



    }
}

abstract class Vehicle {
    String type;
    String model;
    int yearOfIssue;
    int mileage;

    public Vehicle(String type, String model, int yearOfIssue, int mileage) {
        this.type = type;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.mileage = mileage;
    }

    public abstract void info();

    public abstract void startEngine();

    public abstract void turnOffEngine();


}

class Car extends Vehicle {


    boolean presenceOfHeatedSeats;

    public Car(String type, String model, int yearOfIssue, int mileage, boolean presenceOfHeatedSeats) {
        super(type, model, yearOfIssue, mileage);
        this.presenceOfHeatedSeats = presenceOfHeatedSeats;
    }

    @Override
    public void info() {
        System.out.println(
                "Тип: " + type+"\n"+
                "Модель: " + model+"\n"+
                "Год выпуска: " + yearOfIssue+"\n"+
                "Пробег: " + mileage+"\n"+
                "Наличие подогрева сидений: " + presenceOfHeatedSeats+"\n"
        );
    }

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

    double wingspan;

    public Airplane(String type, String model, int yearOfIssue, int mileage, double wingspan) {
        super(type, model, yearOfIssue, mileage);
        this.wingspan = wingspan;
    }

    @Override
    public void info() {
        System.out.println(
                "Тип: " + type+"\n"+
                        "Модель: " + model+"\n"+
                        "Год выпуска: " + yearOfIssue+"\n"+
                        "Пробег: " + mileage+"\n"+
                        "Размах крыльев: " + wingspan+"\n"
        );
    }

    @Override
    public void startEngine() {
        System.out.println(type + " starts the turbine");
    }

    @Override
    public void turnOffEngine() {
        System.out.println(type + " turn off turbine");
    }
}

class Ship extends Vehicle {
    double deckLength;

    public Ship(String type, String model, int yearOfIssue, int mileage, double deckLength) {
        super(type, model, yearOfIssue, mileage);
        this.deckLength = deckLength;
    }

    @Override
    public void info() {
        System.out.println(
                "Тип: " + type+"\n"+
                        "Модель: " + model+"\n"+
                        "Год выпуска: " + yearOfIssue+"\n"+
                        "Пробег: " + mileage+"\n"+
                        "Длина палубы: " + deckLength+"\n"
        );
    }

    @Override
    public void startEngine() {
        System.out.println(type + " the blades start");
    }

    @Override
    public void turnOffEngine() {
        System.out.println(type + " turn off blades");
    }
}
