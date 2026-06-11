class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');          // handle multi-digit numbers

            } else if (c == '[') {
                countStack.push(k);               // save repeat count
                stringStack.push(current);        // save string built so far
                current = new StringBuilder();    // fresh builder for inside []
                k = 0;

            } else if (c == ']') {
                int repeat = countStack.pop();
                StringBuilder prev = stringStack.pop();
                for (int i = 0; i < repeat; i++) prev.append(current);
                current = prev;                   // restored + repeated

            } else {
                current.append(c);                // regular letter
            }
        }

        return current.toString();
    }
}