package DelimitedGenerics.src.application;

import DelimitedGenerics.src.model.entities.Product;
import DelimitedGenerics.src.model.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("c:\\file\\products.txt"))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                products.add(new Product(name, price));

                line = br.readLine();
            }

            System.out.println("Most expensive: " + CalculationService.max(products));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
