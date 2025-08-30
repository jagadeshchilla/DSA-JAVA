// Traversal method
class Solution {
    public static int largest(int[] arr) {
        // code here
        int largest=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
}

// time complexity: O(n)
// space complexity: O(1)