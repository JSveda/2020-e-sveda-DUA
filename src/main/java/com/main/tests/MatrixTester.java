package com.main.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixTester {
    @Test
    public void isCorrect() {
        int[][] request = new int[][] {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int correctResult = 6;
        int response = Testers.getMethodResult(request);
        assertEquals(correctResult, response);
    }
}
