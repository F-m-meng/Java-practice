package test;

public class test {
    
    public static void main(String[] args) {
        //定义一个变量记录微信余额0元
        double wechatBalance = 0.0;
        //定义一个变量记录支付宝余额10元
        double alipayBalance = 10.0;
        //定义一个变量记录银行卡余额100元   
        double bankCardBalance = 100.0;
        //输出现在一共有多少钱
        double totalBalance = wechatBalance + alipayBalance + bankCardBalance;
        System.out.println("现在一共有多少钱：" + totalBalance + "元");

        //微信收了5元红包
        wechatBalance += 5.0;
        //重新计算总余额
        totalBalance = wechatBalance + alipayBalance + bankCardBalance;
        System.out.println("微信收红包后，现在一共有多少钱：" + totalBalance + "元");

    }
}

