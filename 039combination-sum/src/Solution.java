import java.util.*;

public class Solution {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        process(result, candidates, target, new ArrayList<Integer>(), 0, 0);
        return result;
    }
    
    public void process(List<List<Integer>> result, int[] candidates, int target, ArrayList<Integer> temp, int sum, int num){
        if(sum == target){
            result.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=num; i<candidates.length; i++){
            if(sum+candidates[i] > target)
                continue;
            else{
                sum += candidates[i];
                temp.add(candidates[i]);
                process(result, candidates, target, temp, sum, i);
                sum -= candidates[i];
                temp.remove(temp.size()-1);
            }
        }
    }
}
