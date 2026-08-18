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

       List<ListNode> node = new ArrayList<>();
       ListNode cur = head;

       while(cur != null){
        node.add(cur);
        cur = cur.next;
       }
       int removeIndex = node.size() - n;
       if(removeIndex == 0){
        return head.next;
       } 
       node.get(removeIndex - 1).next = node.get(removeIndex).next;

       return head;
    }
}
