package com.algorithms.sort.impl;

import com.algorithms.sort.Sortable;
import com.algorithms.sort.Sorting;

public class MergeSort extends Sorting implements Sortable {

    // Auxiliary array
    private static Comparable[] aux;

    @Override
    public void sort(Comparable[] arr) {
        aux = new Comparable[arr.length];
        mergeSort(arr, 0, arr.length - 1);
        show(arr);
    }

    private static void mergeSort(Comparable[] a, int l, int r) {
       if (l < r) {
           int mid = (r + l) / 2;
           mergeSort(a, l, mid);
           mergeSort(a, mid + 1, r);
           merge(a, l, mid, r);
       }
    }

    private static void merge(Comparable[] a, int left, int middle, int right) {
        for (int i = left; i <= right; i++) {
            aux[i] = a[i];
        }

        int i = left, j = middle + 1, k = left;
        while (i <= middle && j <= right) {
            if (less(aux[i], aux[j])) {
                a[k] = aux[i];
                i++;
            } else {
                a[k] = aux[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            a[k] = aux[i];
            k++;
            i++;
        }
    }
}
