package com.arithmetic;

/**
 * @author ljc
 * @date 2023/5/29 10:47
 */
public class RemovesDuplicateLinkedList {

//    删除排序链表中的重复元素
//    给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
//
//
//
//    示例 1：
//
//
//    输入：head = [1,1,2]
//    输出：[1,2]
//    示例 2：
//
//
//    输入：head = [1,1,2,3,3]
//    输出：[1,2,3]
//
//
//    提示：
//
//    链表中节点数目在范围 [0, 300] 内
//-100 <= Node.val <= 100
//    题目数据保证链表已经按升序 排列

    public static void main(String[] args) {
        // 实例化链表l1
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);
        System.out.println(deleteDuplicates(l1));
    }

    /**
     * 一次遍历
     *
     * @param l1
     * @return
     */

    public static ListNode deleteDuplicates(ListNode l1) {
        if (null == l1) {
            return l1;
        }
        ListNode cur = l1;
        while (null != cur.next) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return l1;
    }

}
