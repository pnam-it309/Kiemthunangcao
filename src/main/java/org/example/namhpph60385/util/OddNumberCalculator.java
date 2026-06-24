package org.example.namhpph60385.util;

public class OddNumberCalculator {

    public static int calculateSumOddNumbers(int start, int end) {
        if (start > end) {
            return 0;
        }
        
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int calculateSumOddFrom1To1000() {
        return calculateSumOddNumbers(1, 1000);
    }
}
