import org.junit.*;

import java.util.Arrays;
import java.util.List;

public class MainTest {

    @Test
    public void testGetEvenNumbers() {
        // Arrange
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expectedEvenNumbers = Arrays.asList(2, 4, 6, 8, 10);

        // Act
        List<Integer> actualEvenNumbers = main.getEvenNumbers(inputList);

        // Assert
        Assert.assertEquals(expectedEvenNumbers, actualEvenNumbers);
    }

    @Test
    public void testGetEvenNumbersWithNoEvens() {
        // Arrange
        List<Integer> inputList = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> expectedEvenNumbers = Arrays.asList();

        // Act
        List<Integer> actualEvenNumbers = main.getEvenNumbers(inputList);

        // Assert
        Assert.assertEquals(expectedEvenNumbers, actualEvenNumbers);
    }

    @Test
    public void testGetEvenNumbersWithAllEvens() {
        // Arrange
        List<Integer> inputList = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> expectedEvenNumbers = Arrays.asList(2, 4, 6, 8, 10);

        // Act
        List<Integer> actualEvenNumbers = main.getEvenNumbers(inputList);

        // Assert
        Assert.assertEquals(expectedEvenNumbers, actualEvenNumbers);
    }

    @Test
    public void testGetEvenNumbersWithEmptyList() {
        // Arrange
        List<Integer> inputList = Arrays.asList();
        List<Integer> expectedEvenNumbers = Arrays.asList();

        // Act
        List<Integer> actualEvenNumbers = main.getEvenNumbers(inputList);

        // Assert
        Assert.assertEquals(expectedEvenNumbers, actualEvenNumbers);
    }
}