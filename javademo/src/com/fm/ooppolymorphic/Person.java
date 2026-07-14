package com.fm.ooppolymorphic;

public class Person {
    //人Person：属性：姓名，年龄，性别；行为：行驶交通工具（能使用所有交通工具）
    private String name;
    private int age;
    private String sex;
    //构造方法
    public Person()
    {

    }
    public Person(String name, int age, String sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //setter和getter方法
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setSex(String sex){
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }
    //行为
    public void drive(Vehicle vehicle)
    {
        vehicle.move();
        if(vehicle instanceof Bicycle){
            Bicycle bicycle = (Bicycle)vehicle;
            bicycle.ringBell();
        }else if(vehicle instanceof Car){
            Car car = (Car)vehicle;
            car.honk();
        }else{
            System.out.println("没有这个类型");
        }
    }
}
