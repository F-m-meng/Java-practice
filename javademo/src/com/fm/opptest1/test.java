package com.fm.opptest1;

public class test {
    /*继承的作业（餐饮菜品推荐）
    有很多员工，按照工作内容不同分为教研部员工和行政部员工
    1.教研部根据教学的方式不同分为讲师和助教
    2.行政部根据负责事项不同分为维护专员，采购专员
    3.公司的每一个员工都有编号，姓名和其负责的工作
    4.每个员工都有工作的功能，但是具体工作内容又不一样 */
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer(1, "张三");
        System.out.println("讲师信息：工号：" + lecturer.getId() + "，姓名：" + lecturer.getName());
        lecturer.work();

        Tutor tutor = new Tutor(2, "李四");
        System.out.println("助教信息：工号：" + tutor.getId() + "，姓名：" + tutor.getName());
        tutor.work();

        Maintainer maintainer = new Maintainer(1, "王五");
        System.out.println("维护专员信息：工号：" + maintainer.getId() + "，姓名：" + maintainer.getName());
        maintainer.work();

        Buyer buyer = new Buyer(2, "赵六");
        System.out.println("采购专员信息：工号：" + buyer.getId() + "，姓名：" + buyer.getName());
        buyer.work();
    }
    
}
