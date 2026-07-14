package com.fm.opptest1;

public class Maintainer extends AdminStaff {
    public Maintainer() {
    }
    public Maintainer(int id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        System.out.println("I am a maintainer, I maintain the system.");
    }
}
