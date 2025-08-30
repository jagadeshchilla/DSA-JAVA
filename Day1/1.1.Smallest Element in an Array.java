// Traversal method
class Solution {
    public static int largest(int[] arr) {
        // code here
        int smallest=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
}

// time complexity: O(n)
// space complexity: O(1)