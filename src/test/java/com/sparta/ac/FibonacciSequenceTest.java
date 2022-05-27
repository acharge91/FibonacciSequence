package com.sparta.ac;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciSequenceTest {
    @Test
    @DisplayName("check number returned is 0")
    void checkNumberReturnedIs0(){
        Assertions.assertEquals(0, FibonacciSequence.getFibonacciNumberAtIndex(1));
    }
    @Test
    @DisplayName("check number returned is 1")
    void checkNumberReturnedIs1(){
        Assertions.assertEquals(1, FibonacciSequence.getFibonacciNumberAtIndex(2));
    }
    @Test
    @DisplayName("check number returned is 2")
    void checkNumberReturnedIs2(){
        Assertions.assertEquals(1, FibonacciSequence.getFibonacciNumberAtIndex(3));
    }
    @Test
    @DisplayName("check number returned is 3")
    void checkNumberReturnedIs5(){
        Assertions.assertEquals(2, FibonacciSequence.getFibonacciNumberAtIndex(4));
    }
    @Test
    @DisplayName("check number returned is 377")
    void checkNumberReturnedIs377(){
        Assertions.assertEquals(377, FibonacciSequence.getFibonacciNumberAtIndex(15));
    }
    @Test
    @DisplayName("check null value returns 0")
    void checkNullValueReturns0(){
        Assertions.assertEquals(0, FibonacciSequence.getFibonacciNumberAtIndex(null));
    }
    @Test
    @DisplayName("check negative value returns 0")
    void checkNegativeValueReturns0(){
        Assertions.assertEquals(0, FibonacciSequence.getFibonacciNumberAtIndex(-1));
    }
    @Test
    @DisplayName("return first 5 numbers in fibonacci")
    void returnFirst5NumbersInFibonacci(){
        ArrayList<Integer> testOne = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3));
        Assertions.assertArrayEquals(testOne.toArray(), FibonacciSequence.getFibonacciSequence(5).toArray());
    }
    @Test
    @DisplayName("return first 10 numbers in fibonacci")
    void returnFirst10NumbersInFibonacci(){
        ArrayList<Integer> testOne = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34));
        Assertions.assertArrayEquals(testOne.toArray(), FibonacciSequence.getFibonacciSequence(10).toArray());
    }
    @Test
    @DisplayName("return first 0 for negative position")
    void return0ForNegativePosition(){
        Assertions.assertEquals(0, FibonacciSequence.getFibonacciNumberAtIndex(-3));
    }
}