package com.bigsef.prototype;

public class Rectangle extends Shape{
    public double width;
    public double height;

    public Rectangle () {

    }

    public Rectangle(Rectangle target) {
        super(target);
        this.width = target.width;
        this.height = target.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
