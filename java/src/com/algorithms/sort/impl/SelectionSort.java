package com.algorithms.sort.impl;

import com.algorithms.sort.Sortable;
import com.algorithms.sort.Sorting;

public class SelectionSort extends Sorting implements Sortable {
    @Override
    public void sort(Comparable[] arr) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(arr[j], arr[min])) min = j;
            }
            exchange(arr, min, i);
        }

        show(arr);
    }
}
