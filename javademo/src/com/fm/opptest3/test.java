package com.fm.opptest3;

public class test {
    /*继承的作业（餐饮菜品推荐）
    1.经理 成员变量：工号，姓名，工资，管理奖金
    成员方法：工作（管理其他人），吃饭（吃米饭）
    2.厨师 成员变量：工号，姓名，工资
    成员方法：工作（炒菜），吃饭（吃米饭） */
    public static void main(String[] args) {
  
    Manager manager = new Manager(2, "李四", 8000, 2000);
    System.out.println("经理信息：工号：" + manager.getId() + "，姓名：" + manager.getName() + "，工资：" + manager.getSalary() + "，管理奖金：" + manager.getBonus());
    manager.work();
    manager.eat();
    Cook cook = new Cook(3, "王五", 6000);
    System.out.println("厨师信息：工号：" + cook.getId() + "，姓名：" + cook.getName() + "，工资：" + cook.getSalary());
    cook.work();
    cook.eat();
    }
}
