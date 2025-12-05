class Car {
    int year;
    String model;
    Engine engineType;

    Car(int year, String model, String engineType) {
        this.year = year;
        this.model = model;
        this.engineType = new Engine(engineType);
    }

    void getCar() {
        engineType.startEngine();
        System.out.println(this.model + " " + this.year);
    }
}

class Engine {
    String type;

    Engine(String type) {
        this.type = type;
    }

    void startEngine() {
        System.out.println(this.type + " engine is just started");
    }

}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(2020, "mahindra thar", "v8");
        car.getCar();
        // car.engineType;
    }
}
