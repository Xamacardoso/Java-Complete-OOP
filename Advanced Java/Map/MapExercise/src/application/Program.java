package MapExercise.src.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("c:\\file\\candidates.txt"))){

            Map<String, Integer> candidates = new HashMap<>();
            String line = reader.readLine();
            while (line != null) {
                String[] tokens = line.split(",");
                String name = tokens[0];
                Integer votes = Integer.parseInt(tokens[1]);

                if (!candidates.containsKey(name)) {
                    candidates.put(name, votes);

                } else {
                    Integer votesSoFar = candidates.get(name);
                    candidates.put(name, votes + votesSoFar);
                }

                line = reader.readLine();
            }

            for (String candidate : candidates.keySet()) {
                System.out.printf("%s - %d votes%n", candidate, candidates.get(candidate));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
