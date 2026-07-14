package test;
/*给你两个有序数组arr1和arr2，将两个数组中的数据合并到一个大数组中，
要求合并之后的大数组也是有序的 */
public class test3 {
    public static void main(String[] args) {
        //定义两个有序数组
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        //定义一个大数组，长度为两个小数组的长度之和
        int[] arr3 = new int[arr1.length + arr2.length];
        //定义两个指针，分别指向两个小数组的起始位置
        int i = 0;
        int j = 0;
        //循环遍历两个小数组，比较两个指针所指向的元素的大小，将较小的元素放入大数组中
        for (int k = 0; k < arr3.length; k++) {
            if (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    arr3[k] = arr1[i];
                    i++;
                } else {
                    arr3[k] = arr2[j];
                    j++;
                }
            } else if (i < arr1.length) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
        }
        //输出合并后的数组
        for (int k = 0; k < arr3.length; k++) {
            System.out.print(arr3[k] + " ");
        }
    }
    
}
