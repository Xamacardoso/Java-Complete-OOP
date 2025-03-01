package FilesExercise.src.application;

import FilesExercise.src.model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter .csv file path: ");
        String sourceFilePath = sc.nextLine();
        List<Product> products = new ArrayList<>();

        File sourceFile = new File(sourceFilePath);
        String sourceFolderString = sourceFile.getParent();

        // Making a new directory based on a folder path
        boolean success = new File(sourceFolderString + "\\out").mkdir();

        String targetFileString = sourceFolderString + "\\out\\summary.csv";

        // Trying to read a file inputted by the user
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath))) {

            String csvItem = reader.readLine();

            // Creating products
            while (csvItem != null) {
                System.out.println(csvItem);

                String[] fields = csvItem.split(",");
                String productName = fields[0];
                Double productPrice = Double.parseDouble(fields[1]);
                Integer productQuantity = Integer.parseInt(fields[2]);

                products.add(new Product(productName, productPrice, productQuantity));

                csvItem = reader.readLine();
            }

            // Writing products summary
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(targetFileString))) {
                for (Product product : products) {
                    writer.write(product.summarize());
                    writer.newLine();
                }

                System.out.println("Target file " + targetFileString + " written successfully!");
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());

            }
        } catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());

        }


    }
}
