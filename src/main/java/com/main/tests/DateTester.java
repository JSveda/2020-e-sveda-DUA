package com.main.tests;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DateTester {
    @Test
    public void isCorrect() {
        int day = 1;
        int month = 1;
        int year = 2022;
        int[] correctResult1 = new int[] {31, 12, 2021};
        int[] response1 = Testers.getMethodResult(day, month, year);

        day = 3;
        month = 2;
        int[] correctResult2 = new int[] {2, 2, 2022};
        int[] response2 = Testers.getMethodResult(day, month, year);

        day = 1;
        month = 3;
        year = 2000;
        int[] correctResult3 = new int[] {29, 2, 2000};
        int[] response3 = Testers.getMethodResult(day, month, year);

        String correctAnswer = Arrays.toString(correctResult1) + " " + Arrays.toString(correctResult2) + " " + Arrays.toString(correctResult3);
        String finalResponse = Arrays.toString(response1) + " " + Arrays.toString(response2) + " " + Arrays.toString(response3);

        assertEquals(correctAnswer, finalResponse);
    }
}
