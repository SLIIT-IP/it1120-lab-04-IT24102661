import java.util.Scanner;

public class IT24102661Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Use ternary operator to determine if the number is positive, negative, or zero
        String result = (number > 0) ? "The number is: Positive" :
                        (number < 0) ? "The number is: Negative" :
                        "The number is: Zero";

        // Print the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}