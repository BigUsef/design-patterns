package com.bigsef.abstractfactory;

class Application{
    private final CheckBox checkBox;
    private final Button button;

    public Application(GUIFactory factory) {
        checkBox = factory.createCheckBox();
        button = factory.createButton();
    }

    public void action() {
        button.onClick();
        checkBox.OnCheck();
    }
}

public class Client {
    private static String platform;

    private static Application configApp() {
        GUIFactory factory;
        if ("mac".equals(platform)) {
            factory = new MacFactory();
        } else {
            factory = new WinFactory();
        }

        return new Application(factory);

    }
    public static void main(String[] args) {
        System.out.println("When we initiate MacOS Application");
        platform = "mac";
        Application app1 = configApp();
        app1.action();


        System.out.println("When we initiate Windows Application");
        platform = "win";
        Application app2 = configApp();
        app2.action();

    }
}
