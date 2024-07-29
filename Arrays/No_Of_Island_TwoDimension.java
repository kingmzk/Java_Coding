class No_Of_Island_TwoDimension {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    countDFS(grid, i, j);
                }
            }
        }
        return count;
    }

    public void countDFS(char[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0'; // Mark as visited

        // Explore all 4 directions
        countDFS(grid, i, j + 1); // right
        countDFS(grid, i, j - 1); // left
        countDFS(grid, i + 1, j); // down
        countDFS(grid, i - 1, j); // up
    }

    public static void main(String[] args) {
        No_Of_Island_TwoDimension sol = new No_Of_Island_TwoDimension();
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        System.out.println(sol.numIslands(grid));
    }
}
