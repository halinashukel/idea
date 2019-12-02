package com.unicorn.car;

import java.util.Stack;
import java.util.TreeSet;

public class App {
    public static  void main(String[] args){
        Car c1=new Car("BMW",200,260,6000);
        Car c2=new Car("Audi",300,300, 10000);
        Car c3=new Car("Citroen",110,200,3000);
        Car c4=new Car("Audi",200,250,6000);
        Car c5=new Car("Opel",160,200,2303);

        TreeSet<Car> cars=new TreeSet<>(new ModelComparator().thenComparing(new TopSpeedComparator()).thenComparing(new PriceComparator()));

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);

//        Stack<Car> cars=new Stack<>();
//            cars.add(c1);
//            cars.add(c2);
//            cars.add(c3);
//            cars.add(c4);
//            cars.add(c5);


        for (Car c:cars) {
            System.out.println(c);
        }


    }

}
