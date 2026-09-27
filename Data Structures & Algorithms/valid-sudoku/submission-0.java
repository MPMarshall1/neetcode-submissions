class Solution {
    public boolean isValidSudoku(char[][] board) {
        //rows
        for (int row = 0; row < 9; row++) {
            HashSet<Character> set = new HashSet<>();
            int count = 0;

            for (int col = 0; col < 9; col++) {
                char c = board[row][col];
                if (c != '.') {
                    set.add(c);
                    count++;
                }
            }

            if (set.size() != count) {return false;}
        }

        //rows
        for (int col = 0; col < 9; col++) {
            HashSet<Character> set = new HashSet<>();
            int count = 0;

            for (int row = 0; row < 9; row++) {
                char c = board[row][col];
                if (c != '.') {
                    set.add(c);
                    count++;
                }
            }

            if (set.size() != count) {return false;}
        }

        //sqaures
        for (int stRow = 0; stRow <= 6; stRow += 3) {
            for (int stCol = 0; stCol <= 6; stCol += 3) {
                HashSet<Character> set = new HashSet<>();
                int count = 0;

                for (int row = stRow; row < stRow+3; row++) {
                    for (int col = stCol; col < stCol+3; col++) {
                        char c = board[row][col];
                        if (c != '.') {
                            set.add(c);
                            count++;
                        }
                    }
                }

                if (set.size() != count) {return false;}
            }
        }
        return true;
    }
}
