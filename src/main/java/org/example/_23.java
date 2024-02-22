package org.example;

import java.util.Arrays;

/**
 * 23. 合并 K 个升序链表
 * 给你一个链表数组，每个链表都已经按升序排列。
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 * 示例 1：
 * 输入：lists = [[1,4,5],[1,3,4],[2,6]]
 * 输出：[1,1,2,3,4,4,5,6]
 * 解释：链表数组如下：
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 将它们合并到一个有序链表中得到。
 * 1->1->2->3->4->4->5->6
 * 示例 2：
 * 输入：lists = []
 * 输出：[]
 * 示例 3：
 * 输入：lists = [[]]
 * 输出：[]
 */
public class _23 {
    public static ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        ListNode dummyHead = new ListNode(0);
        ListNode newList = dummyHead;
        while (true) {
            ListNode minNode = null;
            int minPointer = -1;
            for (int i = 0; i < k; i++) {
                if (lists[i] == null) {
                    continue;
                }
                if (minNode == null || lists[i].val < minNode.val) {
                    minNode = lists[i];
                    minPointer = i;
                }
            }
            if (minPointer == -1) {
                break;
            }
            newList.next = minNode;
            newList = newList.next;
            lists[minPointer] = lists[minPointer].next;
        }
        return dummyHead.next;
    }


    public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }


    public static void main(String[] args) {

        int [] a = {1,4,5};
        int [] b = {1,3,4};
        int [] c = {2,6};
        ListNode listNode1 = new ListNode();

        ListNode listNode2 = new ListNode();
        ListNode listNode3 = new ListNode();
        ListNode listNode = new ListNode();

        listNode = listNode1;
            listNode1.val = a[0];
            listNode1.next = listNode2;
            listNode2.val = a[1];
            listNode2.next = listNode3;
            listNode3.val = a[2];

        System.out.println(listNode.val);

//        for (int j = 0; j < 3; j++) {
//            listNode2.val = b[j];
//            listNode2.next =new ListNode();
//        }
//        for (int k = 0; k < 2; k++) {
//            listNode3.val = c[k];
//            listNode3 = listNode3.next;
//        }


    }

}
