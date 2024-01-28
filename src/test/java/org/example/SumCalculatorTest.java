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
    void testThatSumWorksCorrectFor1() {
        int actual = sumCalculator.fibonachiSum(1);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSumWorksCorrectFor3() {
        int actual = sumCalculator.fibonachiSum(3);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatThrowsExceptionFor0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.fibonachiSum(0));
    }
}