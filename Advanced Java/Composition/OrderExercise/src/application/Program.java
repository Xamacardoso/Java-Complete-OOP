package OrderExercise.src.application;

import OrderExercise.src.entities.Customer;
import OrderExercise.src.entities.Order;
import OrderExercise.src.entities.OrderItem;
import OrderExercise.src.entities.Product;
import OrderExercise.src.entities.enums.OrderStatusComp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CLIENT DATA:");

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");

        Customer client = new Customer(name, email, sdf.parse(sc.nextLine()));

        System.out.println("Enter ORDER DATA:");
        System.out.print("Status: ");
        String status = sc.nextLine();
        System.out.print("How many items to this order? ");
        int items = sc.nextInt();

        Order order = new Order(new Date(), OrderStatusComp.valueOf(status), client);

        for (int i = 0; i < items; i++) {
            sc.nextLine();
            System.out.printf("Enter product #%d data:\n", (i+1));
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Product quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, price);
            order.addItem(new OrderItem(quantity, price, product));
        }

        System.out.println("ORDER SUMMARY");
        System.out.println(order);

        sc.close();
    }
}
