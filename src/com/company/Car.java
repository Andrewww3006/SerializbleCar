package com.company;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private double speed;
    private double price;

    public Car(String brand, double speed, double price)
    {
        this.brand = brand;
        this.speed = speed;
        this.price = price;

    }
    public String getBrand(){
        return brand;
    }

    public  void  setBrand(String brand){
        this.brand = brand;
    }

    public  double getSpeed(){
        return speed;
    }

    public  void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
