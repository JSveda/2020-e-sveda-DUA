package com.main.tests;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StepCounter {
    @Test
    public void isCorrect() {
        int[] request1 = new int[100];
        for (int i = 0; i < request1.length; i++) {
            request1[i] = i;
        }
        int request2 = 25;
        int correctResult = 5;
        int response = Testers.getMethodResult(request1, request2);
        assertEquals(correctResult, response);
    }
}
