package com.unicorn;

import com.unicorn.phone.Phone;

import java.util.Comparator;

public class NameTreeSet implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        return o1.getModel().compareTo(o2.getModel());
    }

}
