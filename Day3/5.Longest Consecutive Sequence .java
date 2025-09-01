// Longest Consecutive Sequence

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n); // O(n)
        
        int best = 0;
        for (int n : set) { // iterate over unique values
            // only start expanding if n is the beginning of a sequence
            if (!set.contains(n - 1)) {
                int current = n;
                int length = 1;
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                if (length > best) best = length;
            }
        }
        return best;
    }

    // quick main to test
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(s.longestConsecutive(arr)); // prints 4
    }
}


// Time Complexity: O(n)
// Space Complexity: O(n)