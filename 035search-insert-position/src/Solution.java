/**
 * 二分查找
 * @author szc
 *
 */
public class Solution {
	public int searchInsert(int[] nums, int target) {
        return search(0, nums.length-1, nums, target);
    }
    
    public int search(int s, int e, int[] nums, int target){
        if(s < e){
            int mid = (s+e) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) return search(s, mid-1, nums, target);
            else if(nums[mid] < target) return search(mid+1, e, nums, target);
        }
        if(nums[s] < target) return s+1;
        else return s;
    }
}
