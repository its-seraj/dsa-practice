Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:
<pre>
Input: nums = [2,2,1]
Output: 1</pre>
Example 2:
<pre>
Input: nums = [4,1,2,1,2]
Output: 4</pre>
Example 3:
<pre>
Input: nums = [1]
Output: 1</pre>

Constraints:
- 1 <= nums.length <= 3 * 104
- -3 * 104 <= nums[i] <= 3 * 104
- Each element in the array appears twice except for one element which appears only once.

```java
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) result ^= i;
        
        return result;
    }
}
```