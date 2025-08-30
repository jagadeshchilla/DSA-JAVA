// Traversal of array to find the largest and second largest elements

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest=arr[0];
        int slargest=-1;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        return slargest;
    }
}

// time complexity: O(n)
// space complexity: O(1)

// There is a edge case that when there is a valid second largest number in array
// like {10,10,10} then we return -1 as there is no second largest number
//so here instead of using this"return slargest;" we can use "return (slargest==-1)?-1:slargest;"