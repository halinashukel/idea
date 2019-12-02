package com.unicorn.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Add {
    public static void main(String[] args) {
        List<String> list1= new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> list2 = new ArrayList<>(Arrays.asList("B", "C", "D", "E", "F"));
        LinkedHashSet<String> list= new LinkedHashSet<>();
        list.addAll(list2);
        list.addAll(list1);
        System.out.println(list);

    }

}
