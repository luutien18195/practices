package com.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Console {
    public static void println(String str) {
        String time = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(time + ": " + str);
    }

    public static void printf(String str, Object ... args) {
        String time = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.printf(time + ": " + str + "\n", args);
    }

    public static void printInfo(String algorithmsName, Runnable runner) {
        System.out.printf("=> Start %s\n", algorithmsName);
        double executeTime = getPerformanceOf(runner);
        System.out.printf("(*) %s take %f ms\n", algorithmsName, executeTime);
    }

    public static double getPerformanceOf(Runnable runner) {
        long startTime = System.currentTimeMillis();
        runner.run();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
