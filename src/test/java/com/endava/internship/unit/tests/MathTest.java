package com.endava.internship.unit.tests;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class MathTest {

    @Test
    public void divisionPositiveTest(){
        int actual = Math.division(2, 4);

        Assert.assertThat(actual,IsEqual.equalTo(0));
    }

    @Test
    public void divisionNegativeTest() {
        int actual = Math.division(2, 0);

        Assert.assertThat(actual,IsEqual.equalTo(0.5));
    }

    @Test
    public void averageOfListsElementsTest() {
        int actual = Math.averageOfListsElements(Arrays.asList(1, 2, 3));

        Assert.assertThat(actual, IsEqual.equalTo(2));
    }

    @Test
    public void averageOfListsElementsNegativeTest() {
        int actual = Math.averageOfListsElements(Collections.emptyList());

        Assert.assertThat(actual, IsEqual.equalTo(0));
    }
}
