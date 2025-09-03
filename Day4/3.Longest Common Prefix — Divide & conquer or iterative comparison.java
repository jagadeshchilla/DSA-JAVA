// Longest Common Prefix — Divide & conquer or iterative comparison

public class LongestCommonPrefix {

    // Iterative comparison approach
    public static String longestCommonPrefixIterative(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            // while current string doesn't start with prefix, shorten prefix
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    // quick test
    public static void main(String[] args) {
        System.out.println(longestCommonPrefixIterative(new String[]{"flower","flow","flight"})); // "fl"
        System.out.println(longestCommonPrefixIterative(new String[]{"dog","racecar","car"}));   // ""
    }
}


// Let n = number of strings, m = length of the shortest string.

// Time: O(n * m) — in worst case you compare up to m chars for each of n strings.

// Space: O(1) extra (excluding input/output strings).