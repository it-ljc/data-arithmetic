package com.arithmetic;

/**
 * @author ljc
 * @date 2023/5/10 19:30
 */
public class PalindromicNumber {

//    9. 回文数
//            相关企业
//    给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
//
//    回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//
//    例如，121 是回文，而 123 不是。
//
//
//    示例 1：
//
//    输入：x = 121
//    输出：true
//    示例 2：
//
//    输入：x = -121
//    输出：false
//    解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
//    示例 3：
//
//    输入：x = 10
//    输出：false
//    解释：从右向左读, 为 01 。因此它不是一个回文数。

    public static void main(String[] args) {
        Integer number = 0;
        boolean b = isPalindrome(number);
        System.out.println(b);
    }

    /**
     * 方法一 反转一半数字比较
     *
     * @param number
     * @return
     */
    private static boolean isPalindrome(int number) {
        // 数字反转后的数,反转一半数字防止冲突
        Integer result = 0;
        // 负数、余数为0都不是回文数
        if (number < 0 || (number != 0 && number % 10 == 0)) {
            return false;
        }
        // 反转后的数字大于反转前的则不需要再反转了
        while (number > result) {
            // 余数
            int num = number % 10;
            // 商
            number /= 10;
            // 反转整数公式
            result = result * 10 + num;
        }
        // 反转后的求商为了判断是否是奇数位
        return result == number || number == result / 10;
    }

}
