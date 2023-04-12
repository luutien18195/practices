package com.algorithms.sort.impl;

import com.algorithms.sort.Sortable;
import com.algorithms.sort.Sorting;

public class InsertionSort extends Sorting implements Sortable {
    @Override
    public void sort(Comparable[] arr) {
        int N = arr.length;
        for (int i = 1; i < N; i++) {
           for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j --)
               exchange(arr, j, j - 1);
        }
        show(arr);
    }
}
