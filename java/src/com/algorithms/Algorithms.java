package com.algorithms;

import com.algorithms.search.Searchable;
import com.algorithms.sort.Sortable;
import com.utils.Console;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Algorithms {
     private Algorithms(){}
     private Searchable searchable;
     private List<Sortable> sortableList;

     public static class AlBuilder {
        private Searchable search;
        private List<Sortable> sorts;
        public AlBuilder() {}

        public AlBuilder withSearchInstance(Searchable s) {
            search = s;
            return this;
        }

        public AlBuilder addSortInstances(Sortable s) {
            if (sorts == null || sorts.isEmpty()) {
                sorts = new ArrayList<>();
            }
            sorts.add(s);
            return this;
        }

        public Algorithms build() {
            Algorithms a = new Algorithms();
            a.searchable = search;
            a.sortableList = sorts;
            return a;
        }
    }

    public void executeSearch(Integer[] arr, Integer key) {
        Arrays.sort(arr);
        Console.println("Sorted array -> " + Arrays.toString(arr));

        if (searchable.isContain(key, arr)) Console.println("Find " + key + " success! ");
        else Console.println("Not found " + key + " in array");
    }

    public void executeSort(Comparable[] arr) {
         if (sortableList == null || sortableList.isEmpty()) {
             Console.println("Not found any sortable instance");
             return;
         }
         sortableList.forEach(s -> Console.printInfo(s.getClass().getName(), () -> s.sort(arr.clone())));
    }

    public void executeSortAndCompareWithTarget(Comparable[] arr, Class<?> target) {
        if (sortableList == null || sortableList.isEmpty()) {
            Console.println("Not found any sortable instance");
            return;
        }
        AtomicReference<Double> targetTime = new AtomicReference<>((double) 0);
        Map<String, Double> mapTime = new HashMap<>();
        sortableList.forEach(s -> {
            double t = Console.getPerformanceOf(() -> s.sort(arr.clone()));
            if (target.getName().equals(s.getClass().getName())) {
                targetTime.set(t);
            } else {
                mapTime.put(s.getClass().getName(), t);
            }
        });

        Console.println("Summary");
        mapTime.forEach((s, l) -> {
            Console.printf("%s is times %.1f faster than %s", target.getName(), targetTime.get()/l, s);
        });
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
