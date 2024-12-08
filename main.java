import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class main {

    /**
     * Returns a list of all even numbers from the provided parameter list.
     *
     * @param numbers List of integers to filter.
     * @return List of even integers.
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


    public static void main(String[] args) {
        
        //even number printed
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24);
        System.out.println("Even numbers: " + getEvenNumbers(numbers)); 

    }
}
