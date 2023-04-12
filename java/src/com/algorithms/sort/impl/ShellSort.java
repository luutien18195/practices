package com.algorithms.sort.impl;

import com.algorithms.sort.Sortable;
import com.algorithms.sort.Sorting;

public class ShellSort extends Sorting implements Sortable {

    @Override
    public void sort(Comparable[] arr) {
        int N = arr.length;
        int gap = 1;
        while (gap < N/3) gap = gap * 3 + 1; // 1 ,4 , 13, 40, 121, 364, 1093 ...
        while (gap >= 1) {
            for (int i = gap; i < N; i++) {
                for (int j = i; j >= gap && less(arr[j], arr[j - gap]); j-=gap)
                    exchange(arr, j, j - gap);
            }
            gap/=3;
        }

        show(arr);
    }
}
