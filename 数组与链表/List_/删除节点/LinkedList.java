package 删除节点;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedList {
    // 删除链表中的指定值节点
    public ListNode deleteNode(ListNode head, int val) {
        // 处理头节点为目标节点的情况
        while (head != null && head.val == val) {
            head = head.next;
        }
        
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        
        return head;
    }

    public static void main(String[] args) {
        LinkedList linkedListProblems = new LinkedList();
        // 创建链表 1 -> 2 -> 3 -> 4 -> 3 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(5);
        
        // 删除值为 3 的节点
        int targetValue = 3;
        ListNode newHead = linkedListProblems.deleteNode(head, targetValue);
        
        // 打印删除后的链表
        ListNode current = newHead;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}


