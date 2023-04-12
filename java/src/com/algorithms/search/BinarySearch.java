package com.algorithms.search;


public class BinarySearch implements Searchable {
    private static BinarySearch instance;

    private BinarySearch() {}

    public static BinarySearch getInstance() {
        if (instance == null) {
            synchronized (BinarySearch.class) {
                instance = new BinarySearch();
            }
        }
        return instance;
    }

    @Override
    public boolean isContain(Integer key, Integer[] a) {
        if (a.length == 0) return false;

        int f = 0;
        int l = a.length - 1;
        while(f <= l) {
            int mid = f + (l - f) / 2;
            if (key < a[mid]) l = mid - 1;
            else if (key > a[mid]) f = mid + 1;
            else return true;
        }
        return false;
    }
}
