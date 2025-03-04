package SetUsersExercise.src.application;

import SetUsersExercise.src.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full file path: ");
        String filePath = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            Set<LogEntry> entries = new HashSet<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(" ");
                String username = fields[0];
                Instant userEntryTime = Instant.parse(fields[1]);

                entries.add(new LogEntry(username, userEntryTime));
                line = br.readLine();
            }

            System.out.println("Users: " + entries.size());
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            sc.close();
        }

    }
}
