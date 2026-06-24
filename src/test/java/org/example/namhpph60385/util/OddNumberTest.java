package org.example.namhpph60385.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OddNumberTest {


    @Test
    public void Oddnumber1to1000() {
        int result = OddNumberCalculator.calculateSumOddFrom1To1000();
        assertEquals(250000, result);
    }

    @Test
    public void Oddnumber1to10() {
        int result = OddNumberCalculator.calculateSumOddNumbers(1, 10);
        assertEquals(25, result);
    }

    @Test
    public void SingleOddNumber() {
        int result = OddNumberCalculator.calculateSumOddNumbers(5, 5);
        assertEquals(5, result);
    }

    @Test
    public void SingleEvenNumber() {

        int result = OddNumberCalculator.calculateSumOddNumbers(4, 4);
        assertEquals(0, result);
    }

    @Test
    public void InvalidRange() {
        int result = OddNumberCalculator.calculateSumOddNumbers(10, 1);
        assertEquals(0, result);
    }

    @Test
    public void StartWithEvenNumber() {
        int result = OddNumberCalculator.calculateSumOddNumbers(2, 10);
        assertEquals(24, result);
    }

    @Test
    public void EndWithEvenNumber() {
        int result = OddNumberCalculator.calculateSumOddNumbers(1, 9);
        assertEquals(25, result);
    }

    @Test
    public void NegativeRange() {
        int result = OddNumberCalculator.calculateSumOddNumbers(-5, 5);
        assertEquals(0, result);
    }

    //
}
