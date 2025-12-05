import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\BHARATH\\OneDrive\\text.txt";
        String info = "making pizza and chicken tandoori";
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(info);
            System.out.println("file has been writen");
        } catch (FileNotFoundException e) {
            System.out.println("could not find file path");
        } catch (IOException e) {
            System.out.println("could not writen file");
        }
    }
}
