Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
<pre>
Input: s = "leetcode"
Output: 0</pre>

Example 2:
<pre>
Input: s = "loveleetcode"
Output: 2</pre>
Example 3:
<pre>
Input: s = "aabb"
Output: -1</pre>

Constraints:
- 1 <= s.length <= 105
- s consists of only lowercase English letters.

```java
class Solution {
    public int firstUniqChar(String s) {
        int[] repeated = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            if(repeated[i] >= 1) continue;
            for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    repeated[i]++;
                    repeated[j]++;
                }
            }
        }
        for(int i = 0; i < repeated.length; i++) if(repeated[i] == 0) return i;
        
        return -1;
    }
}
```