package com.fm.opptest3;

public class Employ {
    //工号，姓名，工资
    private int id;
    private String name;
    private double salary;
    //构造方法
    public Employ() {
    }

    public Employ(int id, String name, double salary) {
        this.id = id;
        this.name = name;   
        this.salary = salary;
    }
    //set和get方法
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    //行为
    public void work() {
        System.out.println("工作");
    }
    public void eat() {
        System.out.println("吃米饭");
    }
}

    

