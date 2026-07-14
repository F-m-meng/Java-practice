package com.fm.opptest1;

public  class Buyer extends AdminStaff {
    public Buyer() {
    }
    public Buyer(int id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        System.out.println("I am buyer, I am buying things.");
    }

    
}
