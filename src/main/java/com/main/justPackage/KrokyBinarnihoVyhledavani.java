package com.main.justPackage;

public class KrokyBinarnihoVyhledavani {
    public static int pocetKrokuBinarnihoVyhledavani(int[] arr, int n) {
        int pocetKroku = 0;
        int l = 0;
        int p = arr.length-1;
        int s = (l + p) / 2;
        while (l<p && arr[s] != n) {
            if (n < arr[s])
                p = s - 1;
            else
                l = s + 1;

            s = (l + p) / 2;
            pocetKroku++;
        }

        return pocetKroku;
    }
}
