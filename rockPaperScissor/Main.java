import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] choice = { "rock", "paper", "scissors" };
        String playerChoice;
        String computerChoice;
        String playAgin = "yes";
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();
            if (!playerChoice.equals("rock")
                    && !playerChoice.equals("paper")
                    && !playerChoice.equals("scissors")) {
                System.out.println("invalid input");
            }
            computerChoice = choice[random.nextInt(3)];
            System.out.println("computer choice: " + computerChoice);
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors"))
                    || (playerChoice.equals("paper") && computerChoice.equals("rock")
                            || (playerChoice.equals("scissors") && computerChoice.equals("paper")))) {
                System.out.println("You Win!");
            } else {
                System.out.println("You lose!");
            }
            System.out.print("Do you want plain again yes/no: ");
            playAgin = scanner.nextLine();
        } while (playAgin.equals("yes"));
        scanner.close();
    }
}
