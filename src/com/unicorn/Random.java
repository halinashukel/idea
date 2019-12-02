package com.unicorn;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Random {
    public static void main(String[] args) {
        ArrayList<Integer> random=new ArrayList<>();
        for(int i=0; i<10000;i++){
            random.add((int) (Math.random()*100));
        }
       // System.out.println(random);
        LinkedHashMap<Integer,Integer> linkedHashMap=new LinkedHashMap<>();
        for(int j=0;j<100;j++){
            Integer count=0;
            for(Integer l:random){
                if(j==l){
                    count ++;
                }
                linkedHashMap.put(j, count);
            }

            
        }
        System.out.println(linkedHashMap);


    }

}
