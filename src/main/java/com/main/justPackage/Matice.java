package com.main.justPackage;

public class Matice {
    public static int soucetPrvkuPodHlavniDiagonalou(int[][] arr) {
        int vysledek = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                vysledek += arr[i][j];
            }
        }

        return vysledek;
    }
}
