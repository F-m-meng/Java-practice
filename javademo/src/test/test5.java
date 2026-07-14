package test;
/*给定一个递增的有序数组和一个目标值，在数组中找到目标值，打印其索引
如果目标值不存在于数组中，打印应插入的位置 */
public class test5 {
    public static void main(String[] args) {
        //定义一个递增的有序数组
        int[] nums = {1, 3, 5, 6};
        //定义一个目标值
        int target = 4;
        //循环遍历数组
        for(int i = 0; i < nums.length; i++) {
            //判断目标值是否存在于数组中
            if (nums[i] == target) {
                //输出目标值的索引
                System.out.println(i);
                return;
            }
            //判断目标值是否小于当前元素，如果是，则输出当前元素的索引
            if (nums[i] > target) {
                System.out.println(i);
                return;
            }
        }
        //如果目标值大于数组中的所有元素，则输出数组的长度
        System.out.println(nums.length);
    }
    
}
