import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to input values for X and Y
        System.out.print("Enter the value of X: ");
        int X = scanner.nextInt();
        System.out.print("Enter the value of Y: ");
        int Y = scanner.nextInt();

        // Comparing X and Y using if statement
        if (X > Y) {
            System.out.println("X is greater than Y");
        } else if (X == Y) {
            System.out.println("X and Y are equal");
        } else {
            System.out.println("Y is greater than X");
        }

        // Closing the Scanner object
        scanner.close();
    }
}
