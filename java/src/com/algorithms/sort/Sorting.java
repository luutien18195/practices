package com.algorithms.sort;

import com.utils.Console;

public class Sorting {
    protected static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected static void exchange(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    protected static void show(Comparable[] a) {
        StringBuilder rs = new StringBuilder();
        for (Comparable comparable : a) {
            rs.append(comparable).append(", ");
        }
        String pStr = String.join(", ", rs.toString());
        Console.println(pStr);
    }

    protected static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i-1])) return false;
        }
        return true;
    }
}
