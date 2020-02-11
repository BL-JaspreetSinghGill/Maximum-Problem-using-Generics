package com.bridgelabz.generics;

public class MaximumProblem {

    public static Integer testMaximum(Integer firstValue, Integer secondValue, Integer thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0) {
            return firstValue;
        } else if (secondValue.compareTo(thirdValue) > 0) {
            return secondValue;
        }
        return thirdValue;
    }

    public static Float testMaximum(Float firstValue, Float secondValue, Float thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0) {
            return firstValue;
        } else if (secondValue.compareTo(thirdValue) > 0) {
            return secondValue;
        }
        return thirdValue;
    }

    public static String testMaximum(String firstValue, String secondValue, String thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0) {
            return firstValue;
        } else if (secondValue.compareTo(thirdValue) > 0) {
            return secondValue;
        }
        return thirdValue;
    }
}
