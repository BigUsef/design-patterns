package com.bigsef.singleton;

public class Client {
    public static void main(String[] args) {

        MailService mailService = MailService.getInstance();
        System.out.println(mailService.connectionCount);


        MailService anotherMailService = MailService.getInstance();
        System.out.println(anotherMailService.connectionCount);

    }
}
