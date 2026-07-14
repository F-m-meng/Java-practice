package com.fm.opptest2;

public class GeneralTeacher extends Teacher {

    //空参构造
    public GeneralTeacher() {
    }
    //带参构造
    public GeneralTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }
    //重写教学方法
    @Override
    public void teach() {
        System.out.println("通用课老师教学");
    }
    
}
