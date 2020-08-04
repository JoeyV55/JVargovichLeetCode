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
        if(head == null || head.next == null) 
            return head;
        
        //Unsorted and Sorted solution using HashSet.
        HashSet<Integer> supportSet = new HashSet<Integer>();
        ListNode indexNode = head;
        ListNode prev = null;
        
        while(indexNode != null){
            if(!supportSet.add(indexNode.val)){
                prev.next = indexNode.next;
                indexNode = indexNode.next;
            }
            else{
                prev = indexNode;
                indexNode = indexNode.next;
            }
        }
        return head;
    }
}
