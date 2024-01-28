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
    void fibonachiSumWithSet1() {
        int actual = sumCalculator.fibonachiSum(1);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fibonachiSumWithSet5() {
        int actual = sumCalculator.fibonachiSum(5);
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fibonachiSumThrowsExceptionFor0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.fibonachiSum(0));
    }
}