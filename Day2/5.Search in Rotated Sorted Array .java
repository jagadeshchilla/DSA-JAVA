// Search in Rotated Sorted Array
class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;

            if(arr[low]<=arr[mid]){
                // left sorted
                if(target>=arr[low] && target<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                //right sorted
                if(target>arr[mid] && target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}

// Time Complexity: O(log n)
// Space Complexity: O(1)   