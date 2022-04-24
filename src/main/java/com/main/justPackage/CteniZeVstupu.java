package com.main.justPackage;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CteniZeVstupu {
    public static int[] minMaxZeVstupu(File file) {
        int[] arr = new int[2];
        arr[0] = -1; // reprezentuje minimum
        arr[1] = -1; // reprezentuje maximum
        int cislo;

        try (Scanner scanner = new Scanner(file, StandardCharsets.UTF_8)) {
            if (scanner.hasNext()) {
                cislo = scanner.nextInt();
                arr[0] = cislo;
                arr[1] = cislo;

                while (scanner.hasNext()) {
                    cislo = scanner.nextInt();
                    if (cislo > arr[1])
                        arr[1] = cislo;
                    if (cislo < arr[0])
                        arr[0] = cislo;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arr;
    }
}
