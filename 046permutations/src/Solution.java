import java.util.*;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        handle(nums, 0, result, new ArrayList<Integer>());
        return result;
    }
    
    public void handle(int[] nums, int n, List<List<Integer>> result, List<Integer> temp){
        if(n == nums.length){
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=0; i<nums.length; i++){
        	if(temp.contains(nums[i])) continue;
        	temp.add(nums[i]);
            handle(nums, n+1, result, temp);
            temp.remove(nums.length-1);
        }
    }
}
