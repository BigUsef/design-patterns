package com.bigsef.factorymethod2;

public class AirMail extends Mail{
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
