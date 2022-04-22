package com.main.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePrinter {
    public static void printFile(File f) {
        Scanner sc = null;
        try {
            sc = new Scanner(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
