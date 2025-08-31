// Search Insert Position Implementation in Java
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid; // found
            } else if (nums[mid] < target) {
                low = mid + 1; // move right
            } else {
                high = mid - 1; // move left
            }
        }

        return low; // insertion position
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 5)); // Output: 2
        System.out.println(searchInsert(nums, 2)); // Output: 1
        System.out.println(searchInsert(nums, 7)); // Output: 4
        System.out.println(searchInsert(nums, 0)); // Output: 0
    }
}

// Time Complexity: O(log n)
// Space Complexity: O(1)   