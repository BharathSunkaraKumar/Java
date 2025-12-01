
class Demo {
    public static void main(String[] args) {
        System.out.println("---Patterns---");

        for (int i = 1; i <= 5; i++) {
            System.out.print(" ");
            for (int j = i; j <= 5; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println(" ");
        }
    }
}
