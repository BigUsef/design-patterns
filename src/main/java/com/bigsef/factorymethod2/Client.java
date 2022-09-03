package com.bigsef.factorymethod2;

public class Client {
    public static void main(String[] args) {
        System.out.println("Sending package by Air");
        AirMail airMail = new AirMail();
        airMail.send();

        System.out.println("Sending package by ground with train");
        GroundMail groundMail = new GroundMail("train");
        groundMail.send();

        System.out.println("Sending package by ground with truck");
        GroundMail groundMail1 = new GroundMail("truck");
        groundMail1.send();
    }
}
