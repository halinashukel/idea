package com.unicorn.car;

import java.util.Comparator;

public class TopSpeedComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getTopSpeed()-o2.getTopSpeed();
    }
}

