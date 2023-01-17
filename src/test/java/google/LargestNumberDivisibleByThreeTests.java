package google;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberDivisibleByThreeTests {
    @Test
    public void inputListContainsOnlyOneElementThatIsLessThanThree() {
        int[] input = {1};
        int expected = 0;
        int actual = LargestNumberDivisibleByThree.solution(input);
        assertEquals(expected, actual);
    }

    @Test
    public void inputListContainsOnlyOneElementThatIsZero() {
        int[] input = {0};
        int expected = 0;
        int actual = LargestNumberDivisibleByThree.solution(input);
        assertEquals(expected, actual);
    }

    @Test
    public void inputListContainsOnlyOneElementThatIsGreaterThanNine() {
        int[] input = {10};
        int expected = 0;
        int actual = LargestNumberDivisibleByThree.solution(input);
        assertEquals(expected, actual);
    }

    @Test
    public void inputListContainsOnlyOneElementThatIsNotDivisibleByThree() {
        int[] input = {4};
        int expected = 0;
        int actual = LargestNumberDivisibleByThree.solution(input);
        assertEquals(expected, actual);
    }

    @Test
     public void inputListContainsOnlyNegativeNumbers() {
        int[] input = {-1, -2, -3, -4, -5, -6, -7, -8, -9};
        int expected = 0;
        int actual = LargestNumberDivisibleByThree.solution(input);
        assertEquals(expected, actual);
    }

    @Test
    public void inputListContainsLargeNumberOfElements() {
        int[] input = {1,2,3,4,5,6,7,8,9};
        int expected = 987654321;
        int actual = LargestNumberDivisibleByThree.solution(input);
        assertEquals(expected, actual);
    }
}
