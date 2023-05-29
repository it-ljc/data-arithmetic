package com.arithmetic;

/**
 * @author ljc
 * @date 2023/5/29 9:28
 */
public class BinarySum {

//    二进制求和
//    给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。
//
//
//
//    示例 1：
//
//    输入:a = "11", b = "1"
//    输出："100"
//    示例 2：
//
//    输入：a = "1010", b = "1011"
//    输出："10101"
//
//
//    提示：
//
//            1 <= a.length, b.length <= 104
//    a 和 b 仅由字符 '0' 或 '1' 组成
//    字符串如果不是 "0" ，就不含前导零

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }

    /**
     * 方法一 二进制转换成十进制计算
     * 缺点：超过范围后无法运行
     *
     * @param a
     * @param b
     * @return
     */
    public static String addBinary(String a, String b) {
        // 二进制转换为十进制
        Long aNum = Long.parseLong(a, 2);
        Long bNum = Long.parseLong(b, 2);
        Long sum = aNum + bNum;
        String sumStr = Long.toBinaryString(sum);
        return sumStr;
    }

}
