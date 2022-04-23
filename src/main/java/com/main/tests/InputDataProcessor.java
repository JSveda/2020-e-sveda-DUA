package com.main.tests;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class InputDataProcessor {
    @Test
    public void isCorrect() {
        File request = new File("src/main/java/com/main/files/cteniZeVstupu.txt");
        int[] correctResult = new int[] {1, 10};
        int[] response = Testers.getMethodResult(request);
        assertEquals(correctResult, response);
    }
}
