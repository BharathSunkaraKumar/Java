
class Vehicle {
    public void Start() {
        System.out.println("vehicle started");
    }
}

class Car extends Vehicle {

    // public void Start() {
    // System.out.println("car started");
    // }

    public void music() {
        System.out.println("music plaing in the car");
    }
}

public class Demo {

    public static void main(String arg[]) {
        System.out.println("upcasting and downcasting");

        // Vehicle v = new Car(); // upcasting
        // // Car c = (Car) v; // downcasting
        // v.Start();
        // // c.music();
        // if (v instanceof Car) {
        // Car c = (Car) v;
        // c.music();
        // }

        Vehicle v = new Car();// upcasting

        if (v instanceof Car) { // downcasting
            Car c = (Car) v;
            c.music();
        }

    }
}