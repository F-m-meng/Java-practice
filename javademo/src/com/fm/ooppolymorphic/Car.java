package com.fm.ooppolymorphic;

public class Car extends Vehicle{
    public  Car() {
    	
    }
    public  Car(String brand,double speed) {
        super(brand, speed);
    }
    //鸣笛honk（）
    public void honk() {
        System.out.println(getBrand()+"的汽车正在以"+getSpeed()+"的时速行驶");
        System.out.println("正在鸣笛...");
    }
}
