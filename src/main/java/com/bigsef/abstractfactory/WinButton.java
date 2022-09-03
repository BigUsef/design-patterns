package com.bigsef.abstractfactory;

public class WinButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Clicking Button from Windows Platform");
    }
}
