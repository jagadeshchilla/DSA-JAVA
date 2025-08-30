// Check if array is sorted or not
// Traversal / Comparison of array elements
public class Solution {
    public static int isSorted(int n, int[] arr) {
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return 0;
            }
        }
        return 1;
    }
}

// time complexity: O(n)
// space complexity: O(1)