// 2.	Reverse String / Check Palindrome — Two-pointer / String traversal
public class StringProblems {

    // Reverse String using two pointers
    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // swap
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    // Check if string is palindrome using two pointers
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello")); // "olleh"
        System.out.println(isPalindrome("madam"));  // true
        System.out.println(isPalindrome("hello"));  // false
    }
}

// Time Complexity:

// Each character is visited once → O(n)

// Space Complexity:

// Reverse: O(n) for char array (or O(1) if in-place on mutable string).

// Palindrome check: O(1) (just two pointers).