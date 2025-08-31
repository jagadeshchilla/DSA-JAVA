// First & Last Occurrence in Sorted Array Implementation in Java
class Solution {
    // Lower Bound: first index >= target
    private int lowerBound(int[] nums, int target) {
        int low = 0, high = nums.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    // Upper Bound: first index > target
    private int upperBound(int[] nums, int target) {
        int low = 0, high = nums.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};

        int first = lowerBound(nums, target);
        int last = upperBound(nums, target) - 1;

        // Check if target exists
        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{first, last};
    }
}

// Time Complexity: O(log n)
// Space Complexity: O(1)   