import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioPermission;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Music player");
        String filePath = "C:\\bharath\\myStuff\\java\\Demo\\broCode\\musicPlayer\\song.wav";
        File file = new File(filePath);
        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                Scanner scanner = new Scanner(System.in)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            // System.out.println("No problems detected");
            clip.start();
            String response = "";
            while (!response.equals("Q")) {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your response: ");
                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P":
                        clip.start();
                        break;
                    case "S":
                        clip.stop();
                        break;
                    case "R":
                        clip.setMicrosecondPosition(0);
                        ;
                        break;
                    case "Q":
                        clip.close();
                        break;

                    default:
                        System.out.println("------Invalid choice :-(------");
                        break;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("could not locate file located");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access resource");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file 9s not supported");
        } catch (IOException e) {
            System.out.println("Somthing want wrong");
        } finally {
            System.out.println("Bye :-)");
        }
    }
}
