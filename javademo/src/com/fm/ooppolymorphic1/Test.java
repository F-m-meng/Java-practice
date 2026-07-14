package com.fm.ooppolymorphic1;

public class Test {
    public static void main(String[] args) {
        //要求：学生使用图形的方法，既能使用长方形，又能使用圆形
        Student s1 = new Student("张三",18);
        Rectangle r1 = new Rectangle(10, 20);
        s1.useShape(r1);
        Circle c1 = new Circle(10);
        s1.useShape(c1);
    
        
    }
    
}
