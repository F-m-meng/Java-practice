package com.fm.opptest1;

public class Employee {
    //属性
    private int id;
    private String name;

    //构造方法
    public Employee() {
    }
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //get/set方法
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    //行为（工作）
    public void work(){
        System.out.println("工作");
    }
    
}
