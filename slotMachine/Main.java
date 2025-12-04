import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int bet;
        int payOut;
        String[] row;
        Scanner scanner = new Scanner(System.in);
        String plainAgin;

        System.out.println("*******Welcome to the java slots*******");
        System.out.println("🍉watermelon, 🔔bell, ⭐star, 🍒cherry, 🍋lemon");
        System.out.println("**************");
        System.out.println("Current balance: " + balance);
        while (balance > 0) {
            System.out.print("place your bet: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (bet > balance) {
                System.out.println("insufficient balance :-(");
                continue;
            } else if (bet <= 0) {
                System.out.println("bet must be greater than 0 :-(");
                continue;
            } else {
                balance -= bet;
                System.out.println("balance: " + balance);
            }
            System.out.println("--------------spinning---------------");
            row = spiner();
            printRow(row);
            // getPayout(row, bet);
            payOut = getPayout(row, bet);
            if (payOut > 0) {
                System.out.println("you won: " + payOut);
                balance += payOut;
            } else {
                System.out.println("sorry you lost this round");
            }
            System.out.println("balance: " + balance);
            System.out.print("Do you want to play again? (Y/N): ");
            plainAgin = scanner.nextLine().toUpperCase();

            if (!plainAgin.equals("Y")) {
                break;
            }

        }
        System.out.println("GAME OVER! Your final balance is " + balance);
        scanner.close();
    }

    static String[] spiner() {
        String[] symbols = { "🍉watermelon", "🔔bell", "⭐star", "🍒cherry", "🍋lemon" };
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        // for (String r : row) {
        // System.out.println(r);
        // }
        return row;
    }

    static void printRow(String[] row) {
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            switch (row[0]) {
                case "🍒cherry":
                    return bet * 3;
                // break;
                case "🍉watermelon":
                    return bet * 4;
                // break;
                case "🍋lemon":
                    return bet * 5;
                // break;
                case "🔔bell":
                    return bet * 10;
                // break;
                case "⭐star":
                    return bet * 20;
                // break;
                default:
                    return 0;
            }
        } else if (row[0].equals(row[1])) {
            switch (row[0]) {
                case "🍒cherry":
                    return bet * 2;
                // break;
                case "🍉watermelon":
                    return bet * 3;
                // break;
                case "🍋lemon":
                    return bet * 4;
                // break;
                case "🔔bell":
                    return bet * 5;
                // break;
                case "⭐star":
                    return bet * 10;
                // break;
                default:
                    return 0;
            }
        } else if (row[1].equals(row[2])) {
            switch (row[1]) {
                case "🍒cherry":
                    return bet * 2;
                // break;
                case "🍉watermelon":
                    return bet * 3;
                // break;
                case "🍋lemon":
                    return bet * 4;
                // break;
                case "🔔bell":
                    return bet * 5;
                // break;
                case "⭐star":
                    return bet * 10;
                // break;
                default:
                    return 0;
            }
        }
        return 0;
    }
}
