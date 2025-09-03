// valid anagram
import java.util.HashMap;

public class AnagramChecker {
    public static boolean isAnagram(String s, String t) {
        // Step 1: Check length
        if (s.length() != t.length()) return false;

        // Step 2: Count characters in s
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 3: Reduce count using t
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false; // extra character in t
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) {
                return false; // too many occurrences in t
            }
        }

        // Step 4: Verify all counts are 0
        for (int count : map.values()) {
            if (count != 0) return false;
        }

        return true;
    }

    // Small test
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car")); // false
    }
}

// TIme Complexity: O(n)
// Space Complexity: O(1) - since the character set is limited (e.g., lowercase English letters)
// space complexity can be considered O(1) in this context.
// Space Complexity: O(n) - if considering all possible characters

//optimized code
// public class AnagramChecker {
//     public static boolean isAnagram(String s, String t) {
//         // Step 1: Length check
//         if (s.length() != t.length()) return false;

//         // Step 2: Frequency array for 26 lowercase letters
//         int[] freq = new int[26];

//         // Step 3: Count characters from s
//         for (char c : s.toCharArray()) {
//             freq[c - 'a']++;
//         }

//         // Step 4: Subtract counts using t
//         for (char c : t.toCharArray()) {
//             freq[c - 'a']--;
//             if (freq[c - 'a'] < 0) {
//                 return false; // extra char in t
//             }
//         }

//         // Step 5: Verify all counts are zero
//         for (int count : freq) {
//             if (count != 0) return false;
//         }

//         return true;
//     }

//     // Small test
//     public static void main(String[] args) {
//         System.out.println(isAnagram("anagram", "nagaram")); // true
//         System.out.println(isAnagram("rat", "car")); // false
//         System.out.println(isAnagram("aabb", "bbaa")); // true
//         System.out.println(isAnagram("aabb", "abbb")); // false
//     }
// }

// Count in s: O(n)

// Subtract with t: O(n)

// Final check: O(26) ≈ O(1)
// Overall = O(n)
// space complexity: O(1) - fixed size array of 26