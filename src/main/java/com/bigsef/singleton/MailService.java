package com.bigsef.singleton;

public class MailService {
    private String key;
    public int connectionCount;

    private static MailService instance;

    private MailService(String key) {
        this.key = key;

    }


    public static MailService getInstance () {
        if (instance == null) {
            instance = new MailService("the privet key");
        }

        instance.connectionCount += 1;
        return instance;
    }
}
