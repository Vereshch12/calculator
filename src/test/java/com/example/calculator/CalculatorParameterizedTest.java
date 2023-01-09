package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParameterizedTest {
    private final CalculatorService calculatorForParameterizedTest = new CalculatorService();

    @ParameterizedTest
    @CsvSource({
            "1, 2", "6, 0", "1, 8", "100, 24",
            "3, 5", "1323,42443", "137439, 437"
    })
    public void plusParameterizedTest (Integer num1, Integer num2){
        Integer expected = calculatorForParameterizedTest.plus(num1, num2);
        Integer actual = num1 + num2;
        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1231, 134", "4939, 934", "12, 8", "121310, 2324",
            "3, 5", "1323,42443", "1374, 43327"
    })
    public void minusParameterizedTest (Integer num1, Integer num2){
        Integer expected = calculatorForParameterizedTest.minus(num1, num2);
        Integer actual = num1 - num2;
        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({
            "11, 1334", "49, 94", "3212, 328", "13221310, 22324",
            "3, 5", "13,43", "14, 4332723"
    })
    public void multiplyParameterizedTest (Integer num1, Integer num2){
        Integer expected = calculatorForParameterizedTest.multiply(num1, num2);
        Integer actual = num1 * num2;
        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1312111, 133214", "214129, 924", "1212, 3", "132210, 223",
            "33, 335", "1133,4133", "1341, 90"
    })
    public void divideParameterizedTest (Integer num1, Integer num2){
        Double expected = calculatorForParameterizedTest.divide(num1, num2);
        Double actual = (double) (num1 / num2);
        assertEquals(expected,actual);
    }
}
