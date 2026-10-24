class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int l = 0;
        int r = m*n -1;

        while (l<=r) {
            int mid = (l+r)/2;
            System.out.println(mid);
            int x = mid / n ;
            int y = mid % n;
            int v = matrix[x][y];
            if (v==target) {return true;}
            if (v>target) {r=mid-1;}
            else {l=mid+1;}
        }
        return false;
    }
}
