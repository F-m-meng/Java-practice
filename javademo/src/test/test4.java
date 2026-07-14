package test;
/*给定一个整数数组nums和一个目标值target，请你在该数组中找出和为目标值的两个整数，
并返回它们的数组下标。要求1：只要输出第一对满足要求的情况 要求2：输出所有满足要求的情况 */


public class test4 {
    public static void main(String[] args) {

        //定义一个整数数组
        int[] nums = {2, 7, 11, 15, 3, 6, 4};
        //定义一个目标值
        int target = 9;
        //循环遍历数组
        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                //判断两个数的和是否等于目标值
                if (nums[i] + nums[j] == target) {
                    //输出满足要求的数组下标
                    System.out.println("[" + i + ", " + j + "]");
                    //只要输出第一对满足要求的情况，直接返回
                    
                }
            }
        }
    } 
}
