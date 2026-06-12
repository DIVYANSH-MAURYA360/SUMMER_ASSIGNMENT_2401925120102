class Solution {
    public int compress(char[] chars) {
        int write = 0; // pointer for writing result
        int i = 0;     // pointer for reading

        while (i < chars.length) {
            char cur = chars[i];
            int count = 0;

            // count consecutive same characters
            while (i < chars.length && chars[i] == cur) {
                i++;
                count++;
            }

            // write the character
            chars[write++] = cur;

            // write count only if > 1
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}