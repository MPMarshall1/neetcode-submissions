class Solution {

    public String encode(List<String> strs) {
        String output = "";

        for (String str : strs) {
            int len = str.length();

            String head = Integer.toString(len);
            if (len < 100) {head = "0"+head;}
            if (len < 10) {head = "0"+head;}

            output = output + head + str;
        }
        return output;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        while (!str.isEmpty()) {
            String head = str.substring(0, 3);
            int len = Integer.parseInt(head);
            str = str.substring(3);

            list.add(str.substring(0, len));
            str = str.substring(len);
        }
        return list;
    }
}
