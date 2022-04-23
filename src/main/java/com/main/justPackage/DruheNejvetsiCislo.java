package com.main.justPackage;

public class DruheNejvetsiCislo {
    public static int druheNejvetsiCislo(int[] arr) {
        int max = -1, max2 = -1;
        for (int element : arr) {
            if (element > max) {
                max2 = max;
                max = element;
            } else if (element > max2)
                max2 = element;
        }

        return max2;
    }
}

