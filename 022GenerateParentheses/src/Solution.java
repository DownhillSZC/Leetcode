import java.util.ArrayList;
import java.util.List;

public class Solution {
	 public List<String> generateParenthesis(int n) {
	      
	        List<String> ans = new ArrayList<>();
	        backtrack(ans, 0, 0, n, "");
	        return ans;
	    }
	    
	    public void backtrack(List<String> ans, int open, int close, int max, String temp ){
	        if(close == max){
	            ans.add(temp);
	            return;
	        }
	        
	        if(open < max){
	            backtrack(ans, open+1, close,  max, temp+"(");
	        }
	        if(close < open){
	             backtrack(ans, open, close+1, max, temp+")");
	        }
	        
	    }
}
