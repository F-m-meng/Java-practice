package com.fm.opptest4;

public class AirExpress extends Express {
    public AirExpress() {
        super();
    }
    public AirExpress(String number,int weight,String name) {
        super(number,weight,name);
    }

    //重新计算快递费（在原有基础上+15）
    @Override
    public int calculateFee() {
        return super.calculateFee()+15;
    }


    
}
