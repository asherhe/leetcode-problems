/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start

// Strategy:
// Find the first "1", then "drown" the
// island with BFS, where a grid is
// "connected" to its direct neighbours
class Solution {
    // A map field so that input is easily
    // accessable
    private char[][] map;

    public int numIslands(char[][] grid) {
        // Copy over to field
        map = grid;
        // Keep track of island count
        int islands = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == '1') {
                    drownIslands(i, j);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void drownIslands(int x, int y) {
        if (x >= 0 && x < map.length && y >= 0 && y < map[0].length) {
            if (map[x][y] == '1') {
                map[x][y] = '0';
                drownIslands(x - 1, y);
                drownIslands(x + 1, y);
                drownIslands(x, y - 1);
                drownIslands(x, y + 1);
            }
        }
    }    
}
// @lc code=end

