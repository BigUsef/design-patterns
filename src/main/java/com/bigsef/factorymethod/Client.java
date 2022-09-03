package com.bigsef.factorymethod;

public class Client {
    private static String platform;
    private static Dialog dialog;
    
    public static void main(String[] args) {
        System.out.println("Window example");
        platform = "window";
        configure();
        runBusinessLogic();

        System.out.println("HTML example");
        platform = "html";
        configure();
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

    private static void configure() {
        if ("html".equals(platform)) {
            dialog = new HTMLDialog();
        } else {
            dialog = new WindowDialog();
        }
    }
}
