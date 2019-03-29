import java.util.*;
public class Solution {
	/**
	 * 去重思路:以[1,2,2]为例，可以要求index=1的数字2在最后生成的排列中一定要在index=2的数字2的前面,
	 * 强制规定了顺序，避免了重复。即先从小到大排序，使相同的数字聚在一起，若前后2个数字相同，访问后一个数字的时候，
	 * 前一个数字必须已经访问过了。只需添加一行代码
	 * @param nums
	 * @return
	 */
	public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        handle(nums, 0, result, new ArrayList<Integer>(), new boolean[nums.length]);
        return result;
    }
    
    public static void handle(int[] nums, int n, List<List<Integer>> result, List<Integer> temp, boolean[] visited){
        if(n == nums.length){
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1] && visited[i-1] == true) continue;
            if(!visited[i]){
                temp.add(nums[i]);
                visited[i] = true;
                handle(nums, n+1, result, temp, visited);
                temp.remove(temp.size()-1);
                visited[i] = false;
            }
        }
    }
}
