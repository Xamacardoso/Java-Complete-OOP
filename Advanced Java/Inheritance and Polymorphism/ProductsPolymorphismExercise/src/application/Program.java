package ProductsPolymorphismExercise.src.application;

import ProductsPolymorphismExercise.src.entities.ImportedProduct;
import ProductsPolymorphismExercise.src.entities.Product;
import ProductsPolymorphismExercise.src.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of products: ");
        int productsAmount = sc.nextInt();
        List<Product> products = new ArrayList<>();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Aux object for date formatting

        for (int i = 0; i < productsAmount; i++) {
            System.out.printf("Product #%d data:\n", i+1);

            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = sc.next().charAt(0);
            sc.nextLine(); // Buffer reset

            System.out.print("Name: ");
            String productName = sc.nextLine();

            System.out.print("Price: ");
            Double productPrice = sc.nextDouble();

            if (productType == 'c') {
                products.add(new Product(productName, productPrice));

            } else if (productType == 'i') {
                System.out.print("Customs fee: ");
                Double productFee = sc.nextDouble();
                products.add(new ImportedProduct(productName, productPrice, productFee));

            } else {
                System.out.print("Manufacture date (dd/MM/yyyy): ");
                LocalDate productDate = LocalDate.parse(sc.next(), timeFormatter);
                products.add(new UsedProduct(productName, productPrice, productDate));
            }
        }

        System.out.println();
        System.out.println("=== PRICE TAGS ====");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
