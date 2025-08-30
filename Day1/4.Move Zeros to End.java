//4.	Move Zeros to End — Two-pointer / In-place partitioning

import java.util.Arrays;

public class MoveZeros {
    public static void moveZerosToEnd(int[] arr) {
        int j = 0; // pointer for placing non-zero elements

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 0, 1, 0, 3, 12};  // first number is not zero
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}

// time complexity: O(n)
// space complexity: O(1)   

// Dry Run Example

// Input:

// arr = [5, 0, 1, 0, 3, 12]


// Initial:

// j = 0


// Step by step:

// i = 0 → arr[0] = 5 (non-zero)

// swap(arr[0], arr[0]) → no change

// arr = [5, 0, 1, 0, 3, 12]

// j = 1

// i = 1 → arr[1] = 0 (zero)

// skip

// arr = [5, 0, 1, 0, 3, 12]

// j = 1

// i = 2 → arr[2] = 1 (non-zero)

// swap(arr[2], arr[1])

// arr = [5, 1, 0, 0, 3, 12]

// j = 2

// i = 3 → arr[3] = 0 (zero)

// skip

// arr = [5, 1, 0, 0, 3, 12]

// j = 2

// i = 4 → arr[4] = 3 (non-zero)

// swap(arr[4], arr[2])

// arr = [5, 1, 3, 0, 0, 12]

// j = 3

// i = 5 → arr[5] = 12 (non-zero)

// swap(arr[5], arr[3])

// arr = [5, 1, 3, 12, 0, 0]

// j = 4

// ✅ Final Array:

// [5, 1, 3, 12, 0, 0]