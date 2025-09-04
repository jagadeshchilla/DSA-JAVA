public class StringCompression {
    public static int compress(char[] chars) {
        int n = chars.length;
        int write = 0; // where we write result
        int read = 0;  // scanning input

        while (read < n) {
            char currentChar = chars[read];
            int count = 0;

            // Count consecutive chars
            while (read < n && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // Write the count if > 1
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        int len = compress(chars);
        System.out.print("Compressed: ");
        for (int i = 0; i < len; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println("\nLength = " + len);
    }
}
