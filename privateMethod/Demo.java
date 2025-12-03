class A {
    int number = 10;
    int number1 = 5;
    double interst = 5;

    public void calculateInterst() {
        System.out.println(this.calc());
    }

    private double calc() {
        return number * number1;
    }
}

public class Demo {
    public static void main(String[] arg) {
        A obj = new A();
        obj.calculateInterst();
    }
}
