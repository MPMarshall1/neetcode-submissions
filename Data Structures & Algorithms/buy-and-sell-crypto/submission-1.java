class Solution {
    public int maxProfit(int[] prices) {
        int left = prices[0]; int right = prices[0];

        int max = 0;
        for (int price : prices) {
            right = price;
            left = Math.min(left, right);
            System.out.println(right+"-"+left+"="+(right-left));
            max = Math.max(max, right-left);
        }
        return max;
    }
}
