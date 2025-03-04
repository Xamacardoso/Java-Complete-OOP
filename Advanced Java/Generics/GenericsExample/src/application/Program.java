package GenericsExample.src.application;

import GenericsExample.src.model.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many items? ");
        int items = sc.nextInt();

        PrintService<Integer> printService = new PrintService<>();

        for (int i = 0; i < items; i++) {
            System.out.print("Item " + (i+1) + ": ");
            printService.addItem(sc.nextInt());
        }

        // The line below would cause an error because "printService" is parametrized to receive only integers
        // printService.addItem(sc.next());
        System.out.println("First item: " + printService.first());
        System.out.print("Items: ");
        printService.print();
    }
}
