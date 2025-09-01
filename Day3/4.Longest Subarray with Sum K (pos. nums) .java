// Longest Subarray with Sum K (pos. nums)
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int n=a.length;
        long sum=0;
        int left=0;
        int maxlen=0;

        for(int right=0;right<n;right++){
            sum+=a[right];

            while(sum>k && left<=right){
                sum-=a[left];
                left++;
            }

            if(sum==k){
                int len=right-left+1;
                if(len>maxlen) maxlen=len;
            }
            
        }
        return maxlen;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)