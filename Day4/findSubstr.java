public class StrStrTwoPointer {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0; // Edge case

        int n = haystack.length();
        int m = needle.length();

        int i = 0, j = 0; // pointers

        while (i < n) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;

                // Found full match
                if (j == m) {
                    return i - m; // starting index
                }
            } else {
                // Mismatch: reset j, move i back
                i = i - j + 1;
                j = 0;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        String haystack = "drunrun";
        String needle = "run";
        System.out.println(strStr(haystack, needle)); // Output: 1
    }
}
