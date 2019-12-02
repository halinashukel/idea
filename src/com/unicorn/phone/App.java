package com.unicorn.phone;

import com.unicorn.NameTreeSet;
import com.unicorn.PriceComparator;

import java.util.ArrayList;
import java.util.TreeSet;

public class App {
    public static void main(String[] args){

        Phone p1=new Phone("Sony", 300);
        Phone p2=new Phone("Nokia", 100);
        Phone p3=new Phone("Samsung", 1000);
        Phone p4=new Phone("Apple", 800);
        Phone p5=new Phone("Sony", 900);

        TreeSet<Phone> phones=new TreeSet<>();
//        new NameTreeSet().thenComparing(new PriceComparator()).thenComparing(new PriceComparator())

        phones.add(p1);
        phones.add(p2);
        phones.add(p3);
        phones.add(p4);
        phones.add(p5);

        for (Phone p:phones
             ) {
            System.out.println(p);

        }


    }


}
