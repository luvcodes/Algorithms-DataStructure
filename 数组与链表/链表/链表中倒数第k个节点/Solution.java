package 数组与链表.链表.链表中倒数第k个节点;

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int n = 0;
        ListNode node = null;

        // 遍历链表长度
        for (node = head; node != null; node = node.next) {
            n++;
        }

        // 就是第n-k个节点，这个k注意是从后往前数的
        for (node = head; n > k; n--) {
            node = node.next;
        }
        return node;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}