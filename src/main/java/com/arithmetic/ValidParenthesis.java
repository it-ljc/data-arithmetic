package com.arithmetic;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author ljc
 * @date 2023/5/22 17:19
 */
public class ValidParenthesis {

//    有效的括号
//    给定一个只包括 '('，')'，'{'，'}'，'['，']'
//    的字符串 s ，判断字符串是否有效。
//
//    有效字符串需满足：
//
//    左括号必须用相同类型的右括号闭合。
//    左括号必须以正确的顺序闭合。
//    每个右括号都有一个对应的相同类型的左括号。
//
//
//    示例 1：
//
//    输入：s ="()"
//    输出：true
//    示例 2：
//
//    输入：s ="()[]{}"
//    输出：true
//    示例 3：
//
//    输入：s ="(]"
//    输出：false
//
//
//    提示：
//
//            1<=s.length <=104
//    s 仅由括号 '()[]{}'组成


    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    /**
     * 方法一 通过栈解题
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        if (s.length() == 0) {
            return false;
        }
        // 奇数不满足条件
        if (s.length() % 2 != 0) {
            return false;
        }
        // 初始化数据放到map中
        Map<Character, Character> map = new HashMap<Character, Character>(16);
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        // 定义一个栈
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (stack.isEmpty() || !stack.peek().equals(map.get(s.charAt(i)))) {
                    return false;
                }
                // 出栈
                stack.pop();
            } else {
                // 入栈
                stack.push(s.charAt(i));
            }
        }
        // 如果栈中无数据则满足条件
        return stack.isEmpty();
    }

}
