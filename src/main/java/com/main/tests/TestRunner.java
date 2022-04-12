package com.main.tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static boolean test(Class<?> c) {
        Result result = JUnitCore.runClasses(c);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        return result.wasSuccessful();
    }
}
