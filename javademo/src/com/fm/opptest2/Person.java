package com.fm.opptest2;

public class Person {
    private String name;
    private int age;

    //空参构造方法
    public Person() {
    }
    //带参构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    //行为吃饭，睡觉
    public void eat() {
        System.out.println("吃饭");
    }
    public void sleep() {
        System.out.println("睡觉");
    }
}
