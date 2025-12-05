import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Users\\BHARATH\\OneDrive\\Desktop\\text.txt"));) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not located");
        } catch (IOException e) {
            System.out.println("Somthing went wrong");
        }
    }
}
