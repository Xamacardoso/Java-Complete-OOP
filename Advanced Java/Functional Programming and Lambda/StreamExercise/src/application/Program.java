package StreamExercise.src.application;

import FunctionalInterfaces.Consumer.src.entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String filePath = "c:\\file\\prods.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            List<Product> prods = new ArrayList<>();

            String line = reader.readLine();
            while (line != null) {
                String[] tokens = line.split(",");
                prods.add(new Product(tokens[0], Double.parseDouble(tokens[1])));
                line = reader.readLine();
            }

            // Calculate average of prices, then show in descending order the products that are below the average
            Double averagePrice = prods.stream()
                    .map(Product::getPrice)
                    .reduce(0.0, (x, y) -> x + y) / prods.size();

            List<Product> filteredProds = prods.stream()
                    .filter(x -> x.getPrice() < averagePrice)
                    .sorted((x, y) -> y.getName().compareTo(x.getName()))
                    .toList();

            System.out.println("Average price: " + averagePrice);
            filteredProds.forEach(System.out::println);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
