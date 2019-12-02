package com.unicorn.car;

import java.util.Objects;

public class Car {
    private  Integer power;
    private  Integer topSpeed;
    private Integer price;
    private String model;


    public Car(String model, Integer power, Integer topSpeed, Integer price) {
        this.model = model;
        this.power = power;
        this.topSpeed = topSpeed;
        this.price = price;

    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Integer topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Model "+getModel()+", power "+getPower()+", topSpeed "+getTopSpeed()+", price "+getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(power, car.power) &&
                Objects.equals(topSpeed, car.topSpeed) &&
                Objects.equals(price, car.price) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, topSpeed, price, model);
    }
}
