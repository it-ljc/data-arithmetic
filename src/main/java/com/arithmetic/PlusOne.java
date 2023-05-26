package com.arithmetic;

/**
 * @author ljc
 * @date 2023/5/26 15:29
 */
public class PlusOne {

//    加一
//    给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
//
//    最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
//
//    你可以假设除了整数 0 之外，这个整数不会以零开头。
//
//
//
//    示例 1：
//
//    输入：digits = [1,2,3]
//    输出：[1,2,4]
//    解释：输入数组表示数字 123。
//    示例 2：
//
//    输入：digits = [4,3,2,1]
//    输出：[4,3,2,2]
//    解释：输入数组表示数字 4321。
//    示例 3：
//
//    输入：digits = [0]
//    输出：[1]
//
//
//    提示：
//
//            1 <= digits.length <= 100
//            0 <= digits[i] <= 9

    public static void main(String[] args) {
        int[] digits = new int[]{8, 9, 9, 9};
        System.out.println(plusOne(digits));
    }

    public static int[] plusOne(int[] digits) {
        // 数组长度
        int length = digits.length;
        // 反向遍历
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                for (int j = length - 1; i < j; j--) {
                    digits[j] = 0;
                }
                return digits;
            }
        }
        // 数组中只有一个元素处理方法，变成两位元素
        int[] ans = new int[length + 1];
        ans[0] = 1;
        return ans;
    }


}
