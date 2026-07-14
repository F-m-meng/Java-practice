package com.fm.opptest3;

public class Manager extends Employ {
    private double bonus; //管理奖金

    public Manager() {
    }

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }

}
