package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void sumRangeOfNumbersWithSet1() {
        int actual = sumCalculator.sumRangeOfNumbers(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sumRangeOfNumbersWithSet5() {
        int actual = sumCalculator.sumRangeOfNumbers(5);
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sumRangeOfNumbersThrowsExceptionFor0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sumRangeOfNumbers(0));
    }
}