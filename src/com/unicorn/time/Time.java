package com.unicorn.time;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Time {
    public static void main(String[] args) {
        TreeSet<Integer> arr = new TreeSet<>();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            arr.add((int) (Math.random() * 10000000));
        }

        System.out.println("Добавление TreeSet " + (System.currentTimeMillis() - startTime));


        long startTime1 = System.currentTimeMillis();

        Iterator<Integer> iter = arr.iterator();
        while (iter.hasNext()) {
            Integer next = iter.next();
        }

        System.out.println("Пoлучение TreeSet " + (System.currentTimeMillis() - startTime1));

        long startTime2 = System.currentTimeMillis();

        for (int k = 0; k < 1000000; k++) {
            arr.contains((int) (Math.random() * 1000000));

        }
        System.out.println("Поиск TreeSet " + (System.currentTimeMillis() - startTime2));

        long startTime3 = System.currentTimeMillis();

        Iterator<Integer> t = arr.iterator();
        while (t.hasNext()) {
            t.next();
            t.remove();
        }
        System.out.println("Удаление TreeSet " + (System.currentTimeMillis() - startTime3));


        HashSet<Integer> arr1 = new HashSet<>();
        long startTimeHash = System.currentTimeMillis();

        for (int j = 0; j < 1000000; j++) {
            arr1.add((int) (Math.random() * 1000000));
        }

        System.out.println("Добавление HashSet " + (System.currentTimeMillis() - startTimeHash));


        long startTimeHash1 = System.currentTimeMillis();

        Iterator<Integer> it = arr1.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
        }

        System.out.println("Пoлучение HashSet " + (System.currentTimeMillis() - startTimeHash1));

        long startTimeHash2 = System.currentTimeMillis();

        for (int k = 0; k < 1000000; k++) {
            arr1.contains((int) (Math.random() * 1000000));

        }
        System.out.println("Поиск HashSet " + (System.currentTimeMillis() - startTimeHash2));

        long startTimeHash3 = System.currentTimeMillis();

        Iterator<Integer> tt = arr1.iterator();
        while (tt.hasNext()) {
            tt.next();
            tt.remove();

        }
        System.out.println("Удаление HashSet " + (System.currentTimeMillis() - startTimeHash3));


    }

}
