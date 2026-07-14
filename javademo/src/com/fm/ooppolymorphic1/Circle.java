package com.fm.ooppolymorphic1;

public class Circle extends Shape{
    //圆周率，半径
    private double pi = 3.14;
    private double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    //getset
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRaddius(){
        return radius;
    }
    //行为
    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }
    @Override
    public double getArea() {
        return pi * radius * radius;
    }

    
}
