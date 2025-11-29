class Demo {
    public static void main(String[] arg) {
        System.out.println("for loops");
        // int number = 9;
        for (int number = 1; number <= 10; number++) {
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.printf("%d X %d = %d \n", number, multiplier, multiplier * number);
            }
        }
    }
}