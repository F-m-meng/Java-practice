package com.fm.opptest2;

public class test {
    //继承（学校师生信息管理）
    public static void main(String[] args) {
        //创建一个本科生对象
        BachelorStudent bachelorStudent = new BachelorStudent("张三", 20, "大一");
        System.out.println("本科生信息：姓名：" + bachelorStudent.getName() + "，年龄：" + bachelorStudent.getAge() + "，年级：" + bachelorStudent.getGrade());
        //调用学习方法
        bachelorStudent.study();
        //调用睡觉方法
        bachelorStudent.sleep();

        //创建一个硕士研究生对象
        MasterStudent masterStudent = new MasterStudent("李四", 25, "研一");
        //调用学习方法
        masterStudent.study();
        //调用睡觉方法
        masterStudent.sleep();

        //创建一个专业课老师对象
        MajorTeacher majorTeacher = new MajorTeacher("王五", 35, "计算机");
        //调用教学方法
        majorTeacher.teach();

        //创建一个通用课老师对象
        GeneralTeacher generalTeacher = new GeneralTeacher("赵六", 30, "英语");
        //调用教学方法
        generalTeacher.teach();
    }
    
}
