import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDies = 0;
        int total = 0;
        System.out.print("Enter the #number# of dice to roll: ");
        numOfDies = scanner.nextInt();
        if (numOfDies > 0) {
            for (int i = 0; i < numOfDies; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("you rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        } else {
            System.out.println("#number# of dice must be greater than 0");
        }
        scanner.close();
    }

    static void printDie(int roll) {
        String dice1 = """
                  -------
                |        |
                |   ●    |
                |        |
                 -------
                """;
        String dice2 = """
                  -------
                | ●      |
                |        |
                |      ● |
                 -------
                """;
        String dice3 = """
                  -------
                | ●       |
                |    ●    |
                |      ●  |
                 -------
                """;
        String dice4 = """
                  -------
                | ●     ● |
                |         |
                | ●     ● |
                 -------
                """;
        String dice5 = """
                  -------
                | ●      ● |
                |    ●     |
                | ●     ●  |
                 -------
                """;
        String dice6 = """
                  -------
                | ●      ● |
                | ●      ● |
                | ●      ● |
                 -------
                """;
        // System.out.println(dice1);
        switch (roll) {
            case 1:
                System.out.println(dice1);
                break;
            case 2:
                System.out.println(dice2);
                break;
            case 3:
                System.out.println(dice3);
                break;
            case 4:
                System.out.println(dice4);
                break;
            case 5:
                System.out.println(dice5);
                break;
            case 6:
                System.out.println(dice6);
                break;

            default:
                System.out.println("invalid roll: ");
        }
    }
}
