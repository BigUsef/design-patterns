package com.bigsef.factorymethod;

public class WindowButton  implements Button{

    @Override
    public void render() {
        System.out.println("System Button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
