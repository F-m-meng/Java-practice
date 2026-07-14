package com.fm.ooppolymorphic;

public class Vehicle {
    //属性：品牌，行驶速度
    private String brand;
    private double speed;
    
    //构造方法
    public Vehicle()
    {
    	
    }
    public Vehicle(String brand,double speed)
    {
    	this.brand = brand;
    	this.speed = speed;
    }
    
    //getter和setter方法
    public void setBrand(String brand)
    {
    	this.brand = brand;
    }
    public String getBrand()
    {
    	return this.brand;
    }
    public void setSpeed(double speed)
    {
    	this.speed = speed;
    }
    public double getSpeed()
    {
    	return this.speed;
    }
    //成员方法：移动
    public void move()
    {
    }

    
}
