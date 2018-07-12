package com.endava.internship.unit.tests;

import java.util.List;

public class Math {

    public static int division(int a, int b) {
        return a / b;
    }

    public static int averageOfListsElements(List<Integer> integers) {
        int sumOfElements = integers.stream().reduce((integer, integer2) -> integer + integer2)
                .orElse(0);

        return sumOfElements / integers.size();
    }
}
