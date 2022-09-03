package com.bigsef.factorymethod2;

public class Truck implements Transport{
    @Override
    public void move() {
        System.out.println("Move the package With Truck Transportation");
    }
}
