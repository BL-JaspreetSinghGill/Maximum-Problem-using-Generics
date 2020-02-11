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

    public static <T extends Comparable> T testMaximum(T firstValue, T secondValue, T thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0) {
            return firstValue;
        } else if (secondValue.compareTo(thirdValue) > 0) {
            return secondValue;
        }
        return thirdValue;
    }
}
