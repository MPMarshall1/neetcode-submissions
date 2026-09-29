class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>(); //num, i
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int diff = target-numbers[i];
            if (map.containsKey(diff)) {
                int[] output = {i+1, 1+map.get(diff)};
                return output;
            }
        }

        return new int[2]; //shouldn't 
    }
}
