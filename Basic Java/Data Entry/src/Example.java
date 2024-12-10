import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String x,y,z;

        /*// When ENTER is typed, creates a "\n" character, that skips a line,
        but it's not used in this variable, so we need to  consume this \n character*/
        num = sc.nextInt();
        sc.nextLine(); // Consumes the \n character left
        x = sc.nextLine();
        y = sc.nextLine();
        z = sc.nextLine();
        System.out.println(x+","+y+","+z);
    }
}
