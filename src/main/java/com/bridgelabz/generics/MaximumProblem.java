package com.bridgelabz.generics;

public class MaximumProblem<T extends Comparable> {

    T firstValue;
    T secondValue;
    T thirdValue;

    public MaximumProblem(T firstValue, T secondValue, T thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public <T extends Comparable> T testMaximum() {
        return (T) testMaximum(firstValue, secondValue, thirdValue);
    }

    public static <T extends Comparable> T testMaximum(T firstValue, T secondValue, T thirdValue, T... optionalValues) {
        T maxValue;
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0) {
             maxValue = firstValue;
        } else if (secondValue.compareTo(thirdValue) > 0) {
            maxValue = secondValue;
        } else {
            maxValue = thirdValue;
        }
        if (optionalValues.length != 0) {
            maxValue = checkForMaximumIncludingOptionalValues(maxValue, optionalValues);
        }
        return maxValue;
    }

    public static <T extends Comparable> T checkForMaximumIncludingOptionalValues(T maxValue, T... optionalValues) {
        for (T value: optionalValues) {
            if (value.compareTo(maxValue) > 0) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
