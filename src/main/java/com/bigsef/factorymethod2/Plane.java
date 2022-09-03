package com.bigsef.factorymethod2;

public class Plane  implements Transport{
    @Override
    public void move() {
        System.out.println("Move the package With Plane Transportation");
    }
}
