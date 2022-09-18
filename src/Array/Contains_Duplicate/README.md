Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:
<pre>
Input: nums = [1,2,3,1]
Output: true</pre>
Example 2:
<pre>
Input: nums = [1,2,3,4]
Output: false</pre>
Example 3:
<pre>
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
</pre>

Constraints:
- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums) set.add(i);
        
        if(nums.length > set.size()) return true;
        
        return false;
    }
}
```