Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:
<pre>
Input: s = "anagram", t = "nagaram"
Output: true</pre>
Example 2:
<pre>
Input: s = "rat", t = "car"
Output: false
</pre>

Constraints:
- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.


Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch1 : s.toCharArray()){
            if(map.containsKey(ch1)) map.replace(ch1, map.get(ch1) + 1);
            else map.put(ch1, 1);
        }
        for(char ch1 : t.toCharArray()){
            if(map.containsKey(ch1) && map.get(ch1) > 0) map.replace(ch1, map.get(ch1) - 1);
            else return false;
        }
        int result = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()) result += entry.getValue();
        
        if(result == 0) return true;
        else return false;
    }
}
```