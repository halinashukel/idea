package com.unicorn.phone;

import java.util.Objects;
import java.util.TreeSet;

public class Phone implements Comparable<Phone> {
    private String model;
    private  Integer price;

    public Phone(String model, Integer price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(model, phone.model) &&
                Objects.equals(price, phone.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

    @Override
    public int compareTo(Phone phone) {
        return this.getPrice()-phone.getPrice();
    }
}
