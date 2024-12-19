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
        System.out.println(product.toString());

        System.out.print("Enter the number of products to be added in stock: ");
        int quantityToAdd = sc.nextInt();
        product.addProducts(quantityToAdd);
        System.out.println("Updated product info:\n" + product.toString());

        System.out.print("Enter the number of products to be removed in stock: ");
        int quantityToRemove = sc.nextInt();
        product.removeProducts(quantityToRemove);
        System.out.println("Updated product info:\n" + product.toString());

        sc.close();
    }
}
