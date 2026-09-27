class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); //value, freq

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        List<Integer> output = new ArrayList<>();

        while (k>0) {
            Map.Entry<Integer, Integer> maxEntry =
                map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

            if (maxEntry==null) {break;}

            output.add(maxEntry.getKey());
            map.remove(maxEntry.getKey());

            k--;
        }

        int[] arr = output.stream()
            .mapToInt(Integer::intValue)
            .toArray();

        return arr;
    }
}
