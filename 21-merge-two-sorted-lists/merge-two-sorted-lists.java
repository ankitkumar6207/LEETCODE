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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null)
        {
            return list1!= null?list1:list2;
        }
        ListNode result = new ListNode();
        ListNode pre = result;
        while(list1!= null && list2!= null)
        {
            if(list1.val < list2.val)
            {
                pre.next = list1;
                list1 = list1.next;
                pre = pre.next;
            }else{
                pre.next = list2;
                list2 = list2.next;
                pre = pre.next;
            }
        }
        pre.next = list1!=null?list1:list2;
        return result.next;
    }
}