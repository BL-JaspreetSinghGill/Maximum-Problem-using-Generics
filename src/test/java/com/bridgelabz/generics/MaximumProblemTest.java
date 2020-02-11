package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProblemTest {

    @Test
    public void givenIntegerMaxNumber_WhenAtFirstPos_ShouldReturnSameNumber() {
        Assert.assertSame(3, MaximumProblem.testMaximum(3, 2, 1 ));
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtSecondPos_ShouldReturnSameNumber() {
        Assert.assertSame(10, MaximumProblem.testMaximum(5, 10, 7 ));
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtThirdPos_ShouldReturnSameNumber() {
        Assert.assertSame(50, MaximumProblem.testMaximum(30, 40, 50 ));
    }

    @Test
    public void givenFloatMaxNumber_WhenAtFirstPos_ShouldReturnSameNumber() {
        Assert.assertEquals(3.1f, MaximumProblem.testMaximum(3.1f, 2.2f, 1.3f ), 0.0f);
    }

    @Test
    public void givenFloatMaxNumber_WhenAtSecondPos_ShouldReturnSameNumber() {
        Assert.assertEquals(10.5f, MaximumProblem.testMaximum(5.4f, 10.5f, 7.6f ), 0.0f);
    }

    @Test
    public void givenFloatMaxNumber_WhenAtThirdPos_ShouldReturnSameNumber() {
        Assert.assertEquals(50.9f, MaximumProblem.testMaximum(30.7f, 40.8f, 50.9f ), 0.0f);
    }
}

