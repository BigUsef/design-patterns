package com.bigsef.factorymethod;

public class WindowDialog  extends Dialog{
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
