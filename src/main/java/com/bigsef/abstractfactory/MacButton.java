package com.bigsef.abstractfactory;

public class MacButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Clicking button from MacOS platform");
    }
}
