package basics;

class Demo {
    public static void main(String arg[]) {
        int num1 = 5;
        int num2 = 5;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println("reminder" + " " + num1 % num2);

        // Relational operators ==, !=, >, <, >=, <=
        // logical operators &&, ||, !

        // boolean result = num1 > 0 || num2 < 4;
        boolean result = !(num1 > 0);
        System.out.println(result);
    }
}