// abstract class Vahicle {
//     abstract void go();
// }

import java.util.Scanner;

interface Vahicle {
    void go();
}

class Car implements Vahicle {
    public void go() {
        System.out.println("car is driving");
    }
}

class Bike implements Vahicle {
    public void go() {
        System.out.println("bike is riding");
    }
}

class Boat implements Vahicle {
    public void go() {
        System.out.println("boat is going on sea");
    }
}

abstract class Animal {
    abstract void speak();
}

class Dog extends Animal {
    public void speak() {
        System.out.println("dog speaks bow bow!!");
    }
}

class Cat extends Animal {
    public void speak() {
        System.out.println("cat speaks meow meow!!");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("abstract polymorphism");

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        // car.go();
        // bike.go();
        // boat.go();

        Vahicle[] vahicles = { car, bike, boat };
        for (Vahicle vahicle : vahicles) {
            vahicle.go();
        }
        // bike.go();

        Animal animal;

        Scanner scanner = new Scanner(System.in);

        System.out.print("would you like a Dog or Car? (1==dog | 2==cat): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            System.out.println("invalid input :-(");
        }
        scanner.close();

    }
}
