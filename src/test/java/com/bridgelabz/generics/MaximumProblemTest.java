package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProblemTest {

    @Test
    public void givenIntegerMaxNumber_WhenAtFirstPos_ShouldReturnSameNumber() {
        Assert.assertSame(3, MaximumProblem.testMaximum(3, 2, 1 ));
    }
}
