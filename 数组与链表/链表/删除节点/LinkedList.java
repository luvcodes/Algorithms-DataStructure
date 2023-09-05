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
        // 循环检查链表的头结点是否应该被删除。如果头结点的值等于传入的val，则删除头结点
        while (head != null && head.val == val) {
            // 这就是在将头结点的下一个节点当作头结点
            head = head.next;
        }
        
        ListNode curr = head;
        // 检测链表的其余部分开始一个循环，检查每一个节点是否应该被删除
        while (curr != null && curr.next != null) {
            // 这个意思就是说当前节点的下一个节点的值就是输入的值的话
            if (curr.next.val == val) {
                // 那么就把当前节点的下一个的再下一个节点当作当前节点的下一个节点
                curr.next = curr.next.next;
            } else {
                // 否则就移动当前节点的这个指针 (curr)到当前节点的下一个节点
                // 其实可以把这个curr理解成for循环里面的i++的那一个步骤
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
            // 其实这里就是相当于呼应上面提到的类似for循环的i++的操作
            current = current.next;
        }
        System.out.println("null");
    }
}


