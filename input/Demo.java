import java.util.Scanner;

class Demo {
    public static void main(String[] arg) {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        // System.out.println(name);
        System.out.printf("hi %s, how old are you: ", name);

        // int age = scanner.nextInt();
        int age = Integer.parseInt(scanner.nextLine());
        System.out.printf("%d is an excellent for start programming, what language do you prefer: ", age);
        // scanner.nextLine();

        String programmingLanguage = scanner.nextLine();
        System.out.printf("%s is a very popular programming language. Could you provide your gpa: ",
                programmingLanguage);

        double gpa = Double.parseDouble(scanner.nextLine());
        System.out.printf("hoo %f that great.", gpa);

        scanner.close();
    }
}