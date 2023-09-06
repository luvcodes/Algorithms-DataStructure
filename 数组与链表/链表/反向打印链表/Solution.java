// 从尾到头打印链表
// 使用两个办法，递归法，辅助栈法

// 第一种方法使用递归，先走到链表的末端，回溯的时候依次将节点值
// 加入列表，这样就可以实现链表值的倒序输出。

// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

public class Solution {
    // 开创新的arrayList
    ArrayList<Integer> arrryList = new ArrayList<Integer>();
    public int[] reversePrint(ListNode head) {
        // 调用方法
        recursion(head);
        // 将链表转化为数组
        int[] res = new int[arrryList.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = arrryList.get(i);
        }
        return res;
    }

    public void recursion(ListNode head) {
        // 如果head是空，直接return
        if (head == null) {
            return;
        }
        // 递归使用head的下一个节点，所以也会顺序执行上面的head是否为null的检测
        recursion(head.next);
        // 这个add语句，其实就是相当于因为head.next指针一直在往下移动，当走到最后一个
        // 节点之后，递归调用，发现head.next是空。
        // 因此if条件不再满足，开始返回，也就是逐次返回，当递归开始返回时，
        // 我们会按照链表的逆序执行这个add操作。
        arrryList.add(head.val);
    }
}


// 第二种方法使用辅助栈法
// 结合链表的特点，只能从前往后访问每个节点。倒序输出节点值，这种先入后出
// 的需求可以借助栈来实现
// 算法流程: 
// 		入栈: 遍历链表，将各节点值push入栈。
// 		出栈: 将各节点值pop出栈，存储于数组并返回
class Solution {
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while(head != null) {
            stack.addLast(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = stack.removeLast();
    return res;
    }
}