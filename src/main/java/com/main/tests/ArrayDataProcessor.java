package com.main.tests;

import org.junit.Test;

import java.io.File;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArrayDataProcessor {
    @Test
    public void isCorrect() {
        int[] request1 = new int[] {1, 2, 3, 4};
        int request2 = 5;
        int[] correctResult = new int[] {2, 3, 4, 1};
        int[] response = Testers.getMethodResult(request1, request2);
        assertEquals(Arrays.toString(correctResult), Arrays.toString(response));
    }
}
