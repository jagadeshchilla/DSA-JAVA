// Traversal method
class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                cnt++;
            }
        }
        return cnt;
    }
}
// time complexity: O(n)
// space complexity: O(1)