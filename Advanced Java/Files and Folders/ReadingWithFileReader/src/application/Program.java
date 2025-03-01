package ReadingWithFileReader.src.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String filePath = "c:\\file\\test.txt";

        // FileReader is a class that represents a file data stream
        // BufferedReader is a more optimized implementation of a file reader, using buffers

        // Using try-with resource to improve code readability. It closes the streams
        // automatically at end of block
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine(); // Advances to next line
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
