class Car {
    String color;
    String model;

    Car(String model, String color) {
        this.color = color;
        this.model = model;
    }

    void drive() {
        System.out.println("Your drive a " + model + " color " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("TATA Harrier", "Blue");
        Car car2 = new Car("mahindra thar", "black");
        Car car3 = new Car("bmw x5", "gray");
        // car1.drive();
        // String[] cars = new String[3];
        Car[] cars = {
                car1, car2, car3
        };
        // for (Car car : cars) {
        // if (car.model == "TATA Harrier") {

        // car.color = "black";
        // }
        // }
        for (Car car : cars) {
            car.drive();
        }

    }
}
