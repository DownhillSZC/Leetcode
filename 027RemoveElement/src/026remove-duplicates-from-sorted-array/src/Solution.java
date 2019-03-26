import java.util.HashSet;

public class Solution {
//	public static int removeDuplicates(int[] nums) {
//		if(nums.length==1) return 1;
//        HashSet<Integer> set = new HashSet<>();
//        int index = 0;
//        for(int i=0; i<nums.length; i++){
//        	if(!set.contains(nums[i])){
//        		set.add(nums[i]);
//        		nums[index++] = nums[i];
//        	}
//        }
//        return set.size();
//    }
	//答案利用排序数组 双指针
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            nums[++i] = nums[j];
	        }
	    }
	    return i + 1;
	}
	
	public static void main(String args[]){
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
	}
}
