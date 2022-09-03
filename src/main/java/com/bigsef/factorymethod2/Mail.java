package com.bigsef.factorymethod2;

public abstract class Mail {
    public void send() {
        System.out.println("Start Sending the Package....");
        Transport transport = createTransport();
        transport.move();
    }
    public abstract Transport createTransport();
}
