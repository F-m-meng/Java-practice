package com.fm.opptest4;

public class Express {
    //单号，重量，收件人
    private String number;
    private int weight;
    private String receiver;
    //构造方法
    public Express()
    {
        
    }
    public Express(String number,int weight,String receiver)
    {
        this.number = number;
        this.weight = weight;
        this.receiver = receiver;
    }
    //getter和setter方法
    public void setNumber(String number)
    {
        this.number = number;
    }
    public String getNumber()
    {
        return number;
    }
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    public int getWeight()
    {
        return weight;
    }
    public void setReceiver(String receiver)
    {
        this.receiver = receiver;
    }
    public String getReceiver(){
        return receiver;
    }

    //计算快递费(每公斤10元，不考虑小数)
    public int calculateFee()
    {
        return weight * 10;
    }

}
