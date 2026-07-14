package com.fm.opptest2;

public class MajorTeacher extends Teacher {

    //空参构造
    public MajorTeacher() {
    }
    //带参构造
    public MajorTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }
    //重写教学方法
    @Override
    public void teach() {
        System.out.println("专业课老师教学");
    }
    
}
