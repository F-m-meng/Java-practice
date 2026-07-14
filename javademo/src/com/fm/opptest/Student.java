package com.fm.opptest;

public class Student {
    //定义一个类表示学生属性
    private String name;//学生姓名
    private double weight;//体重
    private int age;//年龄
    private double height;//身高

    //构造方法
    //习惯 空参
    public Student() {
        
    }

    //带全部参数的构造
    public Student(String name, double weight, int age, double height) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.height = height;
    }








    //get/set方法
    //姓名
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    //体重
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    //年龄
    //赋值
    public void setAge(int age) {
        if (age > 0 && age < 40) {
            this.age = age;
        }else {
            System.out.println("年龄不合法");
        }
        
    }
    //获取
    public int getAge() {
        return age;
    }
    //身高
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }   


    //行为
    public void study() {
        System.out.println( name + "刚进大学努力学习");
    }
    

}
