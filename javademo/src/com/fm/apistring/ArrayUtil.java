package com.fm.apistring;

public class ArrayUtil {
    private ArrayUtil() {}

    public static String arrayToString1(int[] arr){
        //定义一个字符串进行拼接
        String str = "[";
        //遍历数组
        for(int i = 0; i < arr.length; i++) {
            //判断是否是最后一个元素
            if (i == arr.length - 1) {
                str += arr[i] + "]";
            } else {
                str += arr[i] + ",";
            } 
        }
        return str;
    }

        public static String arrayToString2(int[] arr){
            //创建StringBuilder容器对象，并添加左括号
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
                sb.append("]");
            } else {
                sb.append(arr[i]);
                sb.append(",");
            }
        }
        return sb.toString();
    }
    
    
}
