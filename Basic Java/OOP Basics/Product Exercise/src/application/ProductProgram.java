package application;

import entities.Product;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ProductProgram {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.print("Enter product name: ");
        product.name = sc.nextLine();
        System.out.print("Enter product price: ");
        product.price = sc.nextDouble();
        System.out.print("Enter product amount in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product.name + ": " + "R$" + product.price + ", Amount: " + product.quantity);
        sc.close();
    }
}
