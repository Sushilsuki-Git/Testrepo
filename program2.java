public class program2 {
    public static void main(String[] args) {
        // Iterate through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            int number = i;
            long factorial = 1; // Initialize factorial to 1

            // Calculate factorial using while loop
            while (number > 1) {
                factorial *= number; // Multiply factorial by number
                number--; // Decrement number
            }

            // Print factorial of the current number
            System.out.println("Factorial of " + i + " is: " + factorial);
        }
    }
}
