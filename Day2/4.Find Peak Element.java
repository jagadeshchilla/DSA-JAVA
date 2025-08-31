// Find Peak Element Implementation in Java
public int findPeakElement(int[] nums) {
    int low = 0, high = nums.length - 1;
    while (low < high) {
        int mid = low + (high - low) / 2;
        if (nums[mid] < nums[mid + 1]) {
            // peak must be on right side
            low = mid + 1;
        } else {
            // peak is on left side or at mid
            high = mid;
        }
    }
    return low; // or high, since low == high
}
// Time Complexity: O(log n)
// Space Complexity: O(1)