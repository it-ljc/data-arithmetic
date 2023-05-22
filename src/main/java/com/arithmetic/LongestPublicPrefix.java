package com.arithmetic;

/**
 * @author ljc
 * @date 2023/5/13 11:09
 */
public class LongestPublicPrefix {

//    最长公共前缀
//    编写一个函数来查找字符串数组中的最长公共前缀。
//
//    如果不存在公共前缀，返回空字符串 ""。
//
//
//
//    示例 1：
//
//    输入：strs = ["flower","flow","flight"]
//    输出："fl"
//    示例 2：
//
//    输入：strs = ["dog","racecar","car"]
//    输出：""
//    解释：输入不存在公共前缀。
//
//
//    提示：
//
//            1 <= strs.length <= 200
//            0 <= strs[i].length <= 200
//    strs[i] 仅由小写英文字母组成

    public static void main(String[] args) {
        String[] strs = {"cir", "car"};
        String longestPublicPrefix = longestCommonPrefix(strs);
        System.out.println(longestPublicPrefix);
    }

    // TODO这道题多种解法，有机会再尝试
    /**
     * 方法一 横向扫描
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        // 如果空数组返回空串
        if (null == strs || strs.length == 0) {
            return "";
        }
        // 选第一元素作为公共前缀，做基准，面对后续的比较
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            // 定义取值下标
            int index = 0;
            // 取出长度最短的
            int length = Math.min(prefix.length(), strs[i].length());
            while (index < length && prefix.charAt(index) == strs[i].charAt(index)) {
                index++;
            }
            prefix = prefix.substring(0, index);
        }
        return prefix;
    }

}
