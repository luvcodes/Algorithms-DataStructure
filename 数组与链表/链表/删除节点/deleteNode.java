package 删除节点;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode (int x) {val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        /**
        常用的删除链表汇总的节点的常见的方法是定位到待删除节点的上一个节点，
        修改上一个节点的next指针，使其指向待删除节点的下一个节点。

        但是在这个题，传入的node为要被删除的节点，无法定位到该节点的上一个节点。
        可以通过修改node的next指针的指向，删除node的下一个节点。但是题目要求删除node，
        为了达到删除node的效果，只要在删除节点之前，将node的节点值
        修改为node.next的节点值即可。
         */
        // 这有一个条件，就是给定的节点不是链表中的最后一个节点。
        node.val = node.next.val;
        node.next = node.next.next;
    }
}