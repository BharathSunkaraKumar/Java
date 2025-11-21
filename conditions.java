class Demo {
    public static void main(String arg[]) {
        int num1 = 10;
        int num2 = 11;
        int result = 0;
        System.out.println(num1 + " " + num2);

        result = num1 > 0 ? 50 : 10;

        System.out.println(result);

        if (num1 > num2) {
            System.out.println("yes");
        } else if (num1 == num2) {
            System.out.println("same");
        } else {
            System.out.println("no");
        }
    }
}