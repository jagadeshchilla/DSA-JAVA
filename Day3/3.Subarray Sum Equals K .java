// Subarray Sum Equals K
public int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1); // base case: prefix sum 0 occurs once

    int currSum = 0, count = 0;
    for (int num : nums) {
        currSum += num;

        int need = currSum - k;
        if (map.containsKey(need)) {
            count += map.get(need);
        }

        map.put(currSum, map.getOrDefault(currSum, 0) + 1);
    }
    return count;
}

// Time complexity: O(n)
// Space complexity: O(n)