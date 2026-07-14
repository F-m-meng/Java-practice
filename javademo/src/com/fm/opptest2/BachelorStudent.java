package com.fm.opptest2;

public class BachelorStudent extends Student {

    //空参构造
    public BachelorStudent() {
    }
    //带参构造
    public BachelorStudent(String name, int age, String grade) {
        super(name, age, grade);
    }
    //重写学习方法
    @Override
    public void study() {
        System.out.println("本科生学习");
    }
    
    
}
