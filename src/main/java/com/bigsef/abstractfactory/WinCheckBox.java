package com.bigsef.abstractfactory;

public class WinCheckBox implements CheckBox{
    @Override
    public void OnCheck() {
        System.out.println("checking a windows checkbox");
    }
}
