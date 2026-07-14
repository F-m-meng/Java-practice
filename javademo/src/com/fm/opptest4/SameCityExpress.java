package com.fm.opptest4;

public class SameCityExpress extends Express{
    public SameCityExpress()  {
    }
    public SameCityExpress(String number, int weight,String name)  {
        super(number, weight, name);
    }
    //快递费
    @Override
    public int calculateFee()  {
        return super.calculateFee()+10;
    }
      
}
