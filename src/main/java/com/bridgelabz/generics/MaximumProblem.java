package com.bridgelabz.generics;

public class MaximumProblem {

    public static Integer testMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0) {
            return firstNumber;
        } else if (secondNumber.compareTo(thirdNumber) > 0) {
            return secondNumber;
        }
        return thirdNumber;
    }
}
