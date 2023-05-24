package com.arithmetic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ljc
 * @date 2023/5/24 20:23
 */
public class LengthLastWord {

//    最后一个单词的长度
//    相关企业
//    给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
//
//    单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
//
//
//
//    示例 1：
//
//    输入：s = "Hello World"
//    输出：5
//    解释：最后一个单词是“World”，长度为5。
//    示例 2：
//
//    输入：s = "   fly me   to   the moon  "
//    输出：4
//    解释：最后一个单词是“moon”，长度为4。
//    示例 3：
//
//    输入：s = "luffy is still joyboy"
//    输出：6
//    解释：最后一个单词是长度为6的“joyboy”。

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        Map<Integer, String> map = new HashMap<>(16);
        int i = 0;
        for (String arr : strArr) {
            map.put(i, arr);
        }
        return map.get(0).length();
    }


}
