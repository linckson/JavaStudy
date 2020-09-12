package Pro206;

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Pro206 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode currNode = node;
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        while(currNode != null){
            System.out.print(currNode.val+"->");
            currNode = currNode.next;
        }
        System.out.println(currNode);
        //System.out.println(node.val);
        reverseList(node);
    }
    public static ListNode reverseList(ListNode head) {
        Stack<ListNode> s = new Stack<ListNode>();
        ListNode node = head;

        while(node != null){
            s.push(node);
            node = node.next;
        }

        while(!s.empty()){
            node.next = s.pop();
        }
        return node;

//        //System.out.println("null");
//        ListNode pre = null;
//        ListNode now = head;

    }
}


