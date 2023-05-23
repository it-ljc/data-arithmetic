package com.arithmetic;

public class MergeTwoOrderedLinkedList {

//    合并两个有序链表
//    将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//
//
//
//    示例 1：
//
//
//    输入：l1 = [1,2,4], l2 = [1,3,4]
//    输出：[1,1,2,3,4,4]
//    示例 2：
//
//    输入：l1 = [], l2 = []
//    输出：[]
//    示例 3：
//
//    输入：l1 = [], l2 = [0]
//    输出：[0]
//
//
//    提示：
//
//    两个链表的节点数目范围是 [0, 50]
//            -100 <= Node.val <= 100
//    l1 和 l2 均按 非递减顺序 排列

    public static void main(String[] args) {
        // 实例化链表l1
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        // 实例化链表l2
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        // 控制台输出合成链表
//        printList(mergeTwoLists(l1, l2));
        printList(mergeTwoListsWayTwo(l1, l2));
    }

    /**
     * TODO 还有多种方法可以实现
     * 方法一 递归法
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 如果链表l1为空，返回链表l2
        if (null == l1) {
            return l2;
        } else if (null == l2) {
            // 如果链表l2为空，返回链表l1
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    /**
     * 方法二 迭代法
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoListsWayTwo(ListNode l1, ListNode l2) {
        // 实例化哑节点链表 方便插入链表的前和后不会报错
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (null != l1 && null != l2) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        // 合并后l1和l2最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }


    public static void printList(ListNode head) {
        ListNode cur = head;
        while (null != cur) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }
}

/**
 * 链表
 */
class ListNode {

    /**
     * 链表值（存储的值）
     */
    int val;

    /**
     * 指向下一个节点的指针
     */
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

}
