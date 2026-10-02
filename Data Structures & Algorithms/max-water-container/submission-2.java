class Solution {
    public int maxArea(int[] heights) {
        int l = 0; int r = heights.length-1;
        
        int area = vol(heights, l, r);
        int max = area;

        while (l<r) {
            if (heights[l]<heights[r]) {l++;}
            else {r--;}

            area = vol(heights, l, r);
            max = Math.max(max, area);
        }
        return max;
    }

    public int vol(int[] heights, int left, int right) {
        return Math.min(heights[left], heights[right])*(right-left);
    }
}
