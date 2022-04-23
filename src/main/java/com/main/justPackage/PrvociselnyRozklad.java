package com.main.justPackage;

import java.util.ArrayList;

public class PrvociselnyRozklad {
    public static ArrayList<Integer> prvociselnyRozklad(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int d = 2;
        int last = 0;
        while (d*d <= n) {
            if (n % d == 0) {
                if (d != last)
                    arrayList.add(d);
                last = d;
                n /= d;
            } else
                d++;
        }

        return arrayList;
    }
}
