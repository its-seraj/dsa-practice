You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.


![img.png](img.png)
<pre>
Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]

Constraints:
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
</pre>

```
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
        if(list1 == null && list2 == null) return null;
        
        ListNode result = new ListNode();
        ListNode head = result;
        
        while(list1 != null && list2 != null){
            int n1 = list1.val;
            int n2 = list2.val;
            
            if(n1 <= n2){
                head.val = n1;
                head.next = new ListNode();
                head = head.next;
                list1 = list1.next;
            }else{
                head.val = n2;
                head.next = new ListNode();
                head = head.next;
                list2 = list2.next;
            }
        }
        
        while(list1 != null){
            head.val = list1.val;
            if(list1.next != null)
                head.next = new ListNode();
            head = head.next;
            list1 = list1.next;
        }
        while(list2 != null){
            head.val = list2.val;
            if(list2.next != null)
                head.next = new ListNode();
            head = head.next;
            list2 = list2.next;
        }
        return result;
    }
}
```