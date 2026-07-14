package com.fm.opptest;

public class test {
    public static void main(String[] args) {
        //创建对象记录第一个学生的信息
        Student s1 = new Student();
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getHeight());
        System.out.println(s1.getWeight());

        Student s2 = new Student("李四", 70, 20, 180);
        System.out.println(s2.getName() + "，" + s2.getAge() + "岁，" + s2.getHeight() + "cm，" + s2.getWeight() );
        //s1.setName("张三");
        //s1.setWeight(60);
        //s1.setAge(18);
        //s1.setHeight(183);
       
        /* 
        //隐藏逻辑，年龄每年＋1
        //大一新生，张三，18岁，183cm，60kg，刚进大学努力学习
        System.out.println(s1.getName() + "，" + s1.getAge() + "岁，" + s1.getHeight() + "cm，" + s1.getWeight() );
        s1.study();
        //大二期间张三体重增加了10kg
        s1.setAge(s1.getAge() + 1);
        double newWeight = s1.getWeight() + 10;
        s1.setWeight(newWeight);
        System.out.println(s1.getName() + "，" + s1.getAge() + "岁，" + s1.getHeight() + "cm，" + s1.getWeight() );
        //打印大学毕业之后，张三的所有信息
        s1.setAge(s1.getAge() + 1);//大三
        s1.setAge(s1.getAge() + 1);//大四
        System.out.println(s1.getName() + "，" + s1.getAge() + "岁，" + s1.getHeight() + "cm，" + s1.getWeight() );
        s1.setAge(s1.getAge() + 1);//毕业
        System.out.println(s1.getName() + "，" + s1.getAge() + "岁，" + s1.getHeight() + "cm，" + s1.getWeight() );
        */
        }
}
