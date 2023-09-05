package 环形链表检测;

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycleDetection {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;  // 空链表或单节点链表肯定没有环
        }
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;  // 快慢指针相遇，说明链表中有环
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return false;  // 快指针达到链表尾部，没有环
    }
    
    public static void main(String[] args) {
        LinkedListCycleDetection cycleDetection = new LinkedListCycleDetection();
        
        // 构造一个有环的链表
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next;  // 创建环
        
        System.out.println("Has Cycle: " + cycleDetection.hasCycle(head));  // 输出 true
    }
}
