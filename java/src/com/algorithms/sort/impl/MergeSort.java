package com.algorithms.sort.impl;

import com.algorithms.sort.Sortable;
import com.algorithms.sort.Sorting;

public class MergeSort extends Sorting implements Sortable {

    // Auxiliary array
    private static Comparable[] aux;

    @Override
    public void sort(Comparable[] arr) {
        aux = new Comparable[arr.length];
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(Comparable[] a, int left, int right) {
       if (right <= left) return;

       int mid = left + (right - left) / 2;
       sort(a, left, mid);
       sort(a, mid + 1, right);
       merge(a, left, mid, right);
    }

    private static void merge(Comparable[] a, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        Comparable[] L = new Comparable[n1];
        Comparable[] R = new Comparable[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = a[left + 1];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = a[middle + 1 + i];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (less(L[i], R[j])) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
            }
            k++;
        }

        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = L[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Integer[] x = new Integer[] {92,14,4,523,54,23};
        aux = new Comparable[x.length];
        merge(x, 0, 2, 5);
        show(x);
    }

}
