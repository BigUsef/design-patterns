package com.bigsef.abstractfactory;

public class MacCheckBox implements CheckBox{
    @Override
    public void OnCheck() {
        System.out.println("checking MacOS checkbox");
    }
}
