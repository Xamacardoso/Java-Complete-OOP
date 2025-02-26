package MatrixExercise.src.application;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines of the matrix: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m]; // Initializing the matrix

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt(); // Adding elements to the matrix
            }
        }

        System.out.print("Which element you would like to print the surrounding numbers? ");
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == x) {
                    System.out.printf("Ocurrence in the position x:%d  y:%d\n", i,j);
                    if (i > 0){
                        System.out.printf("Up: %d\n", matrix[i-1][j]);
                    }
                    if (j > 0) {
                        System.out.printf("Left: %d\n", matrix[i][j - 1]);
                    }
                    if (j < matrix[i].length - 1) {
                        System.out.printf("Right: %d\n", matrix[i][j + 1]);
                    }
                    if (i < matrix.length-1){
                        System.out.printf("Down: %d\n", matrix[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
