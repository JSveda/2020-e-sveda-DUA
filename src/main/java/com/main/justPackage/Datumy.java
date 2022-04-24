package com.main.justPackage;

public class Datumy {
    private static int[] mesice = new int[] {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int[] vcera(int den, int mesic, int rok) {
        mesice[2] = jePrestupny(rok) ? 29 : 28;
        if (den > 1)
            return new int[] {den-1, mesic, rok};
        if (mesic == 1)
            return new int[] {31, 12, rok-1};

        return new int[] {mesice[mesic-1], mesic-1, rok};
    }

    public static boolean jePrestupny(int rok) {
        if (rok % 100 == 0)
            return (rok % 400 == 0);

        return rok % 4 == 0;
    }
}
