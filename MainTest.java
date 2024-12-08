import org.junit.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MainTest {

    @Test
    public void testGetEvenNumbers() {
        // Test with a typical list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expectedEvenNumbers = Arrays.asList(2, 4, 6);
        assertEquals(expectedEvenNumbers, main.getEvenNumbers(numbers));

        // Test with an empty list
        List<Integer> emptyList = Collections.emptyList();
        assertEquals(Collections.emptyList(), main.getEvenNumbers(emptyList));

        // Test with no even numbers
        List<Integer> oddList = Arrays.asList(1, 3, 5, 7);
        assertEquals(Collections.emptyList(), main.getEvenNumbers(oddList));

        // Test with mixed numbers
        List<Integer> mixedList = Arrays.asList(0, -1, -2, -3, -4);
        List<Integer> expectedMixedEvenNumbers = Arrays.asList(0, -2, -4);
        assertEquals(expectedMixedEvenNumbers, main.getEvenNumbers(mixedList));
    }

    @Test
    public void testConvertToUpperCase() {
        // Test with a typical string
        String input = "hello world";
        String expectedResult = "HELLO WORLD";
        assertEquals(expectedResult, main.convertToUpperCase(input));

        // Test with an empty string
        String emptyInput = "";
        String expectedEmptyResult = "Invalid input. Please provide a non-empty string.";
        assertEquals(expectedEmptyResult, main.convertToUpperCase(emptyInput));

        // Test with null input
        String nullInput = null;
        assertEquals(expectedEmptyResult, main.convertToUpperCase(nullInput));

        // Test with already uppercase input
        String uppercaseInput = "ALREADY UPPERCASE";
        assertEquals(uppercaseInput, main.convertToUpperCase(uppercaseInput));
    }
}