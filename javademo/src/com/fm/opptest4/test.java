package com.fm.opptest4;

public class test {
    /*继承的作业
    业务场景：快递公司需要计算运费，基础快递包含单号String，重量interesting，收件人String
    行为：计算快递费（计算规则每公斤10元，不需要考虑小数部分）
    还有两种有基础快递衍生出的特殊情况
    1.同城速递：重新计算快递费，在原有基础上+10元
    2.异地空运：重新计算快递费，在原有基础上+15元
     */
    public static void main(String[] args) {
        SameCityExpress sameCityExpress = new SameCityExpress("123456", 1, "张三");
        System.out.println(sameCityExpress.calculateFee());

        AirExpress airExpress = new AirExpress("123456", 1, "张三");
        System.out.println(airExpress.calculateFee());
    }
}
