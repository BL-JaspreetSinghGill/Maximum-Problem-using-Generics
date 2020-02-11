package com.bridgelabz.generics;

public class MaximumProblem {

    public static <T extends Comparable> T testMaximum(T firstValue, T secondValue, T thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0) {
            return firstValue;
        } else if (secondValue.compareTo(thirdValue) > 0) {
            return secondValue;
        }
        return thirdValue;
    }
}
