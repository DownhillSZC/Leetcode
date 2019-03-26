
public class Solution {
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int rows = obstacleGrid.length;
		int cols = obstacleGrid[0].length;
        int[][] dp = new int[rows][cols];
        for(int i=0; i<rows; i++){
        	dp[i][0] = 1;
        	if(obstacleGrid[i][0] == 1)
        		break;
        }
        for(int i=0; i<cols; i++){
        	dp[0][i] = 1;
        	if(obstacleGrid[0][i] == 1)
        		break;
        }
        for(int i=0; i<rows; i++){
        	for(int j=0; j<cols; j++){
        		if(i*j != 0){
        			if(obstacleGrid[i][j] == 1)
        				dp[i][j] = 0;
        			else
        				dp[i][j] = dp[i][j-1] + dp[i-1][j];
        		}
        	}
        }
        return dp[rows-1][cols-1];
    }
}
