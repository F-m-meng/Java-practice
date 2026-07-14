package com.fm.opptest1;

public class Lecturer extends Teacher {
    //构造方法
    //空参
    public Lecturer() {
    
    }
    //带参
    public Lecturer(int id, String name) {
        super(id, name);
    }
    //行为
    @Override
    public void work() {
        System.out.println("Lecturer is working");
    }
    
}
