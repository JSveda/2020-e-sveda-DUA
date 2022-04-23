package com.main.tests;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PrimeDecomposition {
    @Test
    public void isCorrect() {
        int request = 100;
        ArrayList<Integer> correctResult = new ArrayList<>();
        correctResult.add(2);
        correctResult.add(5);
        ArrayList<Integer> response = Testers.getMethodResult(request);
        assertEquals(correctResult, response);
    }
}
