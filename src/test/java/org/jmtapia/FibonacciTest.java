package org.jmtapia;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases:
 * fibonacci 0 -> 0
 * fibonacci 1 -> 1
 * fibonacci 2 -> 1
 * fibonacci 3 -> 2
 * fibonacci 9 -> 34
 */


public class FibonacciTest {

    private Fibonacci fib;

    @BeforeEach
    public void setUp() {
        fib = new Fibonacci();
    }

    @AfterEach
    public void finish(){
        fib = null;
    }

    @Test
    public void shouldComputeReturnZeroIfTheNumberIsZero(){
        Fibonacci fib = new Fibonacci();
        int expectedValue = 0;
        int obtainedValue = fib.compute(0);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnTwoIfTheNumberIsOne(){
        Fibonacci fib = new Fibonacci();
        int expectedValue = 1;
        int obtainedValue = fib.compute(2);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnTwoIfTheNumberIsThree(){
        Fibonacci fib = new Fibonacci();
        int expectedValue = 2;
        int obtainedValue = fib.compute(3);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnThirtyFourIfTheNumberIsNine(){
        Fibonacci fib = new Fibonacci();
        int expectedValue = 34;
        int obtainedValue = fib.compute(9);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturn832040IfTheNumberIsThirty(){
        Fibonacci fib = new Fibonacci();
        int expectedValue = 832040;
        int obtainedValue = fib.compute(30);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeOfAnNegativeNumberRaiseAnException() {
        assertThrows(RuntimeException.class, () -> fib.compute(-1));
    }
}
