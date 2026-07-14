package com.fm.opptest2;

public class MasterStudent extends Student {

    //空参构造
    public MasterStudent() {
    }
    //带参构造
    public MasterStudent(String name, int age, String grade) {
        super(name, age, grade);
    }
    //重写学习方法
    @Override
    public void study() {
        System.out.println("研究生学习");
    }
    //过了一段时间，硕士研究生住宿条件升级，在豪华版宿舍公寓睡觉
    @Override
    public void sleep() {
        System.out.println("硕士研究生睡豪华版宿舍公寓");
    }
}
