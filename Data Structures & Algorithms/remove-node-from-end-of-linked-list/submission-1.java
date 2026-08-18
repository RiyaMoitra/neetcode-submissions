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
    public ListNode removeNthFromEnd(ListNode head, int n) {

       int pos = 0;
       ListNode cur = head;

       while(cur != null){
        pos++;
        cur = cur.next;
       }

       int removeIndex = pos - n;

       if(removeIndex == 0){
        return head.next;
       }
       cur = head;
        for(int i = 0; i < pos - 1 ; i++){
            if((i + 1) == removeIndex){
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
        }
        return head;
    }
}
