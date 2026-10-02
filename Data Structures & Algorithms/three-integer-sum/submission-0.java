class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> output = new HashSet<>();

        for (int i = 0; i < nums.length-2; i++) {
            int j = i+1;
            int k = nums.length-1;

            int target = -nums[i];
            while (j<k) {
                int sum = nums[j] + nums[k];
                if (sum==target) {
                    output.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    j++; k--;
                } else if (sum<target) {j++;}
                else {k--;}
            }
        }

        return new ArrayList<>(output);
    }
}
