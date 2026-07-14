package com.fm.opptest2;

public class Teacher extends Person {
    //科目
    private String subject;

    //空参构造方法
    public Teacher() {
    }
    //带参构造方法
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;    
    }

    //setters and getters
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
    //行为教书
    public void teach() {
        System.out.println("教书");
    }
    
}
