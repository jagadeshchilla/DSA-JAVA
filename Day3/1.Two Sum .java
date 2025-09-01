// Two Sum
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>(); // value -> index
    for (int i = 0; i < nums.length; i++) {
        int need = target - nums[i];
        if (map.containsKey(need)) {
            return new int[]{map.get(need), i}; // found pair
        }
        map.put(nums[i], i);
    }
    return new int[]{-1, -1}; // not found (theoretical)
}

// Time complexity: O(n)
// Space complexity: O(n)