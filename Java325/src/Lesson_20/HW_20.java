package Lesson_20;

public class HW_20 {
    public static void main(String[] args) {
        //Dog:
        Dog firstDog = new Dog("Ally", "Poodle", 5, 8);
        firstDog.viewData();
        firstDog.eat();
        firstDog.makeSound();
        firstDog.play();

        //Cat:
        Cat firstCat = new Cat("Monica", "Siamese", 3, 3);
        firstCat.viewData();
        firstCat.eat();
        firstCat.makeSound();
        firstCat.play();

        //Parrot:
        Parrot firstParrot = new Parrot("Kesha", "Ara", 6, 2);
        firstParrot.viewData();
        firstParrot.eat();
        firstParrot.makeSound();
        firstParrot.play();


        //После
        firstDog.viewData();
        firstCat.viewData();
        firstParrot.viewData();
    }
}

class Dog {
    String name;
    String breed;
    int age;
    int weight;

    public Dog(String name, String breed, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public void viewData() {
        System.out.println("Dog: " + "\nName: " + name + "\nBreed: " + breed + "\nAge: " + age + "\nWeight: " + weight + "\n");
    }

    public void eat() {
        System.out.println(name + " is eating...\n");
        weight += 3;
    }

    public void makeSound() {
        System.out.println(name + " is barking...\n");
    }

    public void play() {
        System.out.println(name + " is playing with ball...\n");
    }

}

class Cat {
    String name;
    String breed;
    int age;
    int weight;

    public Cat(String name, String breed, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }


    public void viewData() {
        System.out.println("Cat: " + "\nName: " + name + "\nBreed: " + breed + "\nAge: " + age + "\nWeight: " + weight + "\n");
    }

    public void eat() {
        System.out.println(name + " is eating...\n");
        weight += 2;
    }

    public void makeSound() {
        System.out.println(name + " is meows...\n");
    }

    public void play() {
        System.out.println(name + " is playing with clew...\n");
    }
}

class Parrot {
    String name;
    String breed;
    int age;
    int weight;

    public Parrot(String name, String breed, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public void viewData() {
        System.out.println("Parrot: " + "\nName: " + name + "\nBreed: " + breed + "\nAge: " + age + "\nWeight: " + weight + "\n");
    }

    public void eat() {
        System.out.println(name + " is eating\n");
        weight += 1;
    }

    public void makeSound() {
        System.out.println(name + " is tweeting...\n");
    }

    public void play() {
        System.out.println(name + " is playing with wheel...\n");
    }
}
