package ManipulatingFolders.src.application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String filePathString = sc.nextLine();

        File path = new File(filePathString); // File object can be a reference to a folder too, not only files

        File[] folders = path.listFiles(File::isDirectory); // Picks only files
        File[] files = path.listFiles(File::isFile); // Picks only folders inside the path

        for (File file : files) {
            System.out.println("File: " + file.getName());
        }

        for (File folder : folders) {
            System.out.println("Folder: " + folder.getName());
        }

        System.out.println();
        System.out.print("Now, enter a FILE path: ");
        filePathString = sc.nextLine();

        path = new File(filePathString);
        System.out.println("Name: " + path.getName()); // Gets the name of the file
        System.out.println("Path: " + path.getPath()); // Gets the complete path of the file
        System.out.println("Folder: " + path.getParent()); // Gets the path of parent folder
    }
}
