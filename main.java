import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class main {

    /**
     * Returns a list of all even numbers f
     *
     * @param numbers List of integers 
     * @return List of even numbers
     */
    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }


    /**
     * Converts all to UPPERCASE
     *
     * @param input The string to convert
     * @return A new string with all characters in uppercase.
     */
    public static String convertToUpperCase(String input) {
        if (input == null || input.isEmpty()) {
            return "Invalid input. Please provide a non-empty string.";
        }
        return input.toUpperCase();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //even number printed
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24);
        System.out.println("Even numbers: " + getEvenNumbers(numbers)); 

        // Allow user input for convertToUpperCase
        System.out.println("\nTesting convertToUpperCase...");
        System.out.print("Enter a phrase so this program can convert it to uppercase: ");
        String userInput = scanner.nextLine();
        System.out.println("Uppercase: " + convertToUpperCase(userInput));

    }
}
