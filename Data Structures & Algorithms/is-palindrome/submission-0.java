class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isChar(s.charAt(i))) {length++;}
        }

        boolean odd = (length % 2 == 1);
        length = length / 2;

        System.out.println(length);

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isChar(c)) {
                System.out.println(c);
                if (length > 0) {stack.push(c); length--; continue;}
                if (odd) {odd = false; continue;}
                char next = stack.pop();
                if (c != next) {return false;}
                length--;
            }
        }

        return true;
    }

    public boolean isChar(char c) {
        if (c > '/' && c < ':') {return true;}
        if (c > '`' && c < '{') {return true;}
        return false;
    }
}
