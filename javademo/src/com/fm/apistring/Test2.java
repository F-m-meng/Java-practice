package com.fm.apistring;

public class Test2 {
    public static void main(String[] args) {
    /*定义一个方法，把int数组中的数据照指定的格式拼接成一个字符串返回
    调用该方法，并在控制台输出结果 */
    
        //定义数组
        int[] arr = {1,2,3,4,5,6};
        String ret = ArrayUtil.arrayToString1(arr);
        System.out.println(ret);

        String ret2 = ArrayUtil.arrayToString2(arr);
        System.out.println(ret2);
        
    }
}
