package dataArithmetic;

/**
 * 整数反转
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * <p>
 * 示例 1：
 * <p>
 * 输入：x = 123
 * 输出：321
 * <p>
 * 示例 2：
 * <p>
 * 输入：x = -123
 * 输出：-321
 * <p>
 * 示例 3：
 * <p>
 * 输入：x = 120
 * 输出：21
 * <p>
 * 示例 4：
 * <p>
 * 输入：x = 0
 * 输出：0
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println("反转后的数字=" + reverse(123));
        ;
    }

    /**
     * 通过规律来解题
     * 时间复杂度O(log(x))
     * 空间复杂度O(1)
     *
     * @param x
     * @return
     */
    public static int reverse(int x) {
        // 反转后的数字
        int result = 0;
        while (x != 0) {
            // 判断是否超过整数值范围
            if (result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10) {
                return 0;
            }
            // 取模 为最后一个数字
            int num = x % 10;
            // 通过每一次取余来循环
            x /= 10;
            // 余数*10+
            result = result * 10 + num;
        }
        return result;
    }
}
