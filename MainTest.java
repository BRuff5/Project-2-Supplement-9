import org.junit.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainTest {
    
    @Test
    public void testGetEvenNumbers() {
        // Typical input
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expectedEvenNumbers = Arrays.asList(2, 4, 6);
        assertEquals(expectedEvenNumbers, main.getEvenNumbers(numbers));

        // Empty input
        assertEquals(Collections.emptyList(), main.getEvenNumbers(Collections.emptyList()));

        // No even numbers
        List<Integer> oddList = Arrays.asList(1, 3, 5, 7);
        assertEquals(Collections.emptyList(), main.getEvenNumbers(oddList));

        // Mixed numbers including negative
        List<Integer> mixedList = Arrays.asList(0, -1, -2, -3, -4);
        List<Integer> expectedMixedEvenNumbers = Arrays.asList(0, -2, -4);
        assertEquals(expectedMixedEvenNumbers, main.getEvenNumbers(mixedList));
    }

    @Test
    public void testConvertToUpperCase() {
        // Regular string
        String input = "hello world";
        String expectedResult = "HELLO WORLD";
        assertEquals(expectedResult, main.convertToUpperCase(input));

        // Empty string
        assertEquals("Invalid input. Please provide a non-empty string.", main.convertToUpperCase(""));

        // Null input
        assertEquals("Invalid input. Please provide a non-empty string.", main.convertToUpperCase(null));

        // Already uppercase string
        String uppercaseInput = "ALREADY UPPERCASE";
        assertEquals(uppercaseInput, main.convertToUpperCase(uppercaseInput));
    }

    @Test
    public void testGetLongestString() {
        // Normal case
        List<String> words = Arrays.asList("hello", "world", "java", "programming");
        String expectedLongest = "programming";
        assertEquals(expectedLongest, main.getLongestString(words));

        // Empty list
        assertEquals("Invalid input. Please provide a non-empty list of words.", main.getLongestString(Collections.emptyList()));

        // Null list
        assertEquals("Invalid input. Please provide a non-empty list of words.", main.getLongestString(null));

        // Multiple strings of the same max length
        List<String> equalLengthWords = Arrays.asList("aaa", "bbb", "cc");
        assertEquals("aaa", main.getLongestString(equalLengthWords));  // return the first longest string
    }

    private void assertEquals(List<Integer> expectedEvenNumbers, List<Integer> evenNumbers) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void assertEquals(String expectedResult, String convertToUpperCase) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}