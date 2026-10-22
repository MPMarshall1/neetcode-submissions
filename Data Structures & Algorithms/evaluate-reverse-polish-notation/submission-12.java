class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();
        int last = 0;

        for (int i = 0; i < tokens.length; i++) {
            String t = tokens[i];
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int n2 = nums.pop();
                int n1 = nums.pop();

                switch (t) {
                    case "+": last = n1+n2; break;
                    case "-": last = n1-n2; break;
                    case "*": last = n1*n2; break;
                    case "/": last = n1/n2; break;
                }
                nums.push(last);
            } else {
                nums.push(Integer.parseInt(t));
            }
        }
        return nums.pop();
    }
}
