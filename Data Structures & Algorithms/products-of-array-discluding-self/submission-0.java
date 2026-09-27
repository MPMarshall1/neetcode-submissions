class Solution {
    public int[] productExceptSelf(int[] nums) {
        int countZero = 0;
        int product = 1;

        for (int num : nums) {
            product *= num;
            if (num==0) {countZero++;}
        }

        int[] products = new int[nums.length];

        if (countZero > 1) {return products;}

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0) {
                products[i] = product / nums[i];
            } else {
                int p = 1;
                for (int num : nums) {
                    if (num==0) {continue;}
                    p *= num;
                }
                products[i] = p;
            }
        }
        return products;
    }
}  
