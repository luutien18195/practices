package com.algorithms;

import com.algorithms.search.BinarySearch;
import com.algorithms.sort.impl.InsertionSort;
import com.algorithms.sort.impl.SelectionSort;
import com.algorithms.sort.impl.ShellSort;

public class Main {
    private static final Integer[] ARRAY = {44,5,22,23,61,3,54,76,52,3,68,9,43,58,23,53,11,45,80,9};
    private static final int KEY = 43;

    public static void main(String[] args) {
        Algorithms al = new Algorithms.AlBuilder()
            .addSortInstances(new SelectionSort())
            .addSortInstances(new InsertionSort())
            .addSortInstances(new ShellSort())
            .withSearchInstance(BinarySearch.getInstance())
            .build();

//        al.executeSortAndCompareWithTarget(ARRAY, InsertionSort.class);
        al.executeSort(ARRAY);
    }
}
