package dataArithmetic;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

public class SumOfTwoNumbers {
//    题目：两数之和
//    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，
//    并返回它们的数组下标。
//    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//    你可以按任意顺序返回答案。
//    示例 1：
//
//    输入：nums = [2,7,11,15], target = 9
//    输出：[0,1]
//    解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
//
//    示例 2：
//
//    输入：nums = [3,2,4], target = 6
//    输出：[1,2]
//
//    示例 3：
//
//    输入：nums = [3,3], target = 6
//    输出：[0,1]


    public static void main(String[] args) {
        int[] nums = {2, 11, 15, 7};
        int target = 9;
        int[] a = twoSum(nums, target);
        System.out.println("结果=" + Arrays.toString(a));
    }

    /**
     * 方法一 暴力破解
     * 时间复杂度O(n^2) 空间复杂度O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        // 暴力破解法 时间复杂度O(n^2) 空间复杂度O(1)
        // 数组长度，防止循环多次初始化，耗费性能
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 方法二 HashMap法
     * 时间复杂度O(n) 空间复杂度O(n)
     */
    @Test
    public void HashMapWayTest() {
        int[] nums = {2, 11, 15, 7};
        int target = 9;
        // 时间复杂度O(n) 空间复杂度O(n)
        // 数组长度，防止循环多次初始化，耗费性能
        int len = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>(len - 1);
        for (int i = 0; i < len; i++) {
            // key是数组中数字 value是数组下标 将值存入hashMap中
            hashMap.put(nums[i], i);
            // 通过containsKey方法来遍历得出结果
            if (hashMap.containsKey(target - nums[i])) {
                System.out.println(Arrays.toString(new int[]{hashMap.get(target - nums[i]), i}));
            }
        }
    }

}
