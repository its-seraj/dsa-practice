Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

Example 1:
<pre>
Input: head = [1,2,2,1]
Output: true</pre>
Example 2:
<pre>
Input: head = [1,2]
Output: false
</pre>

Constraints:
- The number of nodes in the list is in the range [1, 105].
- 0 <= Node.val <= 9

Follow up: Could you do it in O(n) time and O(1) space?

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
    public boolean isPalindrome(ListNode head) {
        StringBuffer sb = new StringBuffer();
        
        ListNode temp = head;
        while(temp != null){
            sb.append(temp.val);
            temp = temp.next;
        }
        String org = sb.toString(), reverse = sb.reverse().toString();
        
        if(org.equals(reverse)) return true;
        else return false;
    }
}
```