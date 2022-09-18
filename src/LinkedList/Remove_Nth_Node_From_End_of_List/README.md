Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:
![img.png](img.png)
<pre>
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]
</pre>

Constraints:
- The number of nodes in the list is sz.
- 1 <= sz <= 30
- 0 <= Node.val <= 100
- 1 <= n <= sz

Follow up: Could you do this in one pass?

```java
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
        ArrayList<Integer> list = new ArrayList<>();
        
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        list.remove(list.size() - n);
        
        if(list.size() == 0) return null;
        
        ListNode result = new ListNode();
        ListNode temp = result;
        for(int i = 0; i < list.size(); i++){
            temp.val = list.get(i);
            if(i < list.size() - 1){
                temp.next = new ListNode();
                temp = temp.next;
            }
        }
        return result;
    }
}
```