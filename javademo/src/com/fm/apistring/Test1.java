package com.fm.apistring;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数（不考虑其它字符）
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        //遍历
        //计数器
            int upperCount = 0;
            int lowerCount = 0;
            int numberCount = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            
            //判断
            
            if(c >= 'A' && c <= 'Z'){
                upperCount++;
            }else if(c >= 'a' && c <= 'z'){
                lowerCount++;
            }else if(c >= '0' && c <= '9'){
                numberCount++;
            }else{
                System.out.println("其它字符：" + c);
            }
            
        }
        //打印
            System.out.println("大写字母出现的次数：" + upperCount);
            System.out.println("小写字母出现的次数：" + lowerCount);
            System.out.println("数字出现的次数：" + numberCount);
    }
    
}
