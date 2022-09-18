Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
<pre>
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
</pre>

Example 2:
<pre>
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
</pre>

Constraints:
- 1 <= s.length <= 105
- s[i] is a printable ascii character.

```java
class Solution {
    public void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++){
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}
```