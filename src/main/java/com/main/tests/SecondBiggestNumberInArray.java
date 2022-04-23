package com.main.tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SecondBiggestNumberInArray {
    @Test
    public void isCorrect() {
        int[] request = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int correctResult = 9;
        int response = Testers.getMethodResult(request);
        assertEquals(correctResult, response);
    }
}
