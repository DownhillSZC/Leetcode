
public class Solution {
	public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] blocks = new boolean[9][9];
        //遍历一遍即可
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    int num = (int)board[i][j] - (int)('0');//得到char对应的int值
                    if(rows[i][num-1] || cols[i][num-1] || blocks[i/3 + (j/3)*3][num-1]){
                        return false;
                    }
                    else{
                        rows[i][num-1] = true;
                        cols[i][num-1] = true;
                        blocks[i/3 + (j/3)*3][num-1] = true;
                    }
                }
            }
        }
        
        return true;
    }
}
