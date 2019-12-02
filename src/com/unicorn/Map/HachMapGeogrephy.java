package com.unicorn.Map;

import org.w3c.dom.ls.LSOutput;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HachMapGeogrephy {
    public static void main (String[] args) {
        HashMap<String, Integer> geography = new HashMap<>();

        geography.put("Бразилия", 210758615);
        geography.put("Китай", 1400031000);
        geography.put("Россия", 146780720);
        geography.put("США", 331427186);
        geography.put("Япония", 126577691);
        geography.put("Египет", 99663000);
        geography.put("Польша", 38313035);
        geography.put("Белоруссия", 9475600);
        geography.put("Швейцария", 8570146);
        geography.put("Дания", 5762082);
        geography.put("Франция", 68859599);
        geography.put("Эстония", 1324820);

        System.out.println(geography);
//        Set<String> keys=geography.keySet();
//        Collection<Integer> values=geography.values();

        for(Map.Entry<String, Integer> geogr: geography.entrySet()) {
            if (geogr.getValue()>50000000){
//            if(geogr.getValue()<3000000){
                System.out.println(geogr);
            }
        }

    }
}
