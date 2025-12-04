class Animal {
    void move() {
        System.out.println("Animal is running");
    }
}

class Dog extends Animal {

    int age;
    String name;
    String breed;

    Dog(int age, String name, String breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    // @Override
    public String toString() {
        return this.name + " is " + this.age + " years old ";
    }

}

class Cat extends Animal {

}

class Fish extends Animal {
    void move() {
        System.out.println("This animal is swimming");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        Cat cat = new Cat();
        cat.move();
        Dog dog = new Dog(5, "tommy", "Siberian Husky");
        System.out.println(dog);
        dog.toString();
        Fish fish = new Fish();
        fish.move();

    }
}
