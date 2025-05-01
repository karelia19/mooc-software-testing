package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    @Test
    void testAddWithCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9, 9, 9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 0, 0, 0));
        Assertions.assertEquals(expected, sum.addTwoNumbers(first, second));
    }

    @Test
    void testDifferentLengths() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 6, 8));
        Assertions.assertEquals(expected, sum.addTwoNumbers(first, second));
    }
    @Test
    void testNoCarryAtEnd() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(2, 3));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(6, 8)); // 23 + 45 = 68
        Assertions.assertEquals(expected, sum.addTwoNumbers(first, second));
    }

    @Test
    void testFirstShorterThanSecond() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(5));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 7)); // 5 + 12 = 17
        Assertions.assertEquals(expected, sum.addTwoNumbers(first, second));
    }

    @Test
    void testBothEmpty() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        Assertions.assertEquals(expected, sum.addTwoNumbers(first, second));
    }
}
