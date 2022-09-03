package com.bigsef.factorymethod2;

public class Train implements Transport{
    @Override
    public void move() {
        System.out.println("Move the package With Train Transportation");
    }
}
