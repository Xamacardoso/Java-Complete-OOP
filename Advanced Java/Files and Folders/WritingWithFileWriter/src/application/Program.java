package WritingWithFileWriter.src.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String filePathString = "c:\\file\\testOut.txt";
        String[] lines = "Maria,Carlos,Lucas".split(",");

        // FileWriter is a data writing stream to write or append files.
        // BufferedWriter uses buffers to optimize file writer operations

        // If instantiating FileWriter with "true" on its parameters, the writer will only append data into the file
        // Otherwise, FileWriter will re-write the entire file
        // If the file doesn't exists, it will be created
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePathString, true))) {
            for (String line: lines) {
                writer.write(line);
                writer.newLine(); // Breaks a line
            }

            System.out.println("File written successfully!");
        } catch (IOException e){
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
