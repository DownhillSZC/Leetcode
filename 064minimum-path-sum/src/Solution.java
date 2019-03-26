
public class Solution {
	public static int minPathSum(int[][] grid) {
		int rows = grid.length;
		int cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        for(int i=0; i<rows; i++)
        	for(int j=0; j<cols; j++)
        		dp[i][j] = grid[i][j];
        for(int i=0; i<rows; i++){
        	for(int j=0; j<cols; j++){
        		if(i==0 && j!=0)
        			dp[i][j] += dp[i][j-1];
        		else if(i!=0 && j==0)
        			dp[i][j] += dp[i-1][j];
        		else if(i!=0 && j!=0)
        			dp[i][j] += Math.min(dp[i-1][j], dp[i][j-1]);
        		System.out.print(dp[i][j] + " ");
        	}
        	System.out.println();
        }
        return dp[rows-1][cols-1];
    }
	
	public static void main(String args[]){
		int[][] grid = {{1,3,1},
				  		{1,5,1},
				  		{4,2,1}};
		System.out.println(minPathSum(grid));
	}
}
