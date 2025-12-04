import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**********************");
        System.out.println("Welcome to Quiz Game");
        System.out.println("**********************");
        String[] questions = { "what is full form of RRR:", "Which is the following java framework: ",
                "how many centurys have in ODI format for virat kohli",
                "which is the backend programing language for java script", "What is memory in cpu" };
        String[][] options = {
                { "1. Ram, Ravan, Roar", "2. Rise, Roar, Revolt", "3. Rise, Roar, Revenge", "4. Ram. Roar, Revolt" },
                { "1. Express", "2. Spring", "3. React", "4. Next" },
                { "1. 53", "2. 54", "3. 55", "4. 56" },
                { "1. Node", "2. Next", "3. Express", "4. Spring" },
                { "1. mouse", "2. Cpu", "3. Keyboard", "4. Monitor" }
        };
        int[] answers = { 2, 2, 1, 1, 2 };
        int score = 0;
        int guess;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.println("guess the answer: ");
            System.out.println();
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess == answers[i]) {
                System.out.println("**********");
                System.out.println(" Correct  ");
                System.out.println("**********");
                score++;
            } else {
                System.out.println("**********");
                System.out.println("  Wrong  ");
                System.out.println("**********");
            }
        }
        System.out.println("Your score: " + score + " out of " + questions.length);
        scanner.close();
    }
}
