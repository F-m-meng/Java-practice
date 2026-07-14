package com.fm.opptest1;

public class Tutor extends Teacher{
    //构造方法
    public Tutor() {
        super();
    }
    public Tutor(int id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        System.out.println("Tutor is working");
    }
}