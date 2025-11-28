import java.util.Scanner;

public class Demo {
    public static void main(String[] arg) {
        System.out.println(":::simple calculator:::");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        Double number1 = scanner.nextDouble();
        System.out.print("Enter your second number: ");
        Double number2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("what kind of operation do you perform: ");
        String operator = scanner.nextLine();

        if (operator.equals("sum")) {
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        } else if (operator.equals("sub")) {
            System.out.printf("%f + %f = %f", number1, number2, number1 - number2);
        } else if (operator.equals("mul")) {
            System.out.printf("%f + %f = %f", number1, number2, number1 * number2);
        } else if (operator.equals("div")) {
            System.out.printf("%f + %f = %f", number1, number2, number1 / number2);
        } else {
            System.out.printf(" %s is a wrong operator", operator);
        }

        scanner.close();
    }
}
