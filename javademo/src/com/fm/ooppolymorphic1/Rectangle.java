package com.fm.ooppolymorphic1;

public class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle() {
    }
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //行为计算周长，计算面积
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
    @Override
    public double getArea() {
        return width * height;
    }
    
}
