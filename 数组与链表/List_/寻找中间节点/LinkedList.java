package 寻找中间节点;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedList {

    // 寻找链表的中间节点
    public ListNode findMiddle(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;       // 慢指针走一步
            fast = fast.next.next;  // 快指针走两步
        }
        
        return slow;
    }

    public static void main(String[] args) {
        LinkedList linkedListProblems = new LinkedList();
        
        // 创建链表 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        // 找到链表的中间节点
        ListNode middleNode = linkedListProblems.findMiddle(head);
        
        // 输出中间节点的值
        System.out.println("Middle node value: " + middleNode.val);
    }
}
