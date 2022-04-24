package com.main.justPackage;

public class PosouvacPrvku {
    public static int[] posunDozadu(int[] arr, int pocetKroku) {
        pocetKroku %= arr.length;
        for (int i = 0; i < pocetKroku; i++) {
            int prvniPrvek = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j];
            }

            arr[arr.length - 1] = prvniPrvek;
        }

        return arr;
    }
}
