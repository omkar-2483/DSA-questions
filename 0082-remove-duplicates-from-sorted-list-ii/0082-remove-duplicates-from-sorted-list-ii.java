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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null ||head.next==null) return head;
        ListNode prev = null, current1 = head, current2 = head.next;
        while(current1.next!= null){
            if(current1.val != current2.val){
                prev = current1;
                current1 = current2;
                if(current2 != null) current2 = current2.next;
            }
            else{
                while(current1 != null){
                    current2 = current2.next;
                    if(current2 == null){
                        if(prev != null) prev.next = null;
                        else return null;
                        return head;
                    }
                    if(current1.val != current2.val){
                        current1 = current2;
                        current2 = current2.next;
                        if(prev != null) prev.next = current1;
                        else head = current1;
                        break;
                    }
                }
            }
        }
        return head;
    }
}