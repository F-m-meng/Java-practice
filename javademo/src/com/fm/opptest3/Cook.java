package com.fm.opptest3;

public class Cook extends Employ {
    //构造方法
    public Cook() {
    }
    public Cook(int id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work() {
        System.out.println("炒菜");
    }
}
