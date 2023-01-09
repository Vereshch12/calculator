package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private final Integer num1 = 100;
    private final Integer num2 = 50;
    private final Integer num3 = 5;
    private final Integer num4 = 1;
    private final CalculatorService calculatorForTest = new CalculatorService();

    @Test
    public void plusTest1 (){
        Integer expected = calculatorForTest.plus(num1, num2);
        Integer actual = num1 + num2;
        assertEquals(expected,actual);
    }

    @Test
    public void plusTest2 (){
        Integer expected = calculatorForTest.plus(num3, num4);
        Integer actual = num3 + num4;
        assertEquals(expected,actual);
    }

    @Test
    public void minusTest1 (){
        Integer expected = calculatorForTest.minus(num1, num2);
        Integer actual = num1 - num2;
        assertEquals(expected,actual);
    }

    @Test
    public void minusTest2 (){
        Integer expected = calculatorForTest.minus(num3, num4);
        Integer actual = num3 - num4;
        assertEquals(expected,actual);
    }

    @Test
    public void multiplyTest1 (){
        Integer expected = calculatorForTest.multiply(num1, num2);
        Integer actual = num1 * num2;
        assertEquals(expected,actual);
    }

    @Test
    public void multilpyTest2 (){
        Integer expected = calculatorForTest.multiply(num3, num4);
        Integer actual = num3 * num4;
        assertEquals(expected,actual);
    }

    @Test
    public void divideTest1 (){
        Double expected = calculatorForTest.divide(num1, num2);
        Double actual = (double) (num1 / num2);
        assertEquals(expected,actual);
    }

    @Test
    public void divideTest2 (){
        Double expected = calculatorForTest.divide(num3, num4);
        Double actual = (double) (num3 / num4);
        assertEquals(expected,actual);
    }

    @Test
    public void IllegalExceptionWithDivideTest(){
        assertThrows(IllegalArgumentException.class,() -> calculatorForTest.divide(num1, 0));
    }
}
