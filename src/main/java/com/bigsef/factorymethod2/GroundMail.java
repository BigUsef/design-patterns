package com.bigsef.factorymethod2;

public class GroundMail extends Mail{
    private final String transportType;

    public GroundMail(String transportType) {
        this.transportType = transportType;
    }

    @Override
    public Transport createTransport() {
        if ("train".equals(transportType)){
            return new Train();
        } else {
            return new Truck();
        }
    }
}
