package com.unicorn.java.abc.App;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Application {
    public static void main(String[] args){
        Dog d1=new Dog("Bob","Gold", 3);
        Dog d2=new Dog("Robert","Black", 2);
        Dog d3=new Dog("Daisy","Brown", 4);
        Dog d4=new Dog("Bim","White", 3);
        Dog d5=new Dog("Molly","White", 2);
        Dog d6=new Dog("Fred","Black", 5);

//        ArrayList<Dog> dogs=new ArrayList<>();
        HashSet<Dog> dogs =new HashSet<>();

        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);
        dogs.add(d4);
        dogs.add(d5);
        dogs.add(d6);

//        for (Dog d:dogs) {
//            System.out.println(d);
//
//        }
        Iterator<Dog> iter=dogs.iterator();
        while (iter.hasNext()){

            System.out.println(iter.next());
        }




    }

}
