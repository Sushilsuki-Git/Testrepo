import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double area = Math.PI * radius * radius;

        // Calculate the circumference of the circle
        double circumference = 2 * Math.PI * radius;

        // Display the calculated area and circumference
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);

        // Close the Scanner object
        scanner.close();
    }
}
 
    

