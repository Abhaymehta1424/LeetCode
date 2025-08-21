/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right){
            return head;
        }

        ListNode cur = head;
        ListNode prev = null;

        int i = 1;
        while(i != left && cur != null){
            prev = cur;
            cur = cur.next;
            i++;
        }

        ListNode start = cur;
        ListNode point = prev;

        while( i != right + 1 && cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            i++;
        }
        start.next = cur;
        if( point != null){
            point.next = prev;
        }else{
            return prev;
        }
        return head;
    }
}