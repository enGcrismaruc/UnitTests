package com.endava.internship.unit.tests;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class MathTest {

    /**
     * Simple test of division function.
     * We are expecting the test to pass.
     */
    @Test
    public void divisionPositiveTest(){
        int actual = Math.division(2, 4);

        Assert.assertThat(actual,IsEqual.equalTo(0));
    }

    /**
     * Negative test. There is an ArithmeticException: divide by zero
     * thrown.
     */
    @Test
    public void divisionNegativeTest() {
        int actual = Math.division(2, 0);

        Assert.assertThat(actual,IsEqual.equalTo(0.5));
    }

    /**
     * Positive test for calculation of the average of a list's elements.
     */
    @Test
    public void averageOfListsElementsTest() {
        int actual = Math.averageOfListsElements(Arrays.asList(1, 2, 3));

        Assert.assertThat(actual, IsEqual.equalTo(2));
    }

    /**
     *  Negative test. There is an ArithmeticException: divide by zero
     * thrown because the list is empty.
     */
    @Test
    public void averageOfListsElementsNegativeTest() {
        int actual = Math.averageOfListsElements(Collections.emptyList());

        Assert.assertThat(actual, IsEqual.equalTo(0));
    }
}
