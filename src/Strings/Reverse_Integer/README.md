Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

<b>Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
</b>

Example 1:
<pre>
Input: x = 123
Output: 321</pre>

Example 2:
<pre>
Input: x = -123
Output: -321</pre>

Example 3:
<pre>Input: x = 120
Output: 21</pre>

Constraints:
- -231 <= x <= 231 - 1

```java
class Solution {
    public int reverse(int x) {
        boolean isNeg = false;
        
        if(x < 0){
            isNeg = true;
            x = -x;
        }
        
        long result = 0;
        while(x > 0){
            result = result * 10 + x % 10;
            x /= 10;
        }
        
        if(result >= Integer.MAX_VALUE || result <= Integer.MIN_VALUE) return 0;
        
        return isNeg ? -(int)result : (int)result;
    }
}
```