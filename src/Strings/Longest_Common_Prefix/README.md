Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:
<pre>
Input: strs = ["flower","flow","flight"]
Output: "fl"</pre>
Example 2:
<pre>
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
</pre>

Constraints:
- 1 <= strs.length <= 200
- 0 <= strs[i].length <= 200
- strs[i] consists of only lowercase English letters.

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        
        char curr = 'a';
        int currIndex = 0;
        for(int i = 0; i < strs.length; i++){
            if(strs[i].length() <= currIndex) break;
            if(i == 0) curr = strs[i].charAt(currIndex);

            if(curr != strs[i].charAt(currIndex) || strs[i].length() < currIndex){
                break;
            }
            if((i == strs.length - 1) && curr == strs[i].charAt(currIndex)){
                result += curr;
                i = -1;
                currIndex++;
            }
        }
        
        return result;
    }
}
```