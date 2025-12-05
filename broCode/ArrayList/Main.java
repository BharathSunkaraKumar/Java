import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>();

        int noOfFoodItems;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no.of food items do you want: ");
        noOfFoodItems = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= noOfFoodItems; i++) {
            System.out.print("Enter your " + i + " food item: ");
            String food = scanner.nextLine();
            foods.add(food);
        }
        // int fooditems = foods.size()
        // String message = foods.size() > 1 ? "enjoy your meal :-)" : "your enter
        // noting";
        System.out.println("enjoy your meal :-)");
        for (String food : foods) {
            System.out.println(food);
        }
        scanner.close();
    }
}
