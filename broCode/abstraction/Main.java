// abstract class Computer {
//     public void getComputer() {
//         System.out.println("this is computer class");
//     }

//     abstract public void machine();
// }

// class Laptop extends Computer {
//     public void machine() {
//         System.out.println("latest laptop");
//     }
// }

abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("animal sleep");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("dog barks");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    public void sound() {
        System.out.println("Cow moos");
    }
}

public class Main {
    public static void main(String[] args) {
        // Computer computer = new Computer();
        // Laptop laptop = new Laptop();
        // laptop.getComputer();
        // laptop.machine();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();
        dog.sound();
        cat.sound();
        cow.sound();
    }
}
