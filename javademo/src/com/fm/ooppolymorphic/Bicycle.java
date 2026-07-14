package com.fm.ooppolymorphic;

public class Bicycle extends Vehicle {
    //构造方法
    public Bicycle() {
    
    }
    public Bicycle(String brand, double speed) {
        super(brand, speed);
    }
    //响铃
    public void ringBell() {
        System.out.println(getBrand()+"的自行车正在以"+getSpeed()+"km/h的速度行驶");
        System.out.println("正在响铃...");
    }
}
