package 反转链表;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedList {
    // 反转链表
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode nextTemp = current.next;  // 保存下一个节点
            current.next = prev;  // 当前节点指向前一个节点
            prev = current;  // 更新 prev
            current = nextTemp;  // 更新 current
        }
        
        return prev;  // 新的头节点为原链表的尾节点
    }

    public static void main(String[] args) {
        LinkedList linkedListProblems = new LinkedList();
        
        // 创建链表 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        // 反转链表
        ListNode newHead = linkedListProblems.reverseList(head);
        
        // 打印反转后的链表
        ListNode current = newHead;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
