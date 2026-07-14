package com.fm.opptest2;

public class Student extends Person {
    //年级
    private String grade;

    //空参构造方法
    public Student() {
    }
    //带参构造方法
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;    
    }

    //setters and getters
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getGrade() {
        return grade;
    }
    //行为学习
    public void study() {
        System.out.println("学习");
    }
}
