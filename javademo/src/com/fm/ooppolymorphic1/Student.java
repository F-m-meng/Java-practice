package com.fm.ooppolymorphic1;

public class Student {
    //姓名，年龄
    private String name;
    private int age;
    
    public Student() {
    }
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //使用图形，打印图形信息，并打印周长和面积
    public void useShape(Shape shape) {
        if(shape instanceof Rectangle ){
            System.out.println("长方形" );
        }else if(shape instanceof Circle) {
            System.out.println("圆形" );
        }
            System.out.println("周长：" + shape.getPerimeter());
            System.out.println("面积：" + shape.getArea());
    }
    
}
