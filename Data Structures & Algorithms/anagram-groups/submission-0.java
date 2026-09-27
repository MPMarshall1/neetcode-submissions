class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String sorted = getSort(str);

            if (map.containsKey(sorted)) {
                List<String> list = map.get(sorted);
                list.add(str);
                map.put(sorted, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sorted, list);
            }
        }

        return new ArrayList<>(map.values());
    }

    public String getSort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
