class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>(); //close, open
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {return false;}
                char expect = map.get(stack.pop());
                if (c != expect) {return false;}
            }
        }

        return stack.isEmpty();
    }
}
