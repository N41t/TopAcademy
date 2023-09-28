package Lesson_21;

import java.util.Arrays;

public class HW_21 {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+78634567281", "Samsung", 0.2);
        Phone phone2 = new Phone("+78634566792", "Iphone", 0.3);
        Phone phone3 = new Phone("+78634568702", "Huawei", 0.15);

        System.out.println("number: "+phone1.number+", model: "+phone1.model+", weight: "+phone1.weight);
        System.out.println("number: "+phone2.number+", model: "+phone2.model+", weight: "+phone2.weight);
        System.out.println("number: "+phone3.number+", model: "+phone3.model+", weight: "+phone3.weight);

        phone1.receiveCall("Jack");
        phone2.receiveCall("Derek");
        phone3.receiveCall("Katy");
        System.out.println();

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        System.out.println();

        phone1.receiveCall("Derek", phone1.number);


        String[] numbers = phone1.sendMessage(phone1.number, phone2.number, phone3.number);

        System.out.println(Arrays.toString(numbers));

    }
}

class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

        Phone phone1 = new Phone("+7845623891", "Xiaomi");
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public void receiveCall(String name) {
        System.out.println("\nЗвонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("\n"+number+" : "+name);
    }

    public String getNumber() {
        return number;
    }

    public String[] sendMessage(String ... number) {
        return number;
    }
}
